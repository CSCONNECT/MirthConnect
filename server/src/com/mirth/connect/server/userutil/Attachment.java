/*
 * Copyright (c) Mirth Corporation. All rights reserved.
 * 
 * http://www.mirthcorp.com
 * 
 * The software in this package is published under the terms of the MPL license a copy of which has
 * been included with this distribution in the LICENSE.txt file.
 */

package com.mirth.connect.server.userutil;

import org.apache.log4j.Logger;

/**
 * Used to store and retrieve details about message attachments such as the ID, MIME type, and
 * content.
 */
public class Attachment {
    private String id;
    private byte[] content;
    private String type;
    private Logger logger = Logger.getLogger(getClass());

    /**
     * Instantiates a new Attachment with no ID, content, or MIME type.
     */
    public Attachment() {}

    /**
     * Instantiates a new Attachment.
     * 
     * @param id
     *            The unique ID of the attachment.
     * @param content
     *            The content (byte array) to store for the attachment.
     * @param type
     *            The MIME type of the attachment.
     */
    public Attachment(String id, byte[] content, String type) {
        this.id = id;
        this.content = content;
        this.type = type;
    }

    /**
     * Returns the unique replacement token for the attachment. This token should replace the
     * attachment content in the message string, and will be used to re-attach the attachment
     * content in the outbound message before it is sent to a downstream system.
     */
    public String getAttachmentId() {
        return "${ATTACH:" + id + "}";
    }

    /**
     * Sets the unique ID for the attachment.
     * 
     * @param attachmentId
     *            The unique ID to use for the attachment.
     * 
     * @deprecated This method is deprecated and will soon be removed. Please use setId(id) instead.
     */
    // TODO: Remove in 3.1
    public void setAttachmentId(String attachmentId) {
        logger.error("The Attachment.setAttachmentId(attachmentId) method is deprecated and will soon be removed. Please use setId(id) instead.");
        setId(attachmentId);
    }

    /**
     * Returns the unique ID for the attachment.
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the unique ID for the attachment.
     * 
     * @param id
     *            The unique ID to use for the attachment.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Returns the content of the attachment as a byte array.
     * 
     * @deprecated This method is deprecated and will soon be removed. Please use getContent()
     *             instead.
     */
    // TODO: Remove in 3.1
    public byte[] getData() {
        logger.error("The Attachment.getData() method is deprecated and will soon be removed. Please use getContent() instead.");
        return getContent();
    }

    /**
     * Sets the content of the attachment.
     * 
     * @param data
     *            The content (byte array) to use for the attachment.
     * 
     * @deprecated This method is deprecated and will soon be removed. Please use
     *             setContent(content) instead.
     */
    // TODO: Remove in 3.1
    public void setData(byte[] data) {
        logger.error("The Attachment.setData(data) method is deprecated and will soon be removed. Please use setContent(content) instead.");
        setContent(data);
    }

    /**
     * Returns the content of the attachment as a byte array.
     */
    public byte[] getContent() {
        return content;
    }

    /**
     * Sets the content of the attachment.
     * 
     * @param content
     *            The content (byte array) to use for the attachment.
     */
    public void setContent(byte[] content) {
        this.content = content;
    }

    /**
     * Returns the number of bytes in the attachment content.
     * 
     * @deprecated This method is deprecated and will soon be removed. Please use
     *             getContent().length instead.
     */
    // TODO: Remove in 3.1
    public int getSize() {
        logger.error("The Attachment.getSize() method is deprecated and will soon be removed. Please use getContent().length instead.");
        return content != null ? content.length : 0;
    }

    /**
     * @deprecated The Attachment.setSize(size) method is deprecated and will soon be removed. This
     *             method no longer does anything.
     */
    // TODO: Remove in 3.1
    public void setSize(int size) {
        logger.error("The Attachment.setSize(size) method is deprecated and will soon be removed. This method no longer does anything.");
    }

    /**
     * Returns the MIME type of the attachment.
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the MIME type for the attachment.
     * 
     * @param type
     *            The MIME type to set for the attachment.
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @deprecated The Attachment.getMessageId() method is deprecated and will soon be removed. This
     *             method always returns an empty string.
     */
    // TODO: Remove in 3.1
    public String getMessageId() {
        logger.error("The Attachment.getMessageId() method is deprecated and will soon be removed. This method always returns an empty string.");
        return "";
    }

    /**
     * @deprecated The Attachment.setMessageId(messageId) method is deprecated and will soon be
     *             removed. This method no longer does anything.
     */
    // TODO: Remove in 3.1
    public void setMessageId(String messageId) {
        logger.error("The Attachment.setMessageId(messageId) method is deprecated and will soon be removed. This method no longer does anything.");
    }
}