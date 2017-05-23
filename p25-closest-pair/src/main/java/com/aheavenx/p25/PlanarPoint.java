package com.aheavenx.p25;

/**
 * Created 22.05.2017 21:36
 * by Alex
 */
public class PlanarPoint {

    private double x;
    private double y;

    double getLength(PlanarPoint that) {
        return Math.sqrt((that.getX() - this.x) * (that.getX() - this.x) + (that.getY() - this.y) * (that.getY() - this.y));
    }

    double getX() {
        return x;
    }

    double getY() {
        return y;
    }

    PlanarPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public PlanarPoint() {
        this.x = 0;
        this.y = 0;
    }

    @Override
    public String toString() {
        return "x = " + x + ", y = " + y;
    }
}
