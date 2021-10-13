package chapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SixPointOneFiveHypotenuseProgramTest {

    @Test
    public void testCanCalculateHypotenuse(){
        double hypotenuse = SixPointOneFiveHypotenuseProgram.calculateHypotenuse(3, 4);
        assertEquals(5, hypotenuse);
    }
}