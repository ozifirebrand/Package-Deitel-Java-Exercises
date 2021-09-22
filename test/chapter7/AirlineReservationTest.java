package chapter7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirlineReservationTest {

    @Test
    public static void main(String[] args) {
        AirlineReservation reserve = new AirlineReservation();
        reserve.makeReservation();
        reserve.makeReservation();
        reserve.makeReservation();
        reserve.makeReservation();
        reserve.makeReservation();
        reserve.makeReservation();
        reserve.makeReservation();
        reserve.makeReservation();
        reserve.makeReservation();
        reserve.makeReservation();
        reserve.makeReservation();
        reserve.assignFirstClassWhenEconomyIsFull();
    }

}