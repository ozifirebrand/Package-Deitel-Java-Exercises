package chapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SixPointOneFourExponentiationTest {

    @Test
    public void testIntegerPower(){
        int exponentialValue = SixPointOneFourExponentiation.findIntegerPower(2, 4);
        assertEquals(16, exponentialValue);
    }

}