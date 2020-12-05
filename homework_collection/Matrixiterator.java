package homework_collection;

import java.util.Iterator;
import java.util.NoSuchElementException;

//Реализуйте итератор по двумерному массиву

public class Matrixiterator<T> implements Iterator<T> {
    private final int size; //размер нашего массива
    private int row = 0; //строка
    private int col = 0; //столбец
    private int position = 0; //номер элемента
    private T[][] matrix;


    public Matrixiterator(T[][] matrix) {
        this.matrix = matrix;
        this.size = countSize(matrix);
    }

    public int countSize(T[][] matrix) {
        // считаем кол-во элементов
        int count = 0;
        for (T[] row : matrix) {
            count = row.length;
        }
        return count;
    }

    @Override
    public boolean hasNext() {
        return position < size;
    }

    @Override
    public T next() {
        if (position >= size) {
            throw new NoSuchElementException();
        }
        T element = matrix[row][col];
        position++;
        col++;
        while (row < matrix.length && col >= matrix[row].length) {
            col = 0;
            row++;
        }
        return element;
    }
}
