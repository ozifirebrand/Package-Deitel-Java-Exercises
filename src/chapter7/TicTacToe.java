package chapter7;

import java.util.Arrays;

/*The array contains three rows and columns each
First row prints x, second prints o and so on
Third row prints o and so on */

public class TicTacToe {
//
//   public static void printRows(){
//       String [][] column= new String[3][3];

    public static void printRowsAndColumns(String [][] arrayColumn){
//         arrayColumn =new String[3][3];
        for (String[] strings : arrayColumn) {
            for (int column = 0; column < arrayColumn.length; column++) {
                System.out.print(strings[column] +"  ");
            }
            System.out.println();
        }
    }
//      column[0][0]  = "X";
//      column[0][1]  = "O";
//      column[0][2]  = "X";
//
//      column[1][0]  = "O";
//      column[1][1]  = "X";
//      column[1][2]  = "O";
//
//      column[2][0]  = "X";
//      column[2][1]  = "O";
//      column[2][2]  = "X";
//       System.out.printf("%s %s %s%n", column[0][0], column[0][1], column[0][2]);
//       System.out.printf("%s %s %s%n", column[1][0], column[1][1], column[1][2]);
//       System.out.printf("%s %s %s%n", column[2][0], column[2][1], column[2][2]);
//       System.out.println();
//       System.out.println();
//       System.out.print(column[0][0]+ " " + column[0][1] +" " +column[0][2] +"\n");
//       System.out.print(column[1][0]+ " " + column[1][1] +" " +column[1][2] +"\n");
//       System.out.print(column[2][0]+ " " + column[2][1] +" " +column[2][2] +"\n");
//
//       System.out.println();
//       System.out.println();
//       System.out.println();
//
//    String [][] columns = new String[3][3];
//    String[] firstRow = {"X", "O", "X"};
//    String[] secondRow = {"O", "X", "O"};
//    String[] thirdRow = {"X", "O", "X"};
//
//    columns[0] = firstRow;
//    columns[1] = secondRow;
//    columns[2] = thirdRow;
//
//    System.out.print(columns[0][0] +" ");
//    System.out.print(columns[0][1] +" ");
//    System.out.print(columns[0][2] +" ");
//    System.out.println();
//    System.out.print(columns[1][0] +" ");
//    System.out.print(columns[1][1] +" ");
//    System.out.print(columns[1][2] +" ");
//    System.out.println();
//    System.out.print(columns[2][0] +" ");
//    System.out.print(columns[2][1] +" ");
//    System.out.print(columns[2][2] +" ");
//   }

    public static void main(String[] args) {
       String[][] arrayColumn = {{"x", "o", "x"},
        {"o", "x", "o"},
        {"x", "o", "x"}
       };

       printRowsAndColumns(arrayColumn);

        // or you might also might wanna print the arrayColumn you can do it this way...
//        System.out.println(arrayColumn);
    }
}
