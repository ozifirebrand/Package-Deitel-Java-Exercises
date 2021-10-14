package chapter6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SixPointThreeFiveLearningMultiplicationTest {
    @Test
    public void testMultiplyNumbers(){
        assertEquals(48, SixPointThreeFiveLearningMultiplication.multiplyQuestions(8, 6));
    }
//    @Test
//    public void testCompareInputAndMultiplicationAnswer(){
//        assertTrue(SixPointThreeFiveLearningMultiplication.isGreaterThan(6, 4));
//    }

    @Test
    public void testCanGenerateRandomNumber(){
        int number = SixPointThreeFiveLearningMultiplication.generateNumber();
        Assertions.assertNotEquals(13, number);
        Assertions.assertNotEquals(0, number);
    }

    @Test
    public void testCanGiveResponse(){
        assertEquals("Too low. Keep trying.", SixPointThreeFiveLearningMultiplication.giveResponse1(5,6));
        assertEquals("Too high. Keep trying!", SixPointThreeFiveLearningMultiplication.giveResponse1(7,6));
        assertEquals("Good job. Wonderful!", SixPointThreeFiveLearningMultiplication.giveResponse1(6,6));
        }

    @Test
    public void testCanThrowExceptionIfWrongInputIsInputted(){

    }
}