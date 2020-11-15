package Seminar.Matrix;

public class Main{
    public static void main(String[] args){
        double[][] A = {{15,45,2,36},
                {1,25,3,4},
                {14,2,66,3},
                };
        double[][] B = {{25,1,7},
                {1,3,5},
                {4,6,9},};
        double[][] C ={{14,12,7},
                {34,35,36},
                {21,22,23}};
        double[][] D = {{12,8,9},
                {10,11,13},
                {89,97,92}};
        Matrix matrix1 = new Matrix(A);
        Matrix matrix2 = new Matrix(B);
        Matrix matrix3 = new Matrix(C);
        Matrix matrix4 = new Matrix(D);

        matrix1.show_matrix();
        matrix1.tmatrix();
        matrix4.tmatrix();
        matrix4.show_matrix();
        int degree = 3;
        Matrix d = new Matrix(C);
        for(int i =0; i<degree-1; i++){
            if (i==0){
                d = Matrix.multiply(matrix3,matrix3);
            }
            if (i>0){
                d = Matrix.multiply(d,matrix3);
            }

        }

        if (d!=null){
            System.out.println("e) Возведено в степень!");
            d.show_matrix();
        }
        d = Matrix.numeric_matrix(matrix1, 3);
        d.show_matrix();

        Matrix a = Matrix.multiply(matrix1,matrix2);
        Matrix b = Matrix.add_substract(matrix1,matrix2,true);
        if (a!=null){
            System.out.println("c) Матрицы успешно перемножены!");
            a.show_matrix();
        }

        Matrix f = Matrix.add_substract(matrix3,matrix4,true);
        Matrix e = Matrix.add_substract(matrix3,matrix4,false);
        if (f!=null){
            System.out.println("c) Матрицы успешно сложены/вычтены!");
            f.show_matrix();
            e.show_matrix();
        }
    }
}
