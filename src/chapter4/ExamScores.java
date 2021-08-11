package chapter4;
import java.util.Scanner;

/*A college offers a course that prepares students for the state licensing exam for real-estate
brokers. Last year, ten of the students who completed this course took the exam. The college
wants to know how well its students did on the exam. You’ve been asked to write a
program to summarize the results. You’ve been given a list of these 10 students. Next to
each name is written a 1 if the student passed the exam or a 2 if the student failed.
Your program should analyze the results of the exam as follows:
1. Input each test result (i.e., a 1 or a 2). Display the message “Enter result” on the screen
each time the program requests another test result.
2. Count the number of test results of each type.
3. Display a summary of the test results, indicating the number of students who passed and
the number who failed.
4. If more than eight students passed the exam, print “Bonus to instructor!”

 */
public class ExamScores {
    public static void main(String[] args) {
        int noOfStudents = 0;
        Scanner scanner = new Scanner(System.in);
        int passOrFail = 1;

        int failScore= 0;
        int passScore = 0;
        while (noOfStudents <10){
            System.out.print("Enter a score (1 = pass, 2 = fail): ");
            int studentScore = scanner.nextInt();


            boolean studentFail = studentScore>=0 && studentScore <70;
            boolean studentPassed =studentScore >=70 && studentScore<=100;
            if (studentFail){
                failScore +=studentScore;
            }
            if (studentPassed){
                passScore +=studentScore;
            }
            if (studentFail || studentPassed){
                if (studentFail){
                passOrFail=2;
            }else if (studentPassed) {
                    passOrFail = 1;
                }
                noOfStudents++;
                System.out.printf("%d%n", passOrFail);
            } else {
                System.out.print("Enter valid value\n");
            }
        }if ( passScore > failScore ){
            System.out.println("WELL-DONE! You have a bonus");
        }else if (passScore < failScore){
            System.out.println("Poor performance!");
        }else{
            System.out.println("The performance is even.");
        }
    }
}