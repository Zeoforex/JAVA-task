package Seminar2.Matrix;

import java.util.Arrays;

public class Matrix {
    private double[][] matrix;
    private int n; //это строка
    private int m; //это столбец

    public Matrix(double[][] matrix) {
        this.matrix = matrix;
        this.n = matrix.length;
        this.m = matrix[0].length;
    }

    public Matrix tmatrix() {
        System.out.println("d) Транспонированная матрица: ");
        double[][] t_matrix = new double[m][n]; //поменяли параметры местами и теперь она транспонированная
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                t_matrix[i][j] = t_matrix[j][i];
            }
        }
        return new Matrix(t_matrix);
    }

    public void show_matrix() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

            }
            System.out.println(Arrays.toString(matrix[i])); //строковое представление для вывода элементов
        }

    }

    public int getM() {
        return m;
    }

    public int getN() {
        return n;
    }

    public double getElement(int n, int m) {
        return matrix[n][m];
    }

    public static Matrix multiply(Matrix matrix1, Matrix matrix2) {
        if (matrix1.getM() == matrix2.getN() && matrix1.getN() == matrix2.getM()) {
            double[][] m_matrix = new double[matrix1.getN()][matrix2.getM()];
            for (int i = 0; i < matrix1.getN(); i++) {
                for (int j = 0; j < matrix2.getM(); j++) {
                    for (int r = 0; r < matrix2.getN(); r++) {
                        m_matrix[i][j] += matrix1.getElement(i, r) * matrix2.getElement(r, j);
                    }
                }
            }
            return new Matrix(m_matrix);
        } else {
            System.out.println("Нельзя их умножить ");
            return null;
        }
    }

    public static Matrix add_substract(Matrix matrix1, Matrix matrix2, boolean flag) {
        if (matrix1.getM() == matrix2.getM() && matrix1.getN() == matrix2.getN()) {
            double[][] r_matrix = new double[matrix1.getN()][matrix1.getM()];
            for (int i = 0; i < matrix1.getN(); i++) {
                for (int j = 0; j < matrix1.getM(); j++) {
                    if (flag) {
                        r_matrix[i][j] = matrix1.getElement(i, j) + matrix2.getElement(i, j);
                    } else {
                        r_matrix[i][j] = matrix1.getElement(i, j) - matrix2.getElement(i, j);
                    }
                }
            }
            return new Matrix(r_matrix);
        } else {
            System.out.println("Нельзя сложить или вычесть текущие матрицы");
            return null;
        }
    }

    public static Matrix numeric_matrix(Matrix matrix1, double k) {
        double[][] matrix = new double[matrix1.getN()][matrix1.getM()];
        for (int i = 0; i < matrix1.getN(); i++) {
            for (int j = 0; j < matrix1.getM(); j++) {
                matrix[i][j] = matrix1.getElement(i, j) * k;
            }
        }
        System.out.println("b) Умножено на число " + k + "!");
        return new Matrix(matrix);
    }


}
