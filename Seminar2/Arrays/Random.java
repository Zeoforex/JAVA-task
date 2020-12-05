package Seminar2.Arrays;

public class Random {
    private int[] new_array;

    public Random(int[] values, int[] weights) {
        int summ = 0;
        for (int i : weights) {
            summ += i;
        }
        new_array = new int[summ];
        int r = 0;
        System.out.println("Массив создали");
        for (int i = 0; i < weights.length; i++) {
            for (int j = 0; j < weights[i]; j++) {
                new_array[r] = values[i];
                System.out.println(new_array[r] + "");
                r += 1;
            }
        }
    }

    public int getRandom() {
        double random = (Math.random() * (new_array.length - 1));
        System.out.println("Выбранное значение: " + new_array[(int) random]);
        return new_array[(int) random];
    }
}
