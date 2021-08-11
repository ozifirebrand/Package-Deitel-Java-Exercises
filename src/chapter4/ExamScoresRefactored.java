package chapter4;
import java.util.Scanner;
public class ExamScoresRefactored {
    public static void main(String[] args) {
        /*Display Enter results
        Count the number of each test result
        Display thr test results, the no of students who passed and failed
        If more than 8 students passed,print bonus to instructor.
         */
        Scanner scanner = new Scanner(System.in);


        int noOfStudent = 0;
        int noOfFailScore =0;
        int noOfPassScore = 0;
        while (noOfStudent<10){
            System.out.print("Enter result (1 = pass, 2 = fail): ");
            int result = scanner.nextInt();
            if ( result==1 ){
                noOfPassScore+=1;
            }else if ( result==2 ){
                noOfFailScore+=1;
            }else {
                System.out.println("Enter valid value!");
                continue;
            }
            noOfStudent++;
        }
        System.out.println("Passed: "+noOfPassScore);
        System.out.println("Failed: "+ noOfFailScore);

        if ( noOfPassScore>=8 ){
            System.out.println("Bonus to instructor!");
        }

    }
}
