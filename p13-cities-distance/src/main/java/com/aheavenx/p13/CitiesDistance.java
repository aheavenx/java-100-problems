package com.aheavenx.p13;

import com.aheavenx.common.Pair;
import com.aheavenx.p13.api.GeocodingProvider;
import com.aheavenx.p13.api.IpLookupProvider;
import com.aheavenx.p13.impl.IpApiProvider;
import com.aheavenx.p13.impl.OSMGeocodingProvider;
import java.util.Scanner;
import java.util.logging.Logger;
import static java.lang.Math.*;

/**
 * @author Skovorodnikov
 *         Created on 23.05.2017 11:26
 */
public class CitiesDistance {

    private IpLookupProvider geoIp = new IpApiProvider("proxy-mir.lanit", 3128);
    private GeocodingProvider geoCoder = new OSMGeocodingProvider("proxy-mir.lanit", 3128);
    private static Logger logger = Logger.getLogger(CitiesDistance.class.getSimpleName());

    private static double distFrom(double lat1, double lng1, double lat2, double lng2) {
        double earthRadius = 6371000; //meters
        double dLat = toRadians(lat2 - lat1);
        double dLng = toRadians(lng2 - lng1);
        double a = sin(dLat/2) * sin(dLat/2) +
                cos(toRadians(lat1)) * cos(toRadians(lat2)) *
                        sin(dLng/2) * sin(dLng/2);
        double c = 2 * atan2(sqrt(a), sqrt(1-a));
        return earthRadius * c;
    }

    public static void main(String[] args) {
        CitiesDistance citiesDistance = new CitiesDistance();
        logger.info("Retreiving current location...");
        Pair<Double> currentLatLon = citiesDistance.geoIp.getLatLonByIp();
        logger.info("Location retreived: " + currentLatLon);

        System.out.println("Please enter the search query for a place to find a distance: ");
        Scanner sc = new Scanner(System.in);
        String query = sc.nextLine();
        logger.info("Retreiving query location...");
        Pair<Double> otherLatLon = citiesDistance.geoCoder.getLatLonByName(query);
        logger.info("Location retreived: " + otherLatLon);

        logger.info("Calculating distance...");
        System.out.printf("Your distance is: %.3f meters",
                distFrom(
                        currentLatLon.fst(), currentLatLon.snd(),
                        otherLatLon.fst(), otherLatLon.snd())
        );


    }
}
