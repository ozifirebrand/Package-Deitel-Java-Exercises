package chapter7;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/*The program asks users to input either 1 for first class or 2 for economy;
If user enters 1, the first five seats which are the first class seats are reserved
Else the space will be between 6 and 10
Next there is a boarding pass that assigns a seat number and displays if it is a
first class or economy section of the plane
A boolean array which is set to false by default sets to true once the seat has been
occupied
The application should not assign more than one seat to any passenger or many passengers
to a seat
When the economy class is full, the application should ask the user if he wants the first class
If he refuses display the next flight leaves in 3 hours
 */
public class AirlineReservation {
    private final int seats = 10;
    private final boolean [] seatIsTaken = new boolean[seats];
    private int inFirstClass = 0;
    private int inEconomyClass = 5;


    private String collectUserInput(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public boolean[] seatIsReserved(){
        return seatIsTaken;
    }

    public void makeReservation(int response){
        if ( response == 1 ){
            if(inFirstClass > 4){
                System.out.println("First class is full!");
            }else {
                seatIsTaken[inFirstClass] = true;
                inFirstClass+=1;
            }

        }else if ( response == 2 ){
            seatIsTaken[inEconomyClass] = true;
            try {
                inEconomyClass +=1;
            }catch (IndexOutOfBoundsException outOfBounds){
                System.out.println("Seats are full!");
            }

        } else {
            throw new InputMismatchException("Input 1 or 2 to make " +
                    "your reservation");
        }
        System.out.println(Arrays.toString(seatIsTaken));
    }

    public void assignFirstClassWhenEconomyIsFull(boolean []seatIsTaken){
        if ( inEconomyClass== seatIsTaken.length ){
            System.out.print("Do you care for a place in the first class? ");
            String response = collectUserInput();
            if ( response.equals("yes") ){
                if ( seatIsTaken[inFirstClass] = false ){
                seatIsTaken[inFirstClass] = true;
                inFirstClass +=1;
                }else {
                    System.out.println("Seats are full!");
                }
            }else {
                System.out.println("The next flight is in 3 hours.");
            }
        }
    }
//
//    public void getAirlineTicket(){
//        int response = collectUserChoice();
//        makeReservation();
//    }

}