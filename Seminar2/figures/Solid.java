package Seminar2.figures;

public class Solid extends Shape {
    private double radius;

    public Solid(double radius, double volume) {
        super(volume);
        System.out.println("Значение объекта -- " + volume);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}