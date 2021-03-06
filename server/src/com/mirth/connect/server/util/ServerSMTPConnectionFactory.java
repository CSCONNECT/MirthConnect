/*
 * Copyright (c) Mirth Corporation. All rights reserved.
 * 
 * http://www.mirthcorp.com
 * 
 * The software in this package is published under the terms of the MPL license a copy of which has
 * been included with this distribution in the LICENSE.txt file.
 */

package com.mirth.connect.server.util;

import com.mirth.connect.model.ServerSettings;
import com.mirth.connect.server.controllers.ControllerException;
import com.mirth.connect.server.controllers.ControllerFactory;

public class ServerSMTPConnectionFactory {
    public static ServerSMTPConnection createSMTPConnection() throws ControllerException {
        ServerSettings settings = ControllerFactory.getFactory().createConfigurationController().getServerSettings();
        return new ServerSMTPConnection(settings.getSmtpHost(), settings.getSmtpPort(), settings.getSmtpTimeout(), settings.getSmtpAuth(), settings.getSmtpSecure(), settings.getSmtpUsername(), settings.getSmtpPassword(), settings.getSmtpFrom());
    }
}
