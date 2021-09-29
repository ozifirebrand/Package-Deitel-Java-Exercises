package ClassWork;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class SevenSegmentDisplayTest {
    @Test
    public void testThatScreenCanPrintZeros(){
        //given
        Screen screen = new Screen();
        //when
        screen.setScreen();
        //assert
        Assertions.assertEquals(new int[5] [4], screen.displayScreen());
    }
//
//    @Test
//    public void testThatRowsCanBeSetInScreen(){
//        //given
//        Screen screen = new Screen();
//        //when
//        screen.setScreenRow();
//        //assert
//        Assertions.assertEquals(4, screen.getScreenRow());
//    }
}