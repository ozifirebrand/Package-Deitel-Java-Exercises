package chapter7;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradingSystem {
    private static int input (){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static int[][] initArray(){
        int [] [] studentsSubjectTable = declareArray();
        for ( int row =0; row< studentsSubjectTable.length; row++){
            for (int column = 0; column< studentsSubjectTable[row].length; column++){
                System.out.printf("What is student %d score in subject %d", row+1, column+1);
                studentsSubjectTable[row][column] = input();
            }
        }
        return studentsSubjectTable;
    }

    public static int[][] declareArray() {
        System.out.println("How many students are in the class?");
        int noOfStudents = input();
        System.out.println("How many subjects are they offering?");
        int noOfSubjects = input();
        return new int[noOfStudents][noOfSubjects];
//                {{34, 94, 66},
//                {98, 21, 45},
//                {67, 77, 88}};
    }

    public static void displayScores( int[][] studentsScore, ArrayList<Integer> highestScorePerStudent,
                                      ArrayList<Integer> highestScorePerSubject) {
        int index = 0;
        while (index < highestScorePerStudent.size()) {
        for (int[] row : studentsScore) {
            for (int column : row) {
                System.out.print(column + " ");
            }System.out.print(highestScorePerStudent.get(index));
            index++;
            System.out.println();
        }
        }
        for (int score : highestScorePerSubject){
            System.out.print(score +" ");
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
        int [] [] array = initArray();
        ArrayList<Integer> list = findHighestStudentScore(array);
        ArrayList<Integer> list1 =findHighestSubjectScore(array);
        displayScores(array, list, list1);

    }
}