package com.aheavenx.p13.impl;

import com.aheavenx.common.HttpRequestSender;
import com.aheavenx.common.Pair;
import com.aheavenx.p13.api.IpLookupProvider;

import java.io.IOException;

/**
 * @author Skovorodnikov
 *         Created on 23.05.2017 11:35
 */
public class IpApiProvider extends HttpRequestSender implements IpLookupProvider {

    private static final String API_PROVIDER_REQUEST = "http://ip-api.com/csv";

    public IpApiProvider(String proxyHost, int proxyPort) {
        super(proxyHost, proxyPort);
    }

    @Override
    public Pair<Double> getLatLonByIp() {
        try {
            String result = sendGetRecvString(API_PROVIDER_REQUEST);
            String[] parsed = result.split(",");

            if (!parsed[0].equals("success"))
                return null;

            return new Pair<>(Double.parseDouble(parsed[7]), Double.parseDouble(parsed[8]));

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
