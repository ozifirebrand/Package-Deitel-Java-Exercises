package chapter7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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

    private static void displaySubjectName(int [][] studentsScore){
        System.out.print("\t  ");
            for (int column = 0; column < studentsScore[0].length; column++) {
                System.out.printf("Sub%d \t  ", column + 1);
        }
        System.out.print("\tAve \t  \tTotal");
        System.out.println();
    }

    public static ArrayList<Integer> findHighestStudentScore( int[][] studentsScore) {
        int highestStudentsScore;
        ArrayList<Integer> highestScorePerStudent = new ArrayList<>();
        for (int row =0; row< studentsScore.length; row++) {
            highestStudentsScore = studentsScore[row][0];
            for (int column =0; column< studentsScore[row].length; column++) {
                if ( studentsScore[row][column] > highestStudentsScore ) {
                    highestStudentsScore = studentsScore[row][column];
                }
            }
            highestScorePerStudent.add(highestStudentsScore);
        }
        return highestScorePerStudent;
    }

    public static ArrayList<Integer> findHighestSubjectScore(int [] [] studentsScore){
        int highestSubjectScore;
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


    public static void displayScores( int[][] studentsScore, ArrayList<Integer> highestScorePerStudent,
                                      ArrayList<Integer> highestScorePerSubject) {
        displaySubjectName(studentsScore);
        ArrayList<Double> averageScores = averageForEachStudent(studentsScore);
        ArrayList<Integer> sumForEachStudent = sumForEachStudent(studentsScore);
        for (int row =0; row< studentsScore.length; row++) {
            System.out.printf("St%d  |  ", row + 1);
            for (int column=0; column<studentsScore[row].length; column++) {
                System.out.print(studentsScore[row][column] + "\t\t");
            }
            System.out.printf("%.2f\t\t",averageScores.get(row));
            System.out.print(sumForEachStudent.get(row) +"  ");
            System.out.println();
        }
        System.out.print("\t\t");
        for (int index = 0; index< highestScorePerSubject.size(); index++){
            System.out.print(highestScorePerSubject.get(index) +"\t\t");
        }
    }
    //2 5 3 8 2 9 1 3
    public static int [] rankStudents(int [][] studentScores){
        ArrayList<Integer> sumForEachStudent = sumForEachStudent(studentScores);
//        Collections.sort(sumForEachStudent);
        int [] rank= new int[sumForEachStudent.size()];
        Arrays.fill(rank, 1);
        int highestSum=0;
        for (int index=0; index< sumForEachStudent.size(); index++) {


//            if ( sumForEachStudent.get(index) > highestSum ) {
//                highestSum = sumForEachStudent.get(index);
//                rank[index] -= 1;
//                for (int indexRank = 0; indexRank< rank.length; indexRank++ ){
//                    rank[indexRank] +=1;
//                }
//            }
        }
        return rank;
    }

    public static ArrayList<Double> averageForEachStudent(int [][] studentScore){
        ArrayList<Integer> sumForEachStudent = sumForEachStudent(studentScore);
        int numberOfSubjects = studentScore[0].length;
        double averageScore;
        ArrayList<Double> averageScores = new ArrayList<>();
        for (Integer totalIn : sumForEachStudent){
            averageScore = (double)totalIn/numberOfSubjects;
            averageScores.add(averageScore);
        }
        return averageScores;
    }

    private static ArrayList<Integer> sumForEachStudent(int [][] studentScore){
        ArrayList<Integer> sumForEachStudent = new ArrayList<>();
        for (int [] score : studentScore ){
            int totalScore = 0;
            for ( int scoreInColumn : score){
                totalScore += scoreInColumn;
            }
            sumForEachStudent.add(totalScore);
        }
        return sumForEachStudent;
    }


    public static void main(String[] args) {
        int [] [] array = initTableOfScores();
        ArrayList<Integer> list = findHighestStudentScore(array);
        ArrayList<Integer> list1 =findHighestSubjectScore(array);
        displayScores(array, list, list1);
    }
}