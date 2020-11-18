package Seminar2.figures;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Box box = new Box(1250);
        Scanner scanner = new Scanner(System.in);
        boolean r = true;
        int zz = 0;
        while (true){
            zz= zz + 1;
            System.out.println("Введите тип фигурки ");
            String state = scanner.next();
            switch (state){
                case "шар":
                    System.out.println("Введите радиус");
                    double radius = scanner.nextDouble();
                    Ball ball = new Ball(radius);
                    r = box.add(ball);
                    break;
                case "пирамида":
                    System.out.println("Введите площадь ");
                    double s = scanner.nextDouble();
                    System.out.println("Введи высоту");
                    double h = scanner.nextDouble();
                    Pyramid pyramid = new Pyramid(s,h);
                    r = box.add(pyramid);
                    break;

                case "цилиндр":
                    System.out.println("Введите высоту");
                    h = scanner.nextDouble();
                    System.out.println("Введите радиус");
                    radius = scanner.nextDouble();
                    Cylinder cylinder = new Cylinder(h,radius);
                    r = box.add(cylinder);
                    break;

                default:
                    break;
            }
            if (!r) {
                System.out.println("Переполнен"+zz);
                break;
            }
        }
    }
}
