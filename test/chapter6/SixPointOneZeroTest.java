package chapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SixPointOneZeroTest {
//
//    SixPointOneZero roundUpNumber;
//    @BeforeEach
//    void setUp() {
//        roundUpNumber = new SixPointOneZero();
//    }

    @Test
    public void testCanRoundUpToTheNearestInteger(){
        //given
        double number = 54.3589;
        //when
        double gottenValue = SixPointOneZero.roundUpNumberToInteger(number);
        assertEquals(54, gottenValue);
    }
    @Test
    public void testCanRoundUpToTheNearestTenths(){
        //given
        double number = 54.3589;
        //when
        double gottenValue = SixPointOneZero.roundUpNumberToTenths(number);
        assertEquals(54.4, gottenValue);
    }
    @Test
    public void testCanRoundUpToTheNearestHundredths(){
        //given
        double number = 54.3589;
        //when
        double gottenValue = SixPointOneZero.roundUpNumberToHundredths(number);
        assertEquals(54.36, gottenValue);
    }
    @Test
    public void testCanRoundUpToTheNearestThousandths(){
        //given
        double number = 54.3589;
        //when
        double gottenValue = SixPointOneZero.roundUpNumberToThousandths(number);
        assertEquals(54.359, gottenValue);
    }

}