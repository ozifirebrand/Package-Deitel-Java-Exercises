package ClassWork;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class SevenSegmentDisplayTest {
    @Test
    public void testThatScreenCanPrintZeros(){
        //given
        int [][] screenDisplay = new int[5][4];
        Screen screen = new Screen(screenDisplay);
        //when
        screen.setScreen();
        //assert
        Assertions.assertEquals(new int[5][4] , screen.displayScreen());
    }

}