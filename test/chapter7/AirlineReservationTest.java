package chapter7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class AirlineReservationTest {

    @Test

    public void testThatUserCanMakeReservation(){
        AirlineReservation reserve = new AirlineReservation();
        reserve.makeReservation(1);
        boolean [] seat = reserve.seatIsReserved();
        Assertions.assertTrue(true, String.valueOf(seat[0]));
    }
    public static void main(String[] args) {
        System.out.println("Please enter 1 for a first class reservation or\n" +
                "2 for an economy class reservation.");
        Scanner scanner = new Scanner(System.in);
        try {
            int response = scanner.nextInt();
        }catch (InputMismatchException mismatch){
            System.out.print("Invalid input" +mismatch.getMessage());
        }
//        reserve.makeReservation();
//        reserve.makeReservation();
//        reserve.makeReservation();
//        reserve.makeReservation();
//        reserve.makeReservation();
//        reserve.makeReservation();
//        reserve.makeReservation();
//        reserve.makeReservation();
//        reserve.makeReservation();
//        reserve.makeReservation();
//        reserve.makeReservation();
//        reserve.assignFirstClassWhenEconomyIsFull();
    }

}