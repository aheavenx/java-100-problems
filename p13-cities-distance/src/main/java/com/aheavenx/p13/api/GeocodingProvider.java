package com.aheavenx.p13.api;

import com.aheavenx.common.Pair;

/**
 * @author Skovorodnikov
 *         Created on 23.05.2017 12:16
 */
public interface GeocodingProvider {
    Pair<Double> getLatLonByName(String name);
}
