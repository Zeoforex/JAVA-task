package Seminar2.figures;

import java.util.ArrayList;

public class Box extends Shape {
    private double my_now;
    private ArrayList<Shape> box = new ArrayList<Shape>();

    public Box(double my_now) {
        super(my_now);
        this.my_now = my_now;

    }

    public boolean add(Shape shape) {
        if (my_now >= shape.getVolume()) {
            box.add(shape);
            my_now = my_now - shape.getVolume();
            System.out.println("Склад " + my_now);
            return true;
        } else {
            return false;
        }
    }
}