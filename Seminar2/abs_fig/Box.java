package Seminar2.abs_fig;
import Seminar2.abs_fig.Shape;
import java.util.ArrayList;


public class Box extends Shape {
    private double my_now;
    private ArrayList<Shape> box = new ArrayList<Shape>();
    private double volume;

    public Box(double my_now){
        this.volume = volume;
        this.my_now = my_now;

    }
    public boolean add(Shape shape){
        if (my_now>=shape.getVolume()){
            box.add(shape);
            my_now = my_now - shape.getVolume();
            System.out.println("Склад "+my_now);
            return true;
        } else {
            return false;
        }
    }
    @Override
    public double getVolume(){
        System.out.println("Значение "+volume);
        return volume;
    }
}