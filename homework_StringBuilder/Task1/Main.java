package homework_StringBuilder.Task1;

public class Main {
    public static void main(String[] args) {
        UndoStringBuilder str = new UndoStringBuilder();
        str.append(" ");
        str.append("Hello");
        System.out.println("Наша строка:"+str.toString());
        str.undo();
        System.out.println("Наша строка после отмены:"+str.toString());
        str.append("Hello");
        str.append(", ");
        System.out.println("Наша строка:"+str.toString());
        str.append("World!");
        System.out.println("Наша строка:"+str.toString());
        str.delete(1,3);
        System.out.println("Наша строка:"+str.toString());
        System.out.println("Наша строка:"+str.toString());
        str.replace(1, 3, "222");
        System.out.println("Наша строка:"+str.toString());
        str.reverse();
        System.out.println("Наша строка:"+str.toString());
        str.undo();
        System.out.println("Наша строка после отмены:"+str.toString());

    }
}
