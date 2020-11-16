package Seminar2.Vector;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        double x1 = 2;
        double y1 = 4;
        double z1 = 1.2;
        double x2 = 3.6;
        double y2 = 4.5;
        double z2 = 7;

        Scanner scanner = new Scanner(System.in);
        Vector_code first_vector = new Vector_code(x1, y1, z1);
        double length_v1 = first_vector.length_vector();
        System.out.println("b) Длина вектора равна " + length_v1);

        Vector_code second_vector = new Vector_code(x2, y2, z2);
        double scalar = Vector_code.scalar_vectors(first_vector, second_vector);
        double length_v2 = second_vector.length_vector();
        System.out.println("c) Скалярное произведение двух векторов равно" + scalar);


    }
}
