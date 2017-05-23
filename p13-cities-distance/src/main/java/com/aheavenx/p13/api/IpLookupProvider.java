package com.aheavenx.p13.api;

import com.aheavenx.common.Pair;

/**
 * @author Skovorodnikov
 *         Created on 23.05.2017 11:30
 */
public interface IpLookupProvider {
    Pair<Double> getLatLonByIp();
}
