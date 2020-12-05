package Seminar2.abs_fig;

import Seminar2.abs_fig.Shape;

abstract class Solid extends Shape {
    protected double radius;

    public Solid(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}