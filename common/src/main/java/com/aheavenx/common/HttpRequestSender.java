package com.aheavenx.common;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.util.logging.Logger;

/**
 * @author Skovorodnikov
 *         Created on 23.05.2017 11:37
 */
//todo: refactor proxying

public class HttpRequestSender {

    private static Logger logger = Logger.getLogger(HttpRequestSender.class.getSimpleName());

    private Proxy proxy;

    public HttpRequestSender(String proxyHost, int proxyPort) {
        if (proxyHost == null)
            this.proxy = null;
        else
            this.proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(proxyHost, proxyPort));

    }

    protected String sendGetRecvString(String request) throws IOException {
        URL object;

        try {
            object = new URL(request);
        } catch (MalformedURLException e) {
            logger.warning("The request is malformed, aborting...");
            return null;
        }

        HttpURLConnection connection =
                ((HttpURLConnection) (proxy == null ? object.openConnection() : object.openConnection(proxy)));
        connection.setRequestMethod("GET");
        connection.setRequestProperty("User-Agent", "Mozilla/5.0");
        logger.info("Sending request to " + request);

        int responseCode;
        try {
            responseCode = connection.getResponseCode();
        }
        catch (ConnectException timeout) {
            logger.warning("Connection timed out");
            return null;
        }
        if (responseCode != 200) {
            logger.warning("The request was rejected with error " + request);
            return null;
        }
        logger.info("Request handling...");

        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String inputLine;
        StringBuilder response = new StringBuilder();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        logger.info("Request handled successfully");

        return response.toString();
    }
}
