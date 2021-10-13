package chapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExponentiationTest {

    @Test
    public void testIntegerPower(){
        int exponentialValue = Exponentiation.findIntegerPower(2, 4);
        assertEquals(16, exponentialValue);
    }

}