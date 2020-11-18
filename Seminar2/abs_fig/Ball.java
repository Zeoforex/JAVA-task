package Seminar2.abs_fig;

public class Ball extends Solid {
    @Override
    public double getVolume(){
        return Math.PI * Math.pow(radius, 3) * 4 / 3;
    }

    public Ball(double radius){
        super(radius);
    }
}