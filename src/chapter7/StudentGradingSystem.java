package chapter7;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradingSystem {
    public static int[][] initArray() {
        return new int[][]
                {{34, 94, 66},
                {98, 21, 45},
                {67, 77, 88}};
    }

    public static void displayScores( int[][] studentsScore, ArrayList<Integer> highestScorePerStudent) {
        for (int[] row : studentsScore) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println( );
        }

    }

    public static void displayStudentsHighestScores( ArrayList<Integer> highestScorePerStudent) {
        for (int value : highestScorePerStudent){
            System.out.println(value);
        }
    }

    public static void displaySubjectsHighestScores( ArrayList<Integer> highestScorePerStudent) {
        for (int value : highestScorePerStudent){
            System.out.print(value +" ");
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
    }
}