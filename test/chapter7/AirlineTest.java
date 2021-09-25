package chapter7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    /*Assign seats to flight by asking users to input 1 or 2
    If seat has been taken, assign next seat
    1 is for first class and 2 is for economy
    First class is from 1 -5, economy is 6 - 10
    1-D boolean array to show the seats that are booked
    If economy is full, ask the user to choose first class
    If they don't want, say "Next flight leaves in 3 hours"*/

class AirlineTest {
    Airline reserve;
    @BeforeEach
    public void setUp(){
        reserve = new Airline();
    }

    @Test
    public void testThatFirstClassSeatsNotGreaterThan5(){
        Assertions.assertEquals(5, reserve.computeTheNumberOfAvailableFirstClassSeats());
    }


    @Test
    public void testThatFirstClassSeatCanBeBookedTillNumber5(){
        reserve.bookSeat(1);
        reserve.bookSeat(1);
        reserve.bookSeat(1);
        reserve.bookSeat(1);
        reserve.bookSeat(1);
        Assertions.assertFalse(reserve.isEconomy());
    }

}