package chapter4;
import java.util.Scanner;
public class FourPointOneEight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        while (counter >= 0) {
            System.out.println("Dear staff, Please, enter account number!");
            String accountNumber = scanner.nextLine();

            System.out.print("Dear "+accountNumber+". Please enter balance at the beginning of the month:")
            ;
            int balanceAtTheBeginningOfMonth = scanner.nextInt();

            System.out.print("Enter total of all items charged by the customer " +
                    "this month:");
            int totalItemsThisMonth = scanner.nextInt();

            System.out.print("Enter total of all credits applied to the customer’s " +
                    "account this month: ");
            int totalOfCreditsThisMonth = scanner.nextInt();

            System.out.print("Enter allowed credit limit: ");
            int allowedCreditLimit = scanner.nextInt();

            int newBalance = balanceAtTheBeginningOfMonth +
                    totalOfCreditsThisMonth + totalItemsThisMonth;
            System.out.println("New balance is: " +newBalance);
            if ( newBalance> allowedCreditLimit){
                System.out.println("Credit limit exceeded!\n");
            }
        }
    }
}