package Seminar2.figures;

public class Ball extends Solid {
    Ball(double radius){
        super(radius, Math.PI*Math.pow(radius,3)*4/3);
    }
}