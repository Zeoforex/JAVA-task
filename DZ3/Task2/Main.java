package DZ3.Task2;
import java.util.LinkedList;
import java.util.ArrayList;

//2) Напишите метод, который добавляет 1.000.000 элементов в ArrayList и LinkedList.
//Наугад берет по 10.000 элементов с каждой коллекции.Замерьте время, кто быстрее.

public class Main {
    public static void main(String[] args) {
            compare2Lists();
    }
    public static void compare2Lists(){
        long startTime, arrayTime, linkedTime;
        ArrayList<Double> arrayList = new ArrayList<>();
        LinkedList<Double> linkedList = new LinkedList<>();
        final int N = 1000000;
        final int M = 10000;
        for(int i =0; i< N;i++){
            arrayList.add(Math.random());
            linkedList.add(Math.random());
        }

        startTime = System.currentTimeMillis();
        for(int i=0; i<M;i++){
            arrayList.get((int) Math.random()*(M-1));
        }

        arrayTime = System.currentTimeMillis() - startTime;
        System.out.println("Вермя ArrayList: " + arrayTime);

        startTime = System.currentTimeMillis();
        for(int i=0; i<M;i++){
            linkedList.get((int) Math.random()*(M-1));
        }
        linkedTime = System.currentTimeMillis() - startTime;
        System.out.println("Вермя LinkedTime: " + linkedTime);

        if(linkedTime < arrayTime){
            System.out.println("LinkedList быстрее");
        }
        else if(linkedTime == arrayTime){
            System.out.println("Скорость одинаковая");
        }
        else{
            System.out.println("ArrayList быстрее");
        }
    }
}