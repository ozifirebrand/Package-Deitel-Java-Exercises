package chapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SixPointThreeFiveLearningMultiplicationTest {
    @Test
    public void testMultiplyNumbers(){
        assertEquals(48, SixPointThreeFiveLearningMultiplication.multiplyQuestions(8, 6));
    }
    @Test
    public void testCompareInputAndMultiplicationAnswer(){
        assertTrue(SixPointThreeFiveLearningMultiplication.isGreaterThan(6, 4));
    }
    @Test
    public void testCanGenerateRandomNumber(){
        int number = SixPointThreeFiveLearningMultiplication.generateNumber();
        assertNotNull(number);
    }

    // todo Static methods do not interfere with anybody or class or object
    // todo given == preconditions
    // todo when == main flow
    // todo assert ==  post condition

}