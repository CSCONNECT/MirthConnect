/*
 * User: ebellinger
 * Date: 6/14/2012
 * Time: 1:48 PM
 *
 */
using System;
using System.Collections.Generic;
using System.IO;
using System.Windows.Forms;
using System.Diagnostics;
using System.Management;
using System.Reflection;
using System.Security.Permissions;
using System.Threading;
using System.Xml;
using System.Xml.Linq;
using System.Linq;
using System.Data;
using System.ComponentModel;

using log4net;
using log4net.Config;

namespace EncaptureMD
{
	public class Mirth
	{
		private static readonly ILog log = LogManager.GetLogger(System.Reflection.MethodBase.GetCurrentMethod().DeclaringType);

		#region Mirth
		public Mirth()
		{
			if(log.IsDebugEnabled)
				log.Debug("initializing Mirth Connect Service");
		}

		public void Start()
		{
			if(log.IsDebugEnabled)
				log.Debug("starting Mirth Connect Service");

			try
			{
				string home = System.IO.Path.GetDirectoryName(System.Reflection.Assembly.GetEntryAssembly().Location);

				string launcherEXE = home + @"\Mirth_Launcher.exe";

				if(log.IsDebugEnabled)
					log.Debug("launcherEXE: " + launcherEXE);

				Process p = new Process();
				p.StartInfo.UseShellExecute = false;
				p.StartInfo.RedirectStandardOutput = true;
				p.StartInfo.WindowStyle = ProcessWindowStyle.Hidden;
				p.StartInfo.CreateNoWindow = true;
				p.StartInfo.FileName = launcherEXE;
				p.Start();
			}
			catch(Exception ex)
			{
				log.Error("Exception starting Mirth Connect Service.");
			}
		}

		public void Stop()
		{
			if(log.IsDebugEnabled)
				log.Debug("stopping Mirth Connect Service");

			try
			{
				Process[] prs = Process.GetProcesses();
				foreach (Process pr in prs)
				{
					if (pr.ProcessName == "Mirth_Launcher")
					{
						pr.Kill();
					}
				}
			}
			catch(Exception ex)
			{
				log.Error("Exception stopping Mirth Connect Service.");
			}
		}
        #endregion

	}

}