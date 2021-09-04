package chapter6;
/*Normal charges is 10 naira for 3 hours
After that, every hour costs 2 naira
Maximum amount that each customer should pay is 50 per 24 hours
A customer cannot pack beyond 24 hours at once
Our program calculates and displays the parking charges for each
    customer who packed in the garage a day ago

First enter the number of hours packed by each customer one at a time
Calculate the total cost of the customer
Display the total amount, the number of hours each customer parked for
    and the cost for each hour (in a neat table including their serial
    number - optional)

Use method calculateCharges to calculate the charge for each customer
 */

import java.util.Scanner;

public class SixPointEightParkingCharges {

private static int receiveInput(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("How many hours did the customer park?");
    return scanner.nextInt();
}

private static int calculateTheCostForTheRemainingHoursInPark(){
    int noOfHours = receiveInput();
    int firstThreeHours = 3;
    int remainingHours = noOfHours - firstThreeHours;
    int costOfEveryHourAfterThreeHours = 2;
    return remainingHours * costOfEveryHourAfterThreeHours;
}

public static int calculateCharges(){
    int costOfFirstThreeHours = 10;
    return costOfFirstThreeHours + calculateTheCostForTheRemainingHoursInPark();
}

private static int inputNoOfCustomers(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("How many customers came around yesterday?");
    return scanner.nextInt();
}

public static void calculateTotalAmountMadeInGarage(){
    int noOfCustomers = inputNoOfCustomers();
    int totalForEachCustomer =0;
    while (noOfCustomers>0){

    }

}
}