package chapter7;

import java.util.Arrays;

/*The array contains three rows and columns each
First row prints x, second prints o and so on
Third row prints o and so on */

public class TicTacToe {
    public static void printRowsAndColumns(String [][] arrayColumn){
        for (String[] strings : arrayColumn) {
            for (int column = 0; column < arrayColumn.length; column++) {
                System.out.print(strings[column] +"  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
       String[][] arrayColumn = {{"x", "o", "x"},
        {"o", "x", "o"},
        {"x", "o", "x"}
       };
       printRowsAndColumns(arrayColumn);
    }
}
