package chapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SixPointTwoOneSeperatingDigitsTest {

    @Test
    public void testReturnQuotient(){
        int returnedQuotient = SixPointTwoOneSeperatingDigits.returnQuotient(14, 3);
        assertEquals(4, returnedQuotient);
    }
    @Test
    public void testReturnRemainder(){
        int returnedRemainder = SixPointTwoOneSeperatingDigits.returnRemainder(14, 3);
        assertEquals(2, returnedRemainder);
    }
    @Test
    public void testCanSplitInput(){
        String splitDigits = SixPointTwoOneSeperatingDigits.splitInput(4362);
        assertSame("4 3 6 2", splitDigits);
    }

}