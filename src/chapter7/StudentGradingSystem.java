package chapter7;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradingSystem {
    private static int input (){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static int[][] initTableOfScores(){
        int [] [] studentsSubjectTable = declareTableOfScores();
        for ( int row =0; row< studentsSubjectTable.length; row++){
            for (int column = 0; column< studentsSubjectTable[row].length; column++){
                System.out.printf("What is student %d score in subject %d: ", row+1, column+1);
                studentsSubjectTable[row][column] = input();
            }
        }
        return studentsSubjectTable;
    }

    private static int[][] declareTableOfScores() {
        System.out.println("How many students are in the class?");
        int noOfStudents = input();
        System.out.println("How many subjects are they offering?");
        int noOfSubjects = input();
        return new int[noOfStudents][noOfSubjects];
    }

    public static void displayTableOfScores(int [][] studentsScore, ArrayList<Integer> highestScorePerStudent,
                                            ArrayList<Integer> highestScorePerSubject) {
        int row = 0;

        System.out.println("\t");
        while (row < studentsScore.length) {
            int lastRow = studentsScore.length-1;
            if ( row == lastRow ){

            }else {
                System.out.printf("St%d %n", row + 1);
            }
            row++;
        }
    }

    public static void displayScores( int[][] studentsScore, ArrayList<Integer> highestScorePerStudent,
                                      ArrayList<Integer> highestScorePerSubject) {
        int rows = 0;
        int lastColumn = studentsScore[rows].length-1;
        System.out.print("\t");
        for (int column = 0; column < studentsScore[rows].length; column++) {
            System.out.printf("Su%d ", column + 1);
            if ( column == lastColumn ){
                System.out.println();
            }
        }
        int lengthOfHighestStudentScoresList = highestScorePerStudent.size();
        for (int indexOfScoresElement = 0; indexOfScoresElement < lengthOfHighestStudentScoresList; indexOfScoresElement++) {
            for (int row =0; row< studentsScore.length; row++) {
                System.out.printf("St%d   ", row + 1);
                for (int column=0; column<studentsScore[row].length; row++) {
                    System.out.print(column + " ");
                }

                System.out.print(highestScorePerStudent.get(indexOfScoresElement));
                System.out.println();
            }
        }
        for (int highestScoreIn : highestScorePerSubject){
            System.out.print(highestScoreIn +" ");
        }
    }

    public static ArrayList<Integer> findHighestStudentScore( int[][] studentsScore) {
        int highestStudentsScore = 0;
        ArrayList<Integer> highestScorePerStudent = new ArrayList<>();
        for (int[] row : studentsScore) {
            highestStudentsScore = row[0];
            for (int column : row) {
                if ( column > highestStudentsScore ) {
                    highestStudentsScore = column;
                }
            }
            highestScorePerStudent.add(highestStudentsScore);
        }
        return highestScorePerStudent;
    }

    public static ArrayList<Integer> findHighestSubjectScore(int [] [] studentsScore){
        int highestSubjectScore = 0;
        ArrayList<Integer> highestScorePerSubject = new ArrayList<>();
        for (int column = 0; column < studentsScore[0].length; column++) {
            highestSubjectScore = studentsScore[0][column];
            for (int[] row : studentsScore) {
                if ( row[column] > highestSubjectScore ) {
                    highestSubjectScore = row[column];
                }
            }highestScorePerSubject.add(highestSubjectScore);
        }
        return highestScorePerSubject;
    }


    public static void main(String[] args) {
        int [] [] array = initTableOfScores();
        ArrayList<Integer> list = findHighestStudentScore(array);
        ArrayList<Integer> list1 =findHighestSubjectScore(array);
//        displayTableOfScores(array);
        displayScores(array, list, list1);

    }
}