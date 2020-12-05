package Seminar2.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 5};
        int[] weights = {1, 2, 3, 6};
        Random random = new Random(values, weights);
        random.getRandom();
    }
}