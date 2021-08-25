package ClassWork;

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

    public static void locateRow(){

    }

    public static void totalScoreInRow(){
        int [][] table = initialiseArray();

    }

    public static void main(String[] args) {

    }
}
























