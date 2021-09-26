package chapter7;

public class Airline {

    private boolean [] seats = new boolean[10];
    private int [] seatNumber = new int[10];
    private int seatNo =0;
    private boolean isFirstClass;
    private boolean isEconomy;
    private int seatNumberForFirstClass = 0;
    private int seatNumberForEconomy = 5;

    public int getSeatNumber(){
        return seatNo;
    }

    public int getSeatNumberForFirstClass(){
        return seatNumberForFirstClass;
    }

    public int getSeatNumberForEconomy(){
        return seatNumberForEconomy;
    }

    private void setSeatNumber(int input){
        if ( input ==1 ){
            try {
                seatNo += 1;
//                if ( seatNo >5 )
            }catch (ArithmeticException exception){

                seatNumberForFirstClass +=1;
            }

            }else {
            seatNo += 1;
            seatNumberForEconomy +=1;
        }
    }

    public void bookSeat(int input) {
        if ( input ==1 || input ==2 ){
            setSeatNumber(input);
            try {
                seats[seatNo-1] = true;
            }catch (IndexOutOfBoundsException exception){
                System.out.println("Seats are full");
            }
        }
    }

    public boolean isFirstClass() {
        if ( this.seatNo >= 0 && this.seatNo <= 4 ){
            isFirstClass = true;
        }
        return isFirstClass;
    }

    public boolean isEconomy() {
        if ( this.seatNo >= 5 && this.seatNo <= 9 ){
            isEconomy = true;
        }
        return isEconomy;
    }
}