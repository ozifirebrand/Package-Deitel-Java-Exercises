package chapter7;

import java.util.Scanner;

public class StudentGradingSystem {
    /*Algorithm already on paper to be transferred after program completely executes
     */

    private static int input(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static int[] returnAStudentsRow(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many subjects are the students offering?");
        int noOfSubjects =  scanner.nextInt();
        return new int[noOfSubjects];
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

    public static void declareStudentSubjectDetails(){
        int [] [] studentScoresDetails = new  int[receiveNoOfStudents()][];
        for (int row = 0; row< studentScoresDetails.length; row++){
            studentScoresDetails[row]= returnAStudentsRow();
        }
    }

    public static int[] initStudentRow(){
        int [] studentsScores = returnAStudentsRow();
        for (int scoreIndex = 0; scoreIndex< studentsScores.length; scoreIndex++){
            studentsScores[scoreIndex] = input();
        }
        return studentsScores;
    }

    public static int[][] returnASubjectsColumn(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many students are in the class?");
        int noOfStudents = scanner.nextInt();
        return new int[noOfStudents][1];
    }

    public static int findStudentsHighestScore(){
        int [] studentsRow = initStudentRow();
        int highestScore = studentsRow[0];
        for (int score : studentsRow){
            if (score> highestScore){
                highestScore = score;
            }
        }
        return highestScore;
    }
}


//    public static int [] collectInputInListForm(){
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

//    public static int[][] initStudentsFile(){
//        return new int[receiveNoOfStudents()][receiveNoOfSubjects()];
//    }

//{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{
// COULD BE USEFUL FOR A DIFFERENT COMPUTATION INSTEAD OF THE ROW INIT. AT LEAST I CAN ITERATE THROUGH A COLUMN HAHAHAHAHAHA
//    public static int[][] initSubjectsColumn(){
//        int [][] subjectsScores = returnASubjectsColumn();
//        for (int scoreIndex = 0; scoreIndex< subjectsScores.length; scoreIndex++){
//            for (int column = 0; column < subjectsScores[scoreIndex].length; column++){
//                subjectsScores[scoreIndex][column] = input();
//            }
//        }
//        return subjectsScores;
//    }}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}