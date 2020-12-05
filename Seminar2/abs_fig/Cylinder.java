package Seminar2.abs_fig;

import Seminar2.abs_fig.Solid;

public class Cylinder extends Solid {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    @Override
    public double getVolume() {
        return Math.PI * radius * radius * height;
    }
}