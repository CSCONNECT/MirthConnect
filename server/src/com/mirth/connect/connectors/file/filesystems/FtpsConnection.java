/*
 * Copyright (c) Mirth Corporation. All rights reserved.
 * 
 * http://www.mirthcorp.com
 * 
 * The software in this package is published under the terms of the MPL license a copy of which has
 * been included with this distribution in the LICENSE.txt file.
 */

package com.mirth.connect.connectors.file.filesystems;

import com.mirth.connect.connectors.file.filters.RegexFilenameFilter;
import org.apache.commons.io.filefilter.WildcardFileFilter;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.net.ftp.*;

import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * The FileSystemConnection class for files accessed via FTPs.
 */
public class FtpsConnection implements FileSystemConnection {

	public class FtpsFileInfo implements FileInfo {

		String thePath;
		FTPFile theFile;

		public FtpsFileInfo(String path, FTPFile theFile) {
			this.thePath = path;
			this.theFile = theFile;
		}

		public long getLastModified() {
			return theFile.getTimestamp().getTimeInMillis();
		}

		public String getName() {
			return theFile.getName();
		}

		/** Gets the absolute pathname of the file */
		public String getAbsolutePath() {

			return getParent() + "/" + getName();
		}

		public String getCanonicalPath() throws IOException {
		    throw new UnsupportedOperationException();
        }

		/** Gets the absolute pathname of the directory holding the file */
		public String getParent() {

			return this.thePath;
		}

		public long getSize() {
			return theFile.getSize();
		}

		public boolean isDirectory() {
			return theFile.isDirectory();
		}

		public boolean isFile() {
			return theFile.isFile();
		}

		public boolean isReadable() {
			return true;
			// return theFile.hasPermission(access, permission);
		}

	}

	private static transient Log logger = LogFactory.getLog(FtpsConnection.class);

	/** The apache commons FTP client instance */
	private FTPClient client = null;

	public FtpsConnection(String host, int port, String username, String password, boolean passive, int timeout) throws Exception {
        String protocol = "SSL";
        client = new FTPSClient(protocol, true);
		
		// This sets the timeout for the initial connection.
		client.setConnectTimeout(timeout);
		
		try {
			if (port > 0) {
				client.connect(host, port);
			} else {
				client.connect(host);
			}
			
			// XXX: As per JavaDoc comments, you should only call this after the connection has been opened by connect()
			client.setSoTimeout(timeout);
			
			if (!FTPReply.isPositiveCompletion(client.getReplyCode())) {
				throw new IOException("Ftps error: " + client.getReplyCode());
			}
			if (!client.login(username, password)) {
				throw new IOException("Ftps error: " + client.getReplyCode());
			}
			if (!client.setFileType(FTP.BINARY_FILE_TYPE)) {
				throw new IOException("Ftps error");
			}
			if (passive) {
				client.enterLocalPassiveMode();
			}
		} catch (Exception e) {
			if (client.isConnected()) {
				client.disconnect();
			}
			throw e;
		}
	}

	@Override
	public List<FileInfo> listFiles(String fromDir, String filenamePattern, boolean isRegex, boolean ignoreDot) throws Exception {
        FilenameFilter filenameFilter;
        
        if (isRegex) {
            filenameFilter = new RegexFilenameFilter(filenamePattern);    
        } else {
            filenameFilter = new WildcardFileFilter(filenamePattern.trim().split("\\s*,\\s*"));
        }
	    
		if (!cwd(fromDir)) {
			logger.error("listFiles.changeWorkingDirectory: " + client.getReplyCode() + "-" + client.getReplyString());
			throw new IOException("Ftps error: " + client.getReplyCode());
		}

		FTPFile[] files = client.listFiles();
		if (!FTPReply.isPositiveCompletion(client.getReplyCode())) {
			logger.error("listFiles.listFiles: " + client.getReplyCode() + "-" + client.getReplyString());
			throw new IOException("Ftps error: " + client.getReplyCode());
		}
		
		if (files == null || files.length == 0) {
			return new ArrayList<FileInfo>();
		}
		
		List<FileInfo> v = new ArrayList<FileInfo>(files.length);
		
		for (int i = 0; i < files.length; i++) {
			if ((files[i] != null) && files[i].isFile()) {
				if ((filenameFilter == null || filenameFilter.accept(null, files[i].getName())) && !(ignoreDot && files[i].getName().startsWith("."))) {
				        v.add(new FtpsFileInfo(fromDir, files[i]));
				}
			}
		}
		return v;
	}
	
	@Override
    public List<String> listDirectories(String fromDir) throws Exception {
        List<String> directories = new ArrayList<String>();
        
        if (!cwd(fromDir)) {
            logger.error("listFiles.changeWorkingDirectory: " + client.getReplyCode() + "-" + client.getReplyString());
            throw new IOException("Ftps error: " + client.getReplyCode());
        }

        FTPFile[] ftpDirectories = client.listDirectories();
        if (!FTPReply.isPositiveCompletion(client.getReplyCode())) {
            logger.error("listFiles.listFiles: " + client.getReplyCode() + "-" + client.getReplyString());
            throw new IOException("Ftps error: " + client.getReplyCode());
        }
        
        for (FTPFile directory : ftpDirectories) {
            if (directory != null) {
                directories.add(new FtpsFileInfo(fromDir, directory).getAbsolutePath());
            }
        }
        
        return directories;
    }
	
