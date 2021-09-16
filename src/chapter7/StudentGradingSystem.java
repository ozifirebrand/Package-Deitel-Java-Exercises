package chapter7;

import java.util.Scanner;

public class StudentGradingSystem {

    private static int input(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static int receiveNoOfStudents(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many students are in the class?");
        return scanner.nextInt();
    }
    private static int receiveNoOfSubjects(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many subjects are the students offering?");
        return scanner.nextInt();
    }

    public static int[][] initStudentSubjectDetails(){
        int [] [] studentScoresDetails = new  int[receiveNoOfStudents()][receiveNoOfSubjects()];
        for (int row = 0; row< studentScoresDetails.length; row++) {
            for (int column = 0; column < studentScoresDetails[row].length; column++) {
                studentScoresDetails[row][column] = input();
            }
        }
        return studentScoresDetails;
    }

    public static int[] returnAStudentsDetails(){
        int [][] studentsScoresDetails = initStudentSubjectDetails();
         return studentsScoresDetails[receiveNoOfStudents()];
    }

//
//    public static int[] initStudentRow(){
//        int [][] studentScoreDetails = initStudentSubjectDetails();
//        int row = 0;
//        studentScoreDetails[row] = returnAStudentsRow();
//        for (row = 0; row < studentScoreDetails)
//        int [] studentsScores = returnAStudentsRow();

//        for (int scoreIndex = 0; scoreIndex< studentsScores.length; scoreIndex++){
//            System.out.println("What is student " +(scoreIndex+1) +"'s score");
//            studentsScores[scoreIndex] = input();
//        }
//        return studentsScores;
//    }

//
//    private static int[] returnAStudentsRow(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("How many subjects are the students offering?");
//        int noOfSubjects =  scanner.nextInt();
//        return new int[noOfSubjects];
//    }
//
//    public static int[][] returnASubjectsDetail(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("How many students are in the class?");
//        int noOfStudents = scanner.nextInt();
//        return new int[noOfStudents][1];
//    }
//
//    public static int findStudentsHighestScore(){
//        int [] studentsRow = initStudentRow();
//        int highestScore = studentsRow[0];
//        for (int score : studentsRow){
//            if (score> highestScore){
//                highestScore = score;
//            }
//        }
//        return highestScore;
//    }
}


//    public static int [] studentScoreDetails(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("How many students are in the class?");
//        int noOfStudents = scanner.nextInt();
//        System.out.println("How many subjects are the students offering?");
//        int noOfSubjects = scanner.nextInt();
//        return new int[]{noOfStudents, noOfSubjects};
//    }


//    private static int receiveNoOfStudents(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("How many students are in the class?");
//        return scanner.nextInt();
//    }

//     private static int receiveNoOfSubjects(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("How many subjects are the students offering?");
//        return scanner.nextInt();
//    }
//
//
//


//
//    private static int receiveNoOfSubjects(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("How many subjects are the students offering?");
//        return scanner.nextInt();
//    }
//    public static int[][] initStudentsFile(){
//        return new int[receiveNoOfStudents()][receiveNoOfSubjects()];
//    }

//{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{
// COULD BE USEFUL FOR A DIFFERENT COMPUTATION INSTEAD OF THE ROW INIT. AT LEAST I CAN ITERATE THROUGH A COLUMN HAHAHAHAHAHA
//    public static int[][] initSubjectsColumn(){
//        int [][] subjectsScores = returnASubjectsDetail();
//        for (int scoreIndex = 0; scoreIndex< subjectsScores.length; scoreIndex++){
//            for (int column = 0; column < subjectsScores[scoreIndex].length; column++){
//                subjectsScores[scoreIndex][column] = input();
//            }
//        }
//        return subjectsScores;
//    }}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}