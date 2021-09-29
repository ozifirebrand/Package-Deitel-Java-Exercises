package ClassWork;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;


class SevenSegmentDisplayTest {
    @Test
    public void testThatScreenCanPrintZeros(){
        //given
        Screen screen = new Screen();
        //when
        screen.setScreen();
        //assert
        Assertions.assertEquals(0, screen.displayScreenValue());
    }
}