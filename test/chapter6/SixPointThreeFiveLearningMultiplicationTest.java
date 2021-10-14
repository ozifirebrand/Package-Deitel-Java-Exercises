package chapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SixPointThreeFiveLearningMultiplicationTest {
    @Test
    public void testMultiplyNumbers(){
        assertEquals(48, SixPointThreeFiveLearningMultiplication.multiplyQuestions(8, 6));
    }
//
//    @Test
//    public void testIsLowerThan(){
//        assertTrue(SixPointThreeFiveLearningMultiplication.isLowerThan(3, 5));
//    }
//
//    @Test
//    public void testCanGenerateRandomNumber() {
//        int number = SixPointThreeFiveLearningMultiplication.generateNumber();
//        assertNotEquals(13, number);
//        assertNotEquals(0, number);
//
//
//        @Test
//        public void testTooHighResponse () {
//            assertEquals("Too high. Keep trying!", SixPointThreeFiveLearningMultiplication.giveTooHighResponse(5, 3));
//        }
//
//        @Test
//        public void testTooLowResponse () {
//            assertEquals("Too low. Keep trying.", SixPointThreeFiveLearningMultiplication.giveTooLowResponse(5, 6));
//        }
//        @Test
//        public void testEqualsResponse () {
//            assertEquals("Good job. Wonderful!", SixPointThreeFiveLearningMultiplication.giveEqualsResponse(6, 6));
//        }
    }