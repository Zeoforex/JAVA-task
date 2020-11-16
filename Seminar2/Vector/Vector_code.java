package Seminar2.Vector;
import java.util.Arrays;

public class Vector_code {
    private double x;
    private double y;
    private double z;

    public Vector_code (double x,double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double length_vector() {
        return Math.sqrt(x*x+y*y+z*z);
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }
    public static double scalar_vectors(Vector_code first_vector, Vector_code second_vector){
        return first_vector.getX()*second_vector.getX()+first_vector.getY()*second_vector.getY()+first_vector.getZ()*second_vector.getZ();
    }

    public static Vector_code actions(Vector_code first_vector, Vector_code second_vector, int flag){
        switch (flag){
            case 1:
                String sum_1 = Double.toString(first_vector.getX()+second_vector.getX());
                String sum_2 = Double.toString(first_vector.getY()+second_vector.getY());
                String sum_3 = Double.toString(first_vector.getZ()+second_vector.getZ());
                System.out.println("f) Сумма векторов равна (" + sum_1 + "," + sum_2 + "," +sum_3 + ")");
                return new Vector_code(first_vector.getX()+second_vector.getX(),first_vector.getY()+second_vector.getY(),first_vector.getZ()+second_vector.getZ());

            case 2:
                String take_1 = Double.toString(first_vector.getX()-second_vector.getX());
                String take_2 = Double.toString(first_vector.getY()-second_vector.getY());
                String take_3 = Double.toString(first_vector.getZ()-second_vector.getZ());
                System.out.println("f) Разность векторов равна (" + take_1 + "," + take_2 + "," +take_3 + ")");
                return new Vector_code(first_vector.getX()-second_vector.getX(),first_vector.getY()-second_vector.getY(),first_vector.getZ()-second_vector.getZ());

            case 3:
                String multi

        }

    }

}
