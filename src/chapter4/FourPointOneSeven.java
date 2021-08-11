package chapter4;
/*AVERAGE GAS MILEAGE
User inputs miles of one trip
User inputs gallons of the same trip
The miles per gallon is computed for this trip
This should go on for all trips
Sum the total miles per gallon for the whole trips
Display the average for these different inputs
Display the output of the sum obtained
 */


import java.util.Scanner;
public class FourPointOneSeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noOfTrips = 0;
        int miles = 0;
        int totalMiles = 0;
        int totalGasUsed = 0;
        int gasUsed = 0;

        while (noOfTrips >= 0) {

            System.out.println("Enter the miles");
            miles = scanner.nextInt();
            if ( miles == -1 ) {
                break;
            } else {
                System.out.println("Enter the gas used");
                gasUsed = scanner.nextInt();
                if ( gasUsed == -1 ) {
                    break;
                } else {
                    double milesPerGallon = (double) gasUsed / miles;

                    System.out.printf("Miles/gallon = %.2fm/gl.%n", milesPerGallon);
                }
                totalMiles += miles;
                totalGasUsed += gasUsed;
                noOfTrips++;

            }
        }
        double totalAverage = (double) totalGasUsed / totalMiles;
        System.out.printf("Total miles/gallon = %.2f m/gl.", (totalAverage));
    }
}