package DZ3.Task1;
import java.util.Collection;
import java.util.HashSet;
public class Main {
    public static void main(String[] args) {
        //1 Напишите метод, который принимает коллекцию и возвращает коллекцию без дубликатов
    }

    public static <T> Collection<T> removeDuplicates(Collection<T> collection) {
        return new HashSet<>(collection);
    }
}
