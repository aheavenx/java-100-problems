package com.aheavenx.p25;

import java.util.Arrays;

/**
 * Created 22.05.2017 21:36
 * by Alex
 */
public class ClosestPair {

    private final PlanarPoint[] points = {
            new PlanarPoint(-1.1, -1.1),
            new PlanarPoint(.0, .0),
            new PlanarPoint(1., .0),
            new PlanarPoint(2., -1.),
    };

    private Pair<PlanarPoint> getClosestPair(PlanarPoint[] points) {
        Arrays.sort(points, (p1, p2) -> p1.getX() > p2.getX() ? 1 : -1);
        double min = Double.MAX_VALUE;
        Pair<PlanarPoint> result = new Pair<>(null, null);
        for (int i = 0; i < points.length; i++)
            for (int j = i + 1; j < points.length; j++) {
            double distance = points[i].getLength(points[j]);
                if (distance < min) {
                    min = distance;
                    result = new Pair<>(points[i], points[j]);
                }
            }
        return result;
    }

    public static void main(String[] args) {
        ClosestPair worker = new ClosestPair();
        System.out.println(worker.getClosestPair(worker.points));
    }
}
