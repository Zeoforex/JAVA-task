package Seminar2.Vector;


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
                String multi_1 = Double.toString(first_vector.getY()*second_vector.getZ()-first_vector.getZ()*second_vector.getY());
                String multi_2 = Double.toString(first_vector.getZ()* second_vector.getX()- first_vector.getX()* second_vector.getZ());
                String multi_3 = Double.toString(first_vector.getX()* second_vector.getY()- first_vector.getY()* second_vector.getX());
                System.out.println("d) Векторное произведение векторов"+multi_1 + "," +multi_2+","+multi_3+")");
                return new Vector_code(first_vector.getY()* second_vector.getZ()- first_vector.getZ()* second_vector.getY(),
                        first_vector.getZ()* second_vector.getX()- first_vector.getX()* second_vector.getZ(),
                        first_vector.getX()* second_vector.getY()- first_vector.getY()* second_vector.getX());

            default:
                return new Vector_code(0,0,0);
        }

    }
    public static Vector_code[] vector_g(int n){
        Vector_code[] vector_g = new Vector_code[n];
        for (int i=0; i<n; i++){
            vector_g[n] = new Vector_code(Math.random(),Math.random(),Math.random());
        }

        return vector_g;
    }
    public static void print_my_vectors(Vector_code [] vector_g){
        System.out.println("Наши вектора с заданным размером n");
        for (int i=0; i<vector_g.length; i++){
            System.out.println("x: "+vector_g[i].getX()+"; y: "+vector_g[i].getY()+"; z: "+vector_g[i].getZ());
        }
    }

}
