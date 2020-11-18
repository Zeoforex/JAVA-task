package Seminar2.abs_fig;
import Seminar2.abs_fig.Shape;

public class Pyramid extends Shape {
    private double s;
    private double h;

    public Pyramid(double s, double h){
        this.s = s;
        this.h = h;
    }
    @Override
    public double getVolume(){
        return h * s * 4 / 3;
    }
}