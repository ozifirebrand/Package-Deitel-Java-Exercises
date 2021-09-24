package chapter7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AirlineReservationTest {
    /*Assign seats to flight by asking users to input 1 or 2
    If seat has been taken, assign next seat
    1 is for first class and 2 is for economy
    First class is from 1 -5, economy is 6 - 10
    1-D boolean array to show the seats that are booked
    If economy is full, ask the user to choose first class
    If they don't want, say "Next flight leaves in 3 hours"*/

    AirlineReservation reserve;
    @BeforeEach
    public void setUp(){
        reserve = new AirlineReservation();
    }

    @Test
    public void testThatUserGetsPromptForInput(){
        //given...
        //when
        reserve.receiveInput(1);
        //assert
        Assertions.assertSame(1, reserve.getInput());
    }

    @Test
    public void testThatFirstClassSeatCanBeBooked(){
        //given ...
        //when
        reserve.receiveInput(1);
        //assert
        Assertions.assertTrue(reserve.seatIsReserved());
    }


    @Test
    public void testThatEconomySeatCanBeBooked(){
        //given ...
        //when
        reserve.receiveInput(2);
        //assert
        Assertions.assertTrue(reserve.seatIsReserved());
    }

    @Test
    public void testThatABookedSeatCanBeStored(){
        //given ...
        //when
        reserve.receiveInput(1);
        boolean getBookedSeats = reserve.getBookedSeats();
        Assertions.assertTrue(getBookedSeats);
    }

    @Test
    public void testThatManySeatsCanBeBooked(){
        //given ...
        //when
        reserve.setSeatNumber(1);
        int seatPosition = reserve.getSeatNumber();
        reserve.setSeatNumber(2);
        int seatPosition2 = reserve.getSeatNumber();
        //assert
        Assertions.assertNotEquals(seatPosition, seatPosition2);
    }

    @Test
    public void testThatASeatCannotBeBookedMoreThanOnce(){

    }
}