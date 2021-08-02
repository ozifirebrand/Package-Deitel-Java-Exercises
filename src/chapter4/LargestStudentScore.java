package chapter4;
import java.util.Scanner;
/*REFACTORING LARGEST SCORE PROGRAM

Prompt displays "Enter name of student and score"
     User inputs name and score of student
     The prompt continues prompting for new name and score until the 10th time and stops
     Values of entered scores are compared and the two largest scores are determined
     The corresponding names for each score is displayed accordingly

         Comparison mode of integers and name display
             Save the incoming score as largest.
             The corresponding name is saved as the name of the largest scoring student
             When another score is inputted, compare against the current largest score.
                If it is larger, it becomes the current largest score.
                Store its corresponding name as the current largest scoring student.
                If not, it is compared against the larger score.
                If it is larger, then it is saved as the current larger score.
                Its corresponding name is stored as the second highest scoring student.
                If it is none of this, it is discarded
     After ten loops are completed, the largest and larger numbers are displayed
     alongside the student's names
 */
public class LargestStudentScore {
           public static void main(String[] args) {

            int scoreOfStudent;
            String studentName="";
            String studentWithHighestScore= "";
            String studentWithSecondHighestScore="";
            int numberOfStudents = 1;
            int largerNumber=0;
            boolean numberOfStudentsIsLessThanNine = numberOfStudents <9;

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter a student's name");
                studentName = scanner.next();
                studentWithHighestScore =studentName;

            System.out.println("Enter the student's score: ");
                scoreOfStudent = scanner.nextInt();
                int largestNumber = scoreOfStudent;

            while (numberOfStudentsIsLessThanNine) {
                {//I dont understand why my code won't run correctly without this line
                numberOfStudentsIsLessThanNine = numberOfStudents < 9;}

                System.out.println("Enter a student's name");
                studentName = scanner.next();

                System.out.println("Enter the student's score: ");
                scoreOfStudent = scanner.nextInt();

                if (scoreOfStudent > largestNumber) {
                    largerNumber = largestNumber;
                    studentWithSecondHighestScore=studentWithHighestScore;

                    largestNumber = scoreOfStudent;
                    studentWithHighestScore=studentName;

                }else
                if (scoreOfStudent > largerNumber && scoreOfStudent < largestNumber) {
                    largerNumber = scoreOfStudent;
                    studentWithSecondHighestScore=studentName;

                } else
                { largestNumber = largestNumber;
                    studentWithHighestScore=studentWithHighestScore;
                    largerNumber = largerNumber;
                    studentWithSecondHighestScore=studentWithSecondHighestScore;
                }

                numberOfStudents = numberOfStudents+1;

                System.out.print("Student with the highest score is ");
                System.out.print(studentWithHighestScore);
                System.out.println(" with score " +largestNumber);

                System.out.print("Student with the second highest score is ");
                System.out.print(studentWithSecondHighestScore);

                System.out.println(" with score " +largerNumber);
                System.out.println(numberOfStudents);
                System.out.println("");
            }
        }
    }