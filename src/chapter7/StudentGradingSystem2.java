package chapter7;

import java.util.Scanner;
/* The 2D array is declared; the number of students give the number of rows for the array
    and the number of courses gives the number of columns
    It is initialised
    How?
    The number of students which gives the row number is gotten
        An array is initialised such that the
    The number of subjects which gives the column number is initialised
 */
public class StudentGradingSystem2 {


    private static int input() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static int inputNumberOfStudents(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many students are in the class?");
        return scanner.nextInt();
    }

    private static int inputNumberOfSubjects(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many subjects are the students offering?");
        return scanner.nextInt();
    }

    private static int [][] studentScoreDetails(){
        int noOfStudents = inputNumberOfStudents();
        int noOfSubjects = inputNumberOfSubjects();
        return new int[noOfStudents][noOfSubjects];
    }

    private static int[][] inputStudentsScoresDetails(){
        int [] [] studentScoreDetails =studentScoreDetails();
        for (int row = 0; row < studentScoreDetails.length; row++){
            for (int column = 0; column < studentScoreDetails[row].length; column++){
                System.out.println("Enter student " +(row+1) +"'s score in subject " +(column+1));
                studentScoreDetails[row][column] = input();
            }
        }
        return studentScoreDetails;
    }

    public static int highestScoreOfStudent(int rowIndex){
        int [] [] studentScoreDetails =inputStudentsScoresDetails();
        int [] studentScores = studentScoreDetails[rowIndex];
        int maximumNumber = studentScores[0];
        for (int number : studentScores){
            if ( number > maximumNumber ){
                maximumNumber = number;
            }
        }
        return maximumNumber;
    }

//    public static void printHighestScores(){
//        for (int index = 0; index <
//        int maximumNumber = highestScoreOfStudent(index);
//    }

    public static void printTable(){
        int [] [] studentScoreDetails =inputStudentsScoresDetails();
        int maximumStudentScore;
        for (int row =0; row< studentScoreDetails.length; row++) {
            maximumStudentScore = studentScoreDetails[row][0];
            for (int column =0; column< studentScoreDetails[row].length; column++) {
                System.out.print(studentScoreDetails[row][column] + " ");
                if ( studentScoreDetails[row][column] > maximumStudentScore){
                    maximumStudentScore = studentScoreDetails[row][column];
                }
            }
            System.out.print(maximumStudentScore);
            System.out.println();
        }
    }















//    public static int[][] returnASubjectsDetail(int columnIndex){
//        int [] [] studentScoreDetail = studentScoreDetails();
//        return studentScoreDetail[][columnIndex];
//    }


//    public static int highestScoreOfStudent(){
//        int index = 0;
//        int [] studentDetail = highestScoreOfStudent(index);
//    }


//    {{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{
//        OULD BE USEFUL FOR A DIFFERENT COMPUTATION INSTEAD OF THE ROW INIT. AT LEAST I CAN ITERATE THROUGH A COLUMN HAHAHAHAHAHA
//        public static int[][] initSubjectsColumn(){
//            int [][] subjectsScores = returnASubjectsDetail();
//            for (int scoreIndex = 0; scoreIndex< subjectsScores.length; scoreIndex++){
//                for (int column = 0; column < subjectsScores[scoreIndex].length; column++){
//                    subjectsScores[scoreIndex][column] = input();
//                }
//            }
//            return subjectsScores;
//        }}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}
}
