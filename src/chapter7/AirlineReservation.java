package chapter7;

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
    private int seatNumber = 0;
    private int input;
    private boolean [] seatIsReserved;
    private boolean [] bookedSeatsBoolean = new boolean[10];

    public void receiveInput(int input) {
        this.input = input;
    }

    public void reserveSeat(){
        if ( input == 1 || input ==2 )
            seatIsReserved[seatNumber] = true;
    }

    public boolean [] seatIsReserved() {
        return seatIsReserved;
    }

    public boolean [] getBookedSeatsBoolean() {
        boolean userWantsEconomy = input == 2;
        boolean userWantsFirstClass = input == 1;
        if ( userWantsFirstClass || userWantsEconomy) bookedSeatsBoolean[seatNumber] = true;
        return bookedSeatsBoolean;
    }


    public void setSeatNumber() {
        if ( input ==1 || input == 2 )
        seatNumber += 1;
    }

    public int getSeatNumber() {
        return seatNumber;
    }
}