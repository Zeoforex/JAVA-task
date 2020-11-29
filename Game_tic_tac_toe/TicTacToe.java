package Game_tic_tac_toe;

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

        }
    }
    void drawTable(){
        for (int r = 0; r < 3;r++){
            for (int c = 0; c<3; c++){
                table[r][c] = signEmpty
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
}
