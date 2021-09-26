package chapter7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
        //given ...
        //when
        reserve.bookSeat(1);
        reserve.bookSeat(1);
        reserve.bookSeat(1);
        reserve.bookSeat(1);
        reserve.bookSeat(1);
        reserve.bookSeat(1);
        //assert
        Assertions.assertFalse(reserve.isFirstClass());
    }


    @Test
    public void testThatEconomySeatCanBeBookedTillNumber10(){
        //given ...
        //when
        reserve.bookSeat(1);
        reserve.bookSeat(1);
        reserve.bookSeat(1);
        reserve.bookSeat(1);
        reserve.bookSeat(1);
        reserve.bookSeat(1);
        reserve.bookSeat(1);
        reserve.bookSeat(1);
        reserve.bookSeat(1);
        reserve.bookSeat(1);
        reserve.bookSeat(1);
        Assertions.assertFalse(reserve.isEconomy());
    }

    @Test
    public void testThatEconomySeatStartsFromNumber6(){
        //given ...
        //when
        reserve.bookSeat(2);
        //assert
        Assertions.assertEquals(6, reserve.getSeatNumberForEconomy());
//        reserve.bookSeat(2);
    }

    @Test
    public void testThatFirstClassSeatStartsFromNumber1(){
        //given ...
        //when
        reserve.bookSeat(1);
        //assert
        Assertions.assertEquals(1, reserve.getSeatNumberForFirstClass());
//        reserve.bookSeat(2);
    }

    @Test
    @DisplayName("First class cannot exceed 5 seats")
    public void testThatFirstClassCanBeFull(){
        //given ...
        //when
        reserve.bookSeat(1);
        reserve.bookSeat(1);
        reserve.bookSeat(1);
        reserve.bookSeat(1);
        reserve.bookSeat(1);
        reserve.bookSeat(1);
        //assert
        Assertions.assertNotEquals(6, reserve.getSeatNumber());
    }

}