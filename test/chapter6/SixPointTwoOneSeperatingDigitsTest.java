package chapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SixPointTwoOneSeperatingDigitsTest {

    @Test
    public void testReturnQuotient() {
        int returnedQuotient = SixPointTwoOneSeperatingDigits.returnQuotient(14, 3);
        assertEquals(4, returnedQuotient);
    }

    @Test
    public void testReturnRemainder() {
        int returnedRemainder = SixPointTwoOneSeperatingDigits.returnRemainder(14, 3);
        assertEquals(2, returnedRemainder);
    }

    @Test
    public void testFindDivisor() {
        assertEquals(1000, SixPointTwoOneSeperatingDigits.findDivisor(2349));
    }

    @Test
    public void testCanDisplaySplittedInput() {
        assertEquals("5 0 9 5 4 6 ", SixPointTwoOneSeperatingDigits.displayDigits(509546));
//fixme :display works yet test is failing. Why?
    }
}