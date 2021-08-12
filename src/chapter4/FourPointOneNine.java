package chapter4;
import java.util.Scanner;
/*Display prompt lets user know to input item no and
price value of sold item
    A loop makes it possible to keep showing prompt
User inputs items and their price values
    A loop allows the user keep inputting values
Program computes the total bonus at the end of the week
    The inputted value is summed to the total amount sold and multiplied by 0.09
The total bonus is added to 200 and displayed
A dummy or sentinel value, -1 in this case breaks the loop
 */

public class FourPointOneNine {
    public static void main(String[] args) {


//        int commission;
        int noOfItems = 1;
        int totalAmountSold=0;
        double weeklyTakeHome = 0;

        while (noOfItems>0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter price value of item" + noOfItems +"\tPress " +
                    "-1 to terminate");
            int amountSold = scanner.nextInt();

           if(amountSold!=-1){
                totalAmountSold +=amountSold;

               System.out.println();
            } else {
               break;
           }

            noOfItems++;
        }
        weeklyTakeHome += totalAmountSold +totalAmountSold*0.09;
        System.out.println("The total amount sold is: " +totalAmountSold);
        System.out.println("Weekly take home is: " +weeklyTakeHome);

    }
}
