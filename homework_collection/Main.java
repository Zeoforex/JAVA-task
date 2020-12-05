package homework_collection;

import java.util.Arrays;
import java.util.Iterator;

public class Main {
    //1)Реализуйте итератор по массиву
    public static void main(String[] args) {
        System.out.println("Задание 1 по коллекциям");
        Integer[][] matrix = {{3, 4, 2}, {7, 8, 9}};
        for (Integer[] i : matrix) {
            System.out.println(Arrays.toString(i));
        }
        System.out.println("Выводим наш массив на экран");
        Iterator<Integer> iterator = new Matrixiterator<>(matrix);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
