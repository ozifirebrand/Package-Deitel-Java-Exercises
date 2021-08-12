package chapter4;
/*Prompt inputs the number of hours each employee work
The rate is also inputted
Subtract 40 from the input and the result multiplied by one-half of
    the normal rate
 Create a variable for the forty and multiply by rate
 Display the total salary of each worker
 */
import java.util.Scanner;
public class FourPointTwoZero {
    public static void main(String[] args) {

        int fortyHours = 40;

        Scanner scanner = new Scanner(System.in);
        while (fortyHours <= 40) {

            System.out.println("Number of hours");
            int noOfHours = scanner.nextInt();
            if ( noOfHours == -1 ) {
                break;
            } else {
                System.out.println("Rate/hour");
                int ratePerHour = scanner.nextInt();
                if ( ratePerHour == -1 ) {
                    break;
                } else {

                    double overtimeRatePerHour = ratePerHour * 1.5;

                    int overtime = noOfHours - fortyHours;

                    double extraCash = overtime * overtimeRatePerHour;
                    int salary = 40 * ratePerHour;

                    double totalWeeklySalary = extraCash + salary;

                    System.out.println("Worker's salary is " + totalWeeklySalary);
                }
            }
       // fortyHours--;
        }
    }
}