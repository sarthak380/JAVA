
package com.app.gemetry;

public class Point2d {
    private double x;
    private double y;

    public Point2d(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String getDetails() {
        return "(" + x + ", " + y + ")";
    }

    public boolean isEqual(Point2d otherPoint) {
        return this.x == otherPoint.x && this.y == otherPoint.y;
    }

    public double calculateDistance(Point2d otherPoint) {
        double dx = this.x - otherPoint.x;
        double dy = this.y - otherPoint.y;
        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }
}
