package chapter7;

public class Airline {

    private boolean [] seats = new boolean[10];
    private int [] seatNumber = new int[10];
    private int seatNo =0;
    private boolean isEconomy;


    public int computeTheNumberOfAvailableFirstClassSeats(){
        return seats.length/2;

    }

    public int getSeatNumber(){
        return seatNo;
    }

    public void setSeatNumber(int input){
        if ( input == 1 || input==2 ){
            seatNo += 1;
        }else {
            setSeatNumber(input);
        }
    }

    public void bookSeat(int input) {
        if ( input ==1 || input ==2 ){
            seats[seatNo-1] = true;
        }
    }

    public boolean[] getBookedSeats(){
        return seats;
    }

    public boolean isEconomy(int seatNo) {
        this.seatNo = seatNo;
        if ( this.seatNo >= 0 && this.seatNo <= 4 ){
            isEconomy = true;
        }
        return isEconomy;
    }
}