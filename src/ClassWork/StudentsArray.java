package ClassWork;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;

public class StudentsArray {
    private static int[][] receiveInput(){
        System.out.println("How many students and courses respectively?");
        Scanner scanner = new Scanner(System.in);
        int noOfStudents = scanner.nextInt();
        int noOfCourses = scanner.nextInt();
        return new int[noOfStudents][noOfCourses];
    }
    private static int[][] initialiseArray(){
        Scanner scanner = new Scanner(System.in);
        int [] [] table = receiveInput();
        for (int row = 0; row < table.length; row++) {
            for (int column = 0; column < table[row].length; column++) {
                System.out.println("Enter student" + (row+1) + "'s score for subject " + (1+column));
                table[row][column] = scanner.nextInt();
            }
        }
        return table;
    }

    public static void displayArray(int [][] table){

        for (int[] ints : table) {
            for (int column = 0; column < ints.length; column++) {
                System.out.println(" " + ints[column]);
            }
            System.out.println();
        }
    }
/*To create a particular array of length array.length, we take in inputs based on index
Each index is array[index]
Index increases by 1
New index gives new array item of array[newIndex]

OR from an already made 2d array which is best
A new array can be initialised such that its number of rows is the number of a given index
Each row can then be initialised using the index of the row and column - which has been increasing systematically
 */

//    private static void locateRow() {
//        int [][] table = initialiseArray();
//        for (int i=0; i < table.length; i++){
//            for (int j =0; j< table[i].length; j++) table[i] = new int[j];
//
//        }
//        return table[];
//    }


//    public static int[] locateColumn() {
//        int[][] table = initialiseArray();
//        int row = 0;
//        for (int column = 0; column < table[column].length; column++) {
//            for (row = 0; row < table.length; row++) {
//                table[row] = new int[column];
//            }
//        }
//        return table[row];
//    }

    public static void displayHorizontalArrayTable(){
        System.out.println("Student \t\t\t Subject scores");
    }

    public static int totalScoreInRow(int [][] table){
       int totalOfRows =0;
       for (int i=0 ;i< 1; i++) {
           for (int j=0;j< table[i].length; j++){
               totalOfRows += table[i][j];
           }
       }
        return totalOfRows;
    }

    public static void totalOfColumns(){
    }

    public static void main(String[] args) {
//       int [] [] table = initialiseArray();
//       totalScoreInRow(table);
//       displayArray(table);


    }
}