    @Override
    public boolean exists(String file, String path) {
        try {
            FTPFile[] files = client.listFiles(path + "/" + file);
            return ((files != null) && (files.length == 1));
        } catch (IOException e) {
            return false;
        }
    }

	@Override
	public boolean canRead(String readDir) {
	    try {
	        return cwd(readDir);
	    } catch (IOException e) {
	        return false;
	    }
	}
	
	@Override
	public boolean canWrite(String writeDir) {
        try {
            return cwd(writeDir);
        } catch (IOException e) {
            return false;
        }
	}

    // See MIRTH-1873
    private boolean cwd(String destDir) throws IOException {
        return client.changeWorkingDirectory(destDir);
    }
	
	@Override
	public InputStream readFile(String file, String fromDir)
		throws Exception
	{
		if (!cwd(fromDir)) {
			logger.error("readFile.changeWorkingDirectory: " + client.getReplyCode() + "-" + client.getReplyString());
			throw new IOException("Ftps error: " + client.getReplyCode());
		}

		return client.retrieveFileStream(file);
	}

	/** Must be called after readFile when reading is complete */
	@Override
	public void closeReadFile() throws Exception {
		if (!client.completePendingCommand()) {
			logger.error("closeReadFile.completePendingCommand: " + client.getReplyCode() + "-" + client.getReplyString());
			throw new IOException("Ftps error: " + client.getReplyCode());
		}
	}

	@Override
	public boolean canAppend() {

		return true;
	}
	
	@Override
	public void writeFile(String file, String toDir, boolean append, InputStream is)
		throws Exception
	{
		cdmake(toDir);
		
		if (append) {
		    client.appendFile(file, is);
		} else {
		    client.storeFile(file, is);    
		}
		
		// have to close it since append or store don't close the stream
		is.close();
		
	    // check the reply code to verify success
        if (!FTPReply.isPositiveCompletion(client.getReplyCode())) {
            logger.error("writeFile: " + client.getReplyString());
            throw new IOException(client.getReplyString());
        }
	}

	@Override
	public void delete(String file, String fromDir, boolean mayNotExist)
		throws Exception
	{
		if (!cwd(fromDir)) {
			if (!mayNotExist) {
				logger.error("delete.changeWorkingDirectory: " + client.getReplyCode() + "-" + client.getReplyString());
				throw new IOException("Ftps error: " + client.getReplyCode());
			} else {
				return;
			}
		}

		boolean deleteSucceeded = client.deleteFile(file);
		if (!deleteSucceeded) {
			if (!mayNotExist) {
				logger.error("delete.deleteFile: " + client.getReplyCode() + "-" + client.getReplyString());
				throw new IOException("Ftps error: " + client.getReplyCode());
			}
		}
	}

	private void cdmake(String dir) throws Exception {
		if (!cwd(dir)) {
			if (!client.makeDirectory(dir)) {
				String tempDir = dir;
				
				if (tempDir.startsWith("/")) {
				    // strip the first forward slash
					tempDir = tempDir.substring(1);
					
					// cd into the base directory
					if (!client.changeWorkingDirectory("/")) {
						throw new Exception("Unable to change to destination directory: /");
					}
				}

				String[] dirs = tempDir.split("/");

				if (dirs.length > 0) {
					for (int i = 0; i < dirs.length; i++) {
						if (!client.changeWorkingDirectory(dirs[i])) {
							logger.debug("Making directory: " + dirs[i]);
							
							if (!client.makeDirectory(dirs[i])) {
								throw new Exception("Unable to make destination directory: " + dirs[i]);
							}
							
							if (!client.changeWorkingDirectory(dirs[i])) {
								throw new Exception("Unable to change to destination directory: " + dirs[i]);
							}
						}
					}
				}
			} else if (!cwd(dir)) {
				throw new Exception("Unable to change to destination directory: " + dir);
			}
		}
	}

	@Override
	public void move(String fromName, String fromDir, String toName, String toDir) throws Exception {
		cwd(fromDir); // start in the read directory
		cdmake(toDir);

		try {
			client.deleteFile(toName);
		} catch (Exception e) {
			logger.info("Unable to delete destination file");
		}

		if (!cwd(fromDir)) {
			throw new Exception("Unable to change to directory: " + fromDir.substring(1) + "/");
		}

		boolean renameSucceeded = client.rename(fromName.replaceAll("//", "/"), (toDir + "/" + toName).replaceAll("//", "/"));
		if (!renameSucceeded) {
			logger.error("move.rename: " + client.getReplyCode() + "-" + client.getReplyString());
			throw new IOException("Ftps error: " + client.getReplyCode());
		}
	}

	@Override
	public boolean isConnected() {
		
		if (client != null) {
			return client.isConnected();
		}
		else {
			return false;
		}
	}

	// **************************************************
	// Lifecycle methods
	
	@Override
	public void activate() {

	}

	@Override
	public void passivate() {

	}

	@Override
	public void destroy() {
		try{
			client.logout();
			client.disconnect();
		} catch (Exception e){
			logger.debug(e);
		}
	}

	@Override
	public boolean isValid() {
		try {
			client.sendNoOp();
			return true;
		} catch (IOException e) {
			return false;
		}
	}
}
