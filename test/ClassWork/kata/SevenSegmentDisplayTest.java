package ClassWork.kata;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class SevenSegmentDisplayTest {
    SevSegDisplay display;
    @BeforeEach
    public void setUp(){
        display = new SevSegDisplay();
        display.clear();

    }
    @Test
    public void testThatCanClear(){
        //given...
        //when
        int [][] emptyScreen = new int[5][4];
        //assert
        Assertions.assertArrayEquals(emptyScreen, display.getScreen());
    }

    @Test
    public void testCanWriteOnA(){
        //given ...
        //when
        display.writeOnA();
        var screen = display.getScreen();
        //assert
        for (int index =0; index< 4; index++ ){
            Assertions.assertEquals(1, screen[0][index]);
        }
        Assertions.assertEquals(0, screen[1][3]);
    }

    @Test
    public void testCanWriteOnB(){
        //given ...
        //when
        display.writeOnB();
        var screen = display.getScreen();
        //assert
        for (int row = 0; row<3; row++){
            Assertions.assertEquals(1, screen[row][3]);
        }
        Assertions.assertEquals(0, screen[0][1]);
    }

    @Test
    public void testCanWriteOnC(){
        //given ...
        //when
        display.writeOnC();
        int [][] screen = display.getScreen();
        //assert
        for (int row = 2; row< 5; row++){
            Assertions.assertEquals(1, screen[row][3]);
        }
    }

    @Test
    public void test8(){
        display.setScreen("11111111");
        display.display();
    }

    @Test
    public void testCanWriteOnD() {
        //given ...
        //when
        display.clear();
        display.writeOnD();
        int[][] screen = display.getScreen();
        //assert
        for (int column = 0; column < 4; column++) {
            Assertions.assertEquals(1, screen[4][column]);
        }
    }

    @Test
    public void testCanWriteOnE(){
        //given ...
        //when
        display.clear();
        display.writeOnE();
        int [][] screen = display.getScreen();
        //assert
        for (int row = 2; row< 5; row++){
            Assertions.assertEquals(1, screen[row][0]);
        }
    }

    @Test
    public void testCanWriteOnF(){
        //given ...
        //when
        display.clear();
        display.writeOnF();
        var screen = display.getScreen();
        //assert
        for (int row = 0; row<3; row++){
            Assertions.assertEquals(1, screen[row][0]);
        }
    }

    @Test
    public void testCanWriteOnG(){
        //given ...
        //when
        display.clear();
        display.writeOnG();
        int [][] screen = display.getScreen();
        //assert
        for (int column = 0; column<3; column++){
            Assertions.assertEquals(1, screen[2][column]);
        }
    }

    @Test
    public void testDisplay(){
        //given ...
        //when
        display.clear();
        display.writeOnA();
        display.writeOnB();
        display.writeOnC();
        display.writeOnD();
        display.writeOnE();
        display.writeOnF();
        display.writeOnG();
        //assert
        display.display();
    }

    @Test
    public void thereCanOnlyBeEightDigitTest(){
        Assertions.assertThrows(IllegalArgumentException.class, ()-> display.setScreen("111111111"));
    }

    @Test
    public void testThatInputDoesNotCollectNumbersApartFrom0and1(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->display.setScreen("28746106194"));
    }

    @Test
    public void lastOneBitCanRunTheCode(){
        display.setScreen("11001100");
        int [][] screen = display.getScreen();
        for (int i = 2; i< 5; i++){
            Assertions.assertEquals(0, screen[i][3]);
        }
    }

    @Test
    public void trailingZerosTest(){
        display.setScreen("1111");
        int [][] screen = display.getScreen();
        for (int i = 0; i < 4; i++){
            Assertions.assertEquals(0, screen[0][i]);
        }
    }

}