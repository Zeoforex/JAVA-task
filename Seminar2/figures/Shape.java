package Seminar2.figures;

public class Shape {
    // Наследники его это Pyramid,Solid,Box
    private double volume;

    public Shape(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }
}