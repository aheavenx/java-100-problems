package com.aheavenx.p13.impl;

import com.aheavenx.common.HttpRequestSender;
import com.aheavenx.common.Pair;
import com.aheavenx.p13.api.GeocodingProvider;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;

/**
 * @author Skovorodnikov
 *         Created on 23.05.2017 12:19
 */
public class OSMGeocodingProvider extends HttpRequestSender implements GeocodingProvider {

    private static final String API_PROVIDER_REQUEST = "http://nominatim.openstreetmap.org/search?format=json&q=";
    private final JsonParser parser = new JsonParser();

    public OSMGeocodingProvider(String proxyHost, int proxyPort) {
        super(proxyHost, proxyPort);
    }

    @Override
    public Pair<Double> getLatLonByName(String name) {
        String fullQuery = API_PROVIDER_REQUEST + name.toLowerCase();
        try {
            String result = sendGetRecvString(fullQuery);
            JsonElement tree = parser.parse(result);
            JsonObject cityObject = tree.getAsJsonArray().get(0).getAsJsonObject();
            return new Pair<>(cityObject.get("lat").getAsDouble(), cityObject.get("lon").getAsDouble());

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
