package Seminar2.figures;

public class Cylinder extends Solid {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius, Math.PI * radius * radius * height);
        this.height = height;
    }
}