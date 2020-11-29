package Game_tic_tac_toe;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class TicTacToe {
    char signX = 'x';
    char signO = 'o';
    char signEmpty = '-';
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    char[][] table = new char[3][3];

    public static void main(String[] args) {
        new TicTacToe().game();
    }

    void game(){
        drawTable();
        while (true){
            human();
            if (win(signX)){
                System.out.println("Человек выиграл. WIN WIN WIN");
                break;
            }
            if (loss()){
                System.out.println("Не выиграл. А значит либо ничья либо проигрыш");
                break;
            }
            my_computer();
            printTable();
            if (win(signO)){
                System.out.println("МАШИНА схавала тебя. Нужно лучше играть");
                break;
            }
            if (loss()){
                System.out.println("нет победы. Либо встрял либо ничья либо херня");
                break;
            }

        }
        System.out.println("Игра чет завершилась ваяя");
        printTable();
    }
    void drawTable(){
        for (int r = 0; r < 3;r++){
            for (int c = 0; c<3; c++){
                table[r][c] = signEmpty;
            }
        }
    }
    void printTable(){
        for (int r=0; r<3; r++){
            for (int c=0; c<3; c++){
                System.out.println(table[r][c]+"");
            }
            System.out.println();
        }
    }
    void human(){
        int x,y;
        do {
            System.out.println("Введи строку от 1 до 3");
            y = scanner.nextInt()-1;
            System.out.println("Введи столбец от 1 до 3");
            x = scanner.nextInt()-1;
        }while(!checkingValue(x,y));
        table[y][x] = signX;
    }
    boolean checkingValue(int x, int y){
        if (x<0 || y<0 || x>=3 || y>=3){
            return false;
        }
        return table[y][x] == signEmpty;
    }
    void my_computer(){
        int x,y;
        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        }while(!checkingValue(x,y));
        table[y][x]=signO;

    }
    boolean loss(){
        for (int r = 0; r<3; r++){
            for (int c=0; c<3; c++){
                if (table[r][c] == signEmpty){
                    return false;
                }
            }
        }
        return true;
    }
    boolean win(char sign){
        for (int i=0; i<3; i++){
            if ((table[i][0]==sign && table[i][1]==sign && table[i][2]==sign)||
                    (table[0][i]==sign && table[1][i]==sign && table[2][i]==sign)){
                return true;
            }
        }
        if ((table[0][0] == sign && table[1][1] == sign && table[2][2] == sign)||
                (table[2][0] == sign && table[1][1] == sign && table[0][2] == sign)){
            return true;
        }
        return false;
    }
}
