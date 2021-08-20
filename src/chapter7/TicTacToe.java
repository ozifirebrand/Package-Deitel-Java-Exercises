package chapter7;

import java.util.Arrays;

/*The array contains three rows and columns each
First row prints x, second prints o and so on
Third row prints o and so on */
public class TicTacToe {

   public static void printRows(){
       String [][] columns = new String[3][3];
       String[] firstRow = {"X", "O", "X"};
       String[] secondRow = {"O", "X", "O"};
       String[] thirdRow = {"X", "O", "X"};

       columns[0] = firstRow;
       columns[1] = secondRow;
       columns[2] = thirdRow;
       System.out.print(columns[0][0] +" ");
       System.out.print(columns[0][1] +" ");
       System.out.print(columns[0][2] +" ");
       System.out.println();
       System.out.print(columns[1][0] +" ");
       System.out.print(columns[1][1] +" ");
       System.out.print(columns[1][2] +" ");
       System.out.println();
       System.out.print(columns[2][0] +" ");
       System.out.print(columns[2][1] +" ");
       System.out.print(columns[2][2] +" ");
//       System.out.println("" + Arrays.toString(columns[0]));
//       System.out.println("" + Arrays.toString(columns[1]));
//       System.out.println("" + Arrays.toString(columns[2]));
   }
   public static void printColumnsAndRows(String[][] columns){

   }

public static void main(String[] args) {
   printRows();
   }
}
