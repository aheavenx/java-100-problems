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

    private Pair<PlanarPoint> getClosestPairRecursive(PlanarPoint[] l, PlanarPoint[] r, Pair<PlanarPoint> results) {
        if ((l.length == 1) || (r.length == 1)) {
            double thisLength = l[0].getLength(r[0]), thatLength = results.fst().getLength(results.snd());
            return thisLength < thatLength ? new Pair<>(l[0], r[0]) : results;
        }
        Pair<PlanarPoint> left = getClosestPairRecursive(
                        Arrays.copyOfRange(l, 0, l.length / 2),
                        Arrays.copyOfRange(l, l.length / 2, l.length),
                        results);
        Pair<PlanarPoint> right = getClosestPairRecursive(
                        Arrays.copyOfRange(r, 0, r.length / 2),
                        Arrays.copyOfRange(r, r.length / 2, l.length),
                        results);
        return left.fst().getLength(left.snd()) < right.fst().getLength(right.snd()) ? left : right;
    }

    public Pair<PlanarPoint> getClosestPair(PlanarPoint[] points) {
        Arrays.sort(points, (p1, p2) -> p1.getX() > p2.getX() ? 1 : -1);
        return getClosestPairRecursive(Arrays.copyOfRange(points, 0, points.length / 2), Arrays.copyOfRange(points, points.length / 2, points.length), new Pair<>(new PlanarPoint(1e-10, 1e-10), new PlanarPoint(1e10, 1e10)));
    }

    public static void main(String[] args) {
        ClosestPair worker = new ClosestPair();
        System.out.println(worker.getClosestPair(worker.points));
    }
}
