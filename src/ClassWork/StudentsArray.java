package ClassWork;

import java.util.Arrays;
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
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.println("Enter student" + (i+1) + "'s score for subject " + (1+j));
                table[i][j] = scanner.nextInt();
            }
        }
        return table;
    }

    public static void displayArray(){
        int [][] table = initialiseArray();
        for (int[] ints : table) {
            for (int column = 0; column < ints.length; column++) {
                System.out.println(" " + ints[column]);
            }
            System.out.println();
        }
    }

    public static void displayHorizontalArrayTable(){
        System.out.println("Student \t\t\t Subject scores");
    }

    private static int[] locateRow() {
        int[][] table = initialiseArray();
        int index;
        for (index=0; index < table.length; index++) {
            for (int column = 0; column < table[index].length; column++)
            table[index] = new int[column];
        }
        return table[index-1];
    }

    public static int totalScoreInRow(){
        int [] table = locateRow();
        int totalOfRow = 0;
        for (int column = 0; column < table.length; column++){
            totalOfRow += table[column];
        }
        return totalOfRow;
    }

    public static int[] locateColumn() {
        int[][] table = initialiseArray();
        int row = 0;
        for (int column = 0; column < table[column].length; column++) {
            for (row = 0; row < table.length; row++) {
                table[row] = new int[column];
            }
        }
        return table[row];
    }

    public static void totalOfColumns(){
        }



    public static void main(String[] args) {
        System.out.println(Arrays.toString(locateRow()));
    }
}
























