package chapter3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BikeTest {

    @Test
    public void testThatBikeCanComeOn(){
        Bike bajaj = new Bike();
        bajaj.switchOnOff();
        bajaj.switchOnOff();
        assertFalse(false);

    }

    @Test
    public void testThatBikeCanComeOff(){
        Bike bajaj = new Bike();
        bajaj.switchOnOff();
        bajaj.switchOnOff();
        bajaj.switchOnOff();
        assertFalse(false);
    }

    @Test
    public void testThatGearOneAcceleratesByOne(){
        Bike bajaj = new Bike();
        bajaj.switchOnOff();
        bajaj.switchOnOff();
        bajaj.accelerateGear(1, 15);
        bajaj.accelerateGear(1, 16);
        assertEquals(17, bajaj.currentSpeed());
    }

    @Test
    public void testThatGearOneCannotIncrementBeyondOneAtATime(){
        Bike bajaj = new Bike();
        bajaj.switchOnOff();
        bajaj.switchOnOff();
        bajaj.accelerateGear(1,12);
        Assertions.assertEquals(14, bajaj.currentSpeed(), "Speed cannot increment beyond one in gear one");
    }

    @Test
    public void testThatGearTwoAcceleratesByTwo(){
        Bike bajaj = new Bike();
        bajaj.switchOnOff();
        bajaj.switchOnOff();
        bajaj.accelerateGear(2, 15);
        bajaj.accelerateGear(2, 17);
        assertEquals(19, bajaj.currentSpeed());
    }

    @Test
    public void testThatGearTwoCannotIncrementBeyondTwoAtATime(){
        Bike bajaj = new Bike();
        bajaj.switchOnOff();
        bajaj.switchOnOff();
        bajaj.accelerateGear(1,22);
        assertEquals(25 , bajaj.currentSpeed(), "Speed cannot increment beyond two in gear two");
    }

    @Test
    public void testThatGearThreeAcceleratesByThree(){
        Bike bajaj = new Bike();
        bajaj.switchOnOff();
        bajaj.switchOnOff();
        bajaj.accelerateGear(3, 23);
        assertEquals(26, bajaj.currentSpeed());
    }

    @Test
    public void testThatGearThreeCannotIncrementBeyondThreeAtATime(){
        Bike bajaj = new Bike();
        bajaj.switchOnOff();
        bajaj.switchOnOff();
        bajaj.accelerateGear(3,23);
        assertEquals(27 , bajaj.currentSpeed(), "Speed cannot increment beyond three in gear three");
    }
@Test
public void testThatGearFourAcceleratesByFour(){
    Bike bajaj = new Bike();
    bajaj.switchOnOff();
    bajaj.switchOnOff();
    bajaj.accelerateGear(4, 36);
    assertEquals(40, bajaj.currentSpeed());
}

    @Test
    public void testThatGearFourCannotIncrementBeyondFourAtATime(){
        Bike bajaj = new Bike();
        bajaj.switchOnOff();
        bajaj.switchOnOff();
        bajaj.accelerateGear(4,36);
        assertEquals(41 , bajaj.currentSpeed(), "Speed cannot increment beyond four in gear four");
    }

    @Test
    public void testThatGearOneDeceleratesByOne(){
        Bike bajaj = new Bike();
        bajaj.switchOnOff();
        bajaj.switchOnOff();
        bajaj.decelerateGear(1, 2);
        assertEquals(1, bajaj.currentSpeed());
    }

    @Test
    public void testThatGearOneCannotDecrementBeneathOneAtATime(){
        Bike bajaj = new Bike();
        bajaj.switchOnOff();
        bajaj.switchOnOff();
        bajaj.decelerateGear(1,3);
        assertEquals(1 , bajaj.currentSpeed(), "Speed cannot decrease below one in gear one");
    }
    @Test
    public void testThatGearTwoDeceleratesByTwo(){
        Bike bajaj = new Bike();
        bajaj.switchOnOff();
        bajaj.switchOnOff();
        bajaj.decelerateGear(2, 15);
        assertEquals(13, bajaj.currentSpeed());
    }

    @Test
    public void testThatGearTwoCannotDecrementBeneathTwoAtATime(){
        Bike bajaj = new Bike();
        bajaj.switchOnOff();
        bajaj.switchOnOff();
        bajaj.decelerateGear(2,14);
        assertEquals(11 , bajaj.currentSpeed(), "Speed cannot decrease below two in gear two");
    }

    @Test
    public void testThatGearThreeDeceleratesByThree(){
        Bike bajaj = new Bike();
        bajaj.switchOnOff();
        bajaj.switchOnOff();
        bajaj.decelerateGear(3, 20);
        assertEquals(17, bajaj.currentSpeed());
    }

    @Test
    public void testThatGearThreeCannotDecrementBeneathThreeAtATime(){
        Bike bajaj = new Bike();
        bajaj.switchOnOff();
        bajaj.switchOnOff();
        bajaj.decelerateGear(3,25);
        assertEquals(20 , bajaj.currentSpeed(), "Speed cannot decrease below three in gear three");
    }
    @Test
    public void testThatGearFourDeceleratesByFour(){
        Bike bajaj = new Bike();
        bajaj.switchOnOff();
        bajaj.switchOnOff();
        bajaj.decelerateGear(4, 39);
        assertEquals(35, bajaj.currentSpeed());
    }

    @Test
    public void testThatGearFourCannotDecrementBeneathFourAtATime(){
        Bike bajaj = new Bike();
        bajaj.switchOnOff();
        bajaj.switchOnOff();
        bajaj.decelerateGear(4,39);
        assertEquals(33 , bajaj.currentSpeed(), "Speed cannot decrease below four in gear four");
    }

    @Test
    public void testThatGearAcceleratesWhenSpeedExceedsMaxLimitOfGearOne() {
        Bike bajaj = new Bike();
        bajaj.switchOnOff();
        bajaj.switchOnOff();
        bajaj.changeGear(21, 1);
        assertEquals(2, bajaj.displayGearLevel());

    }
    @Test
    public void testThatGearAcceleratesWhenSpeedExceedsMaxLimitOfGearTwo(){
        Bike bajaj = new Bike();
        bajaj.switchOnOff();
        bajaj.switchOnOff();
        bajaj.changeGear(31, 2);
        assertEquals(3,bajaj.displayGearLevel());}

    @Test
    public void testThatGearAcceleratesWhenSpeedExceedsMaxLimitOfGearThree(){
        Bike bajaj = new Bike();
        bajaj.switchOnOff();
        bajaj.switchOnOff();
        bajaj.changeGear(41, 3);
        assertEquals(4,bajaj.displayGearLevel());}

    @Test
    public void testThatGearTwoDeceleratesWhenSpeedFallsBelowMinLimitOfGearTwo() {
        Bike bajaj = new Bike();
        bajaj.switchOnOff();
        bajaj.switchOnOff();
        bajaj.changeGear(20, 2);
        assertEquals(1, bajaj.displayGearLevel());
    }

    @Test
    public void testThatGearThreeDeceleratesWhenSpeedFallsBelowMinLimitOfGearThree() {
        Bike bajaj = new Bike();
        bajaj.switchOnOff();
        bajaj.switchOnOff();
        bajaj.changeGear(30, 3);
        assertEquals(2,bajaj.displayGearLevel());

    }

    @Test
    public void testThatGearFourDeceleratesWhenSpeedFallsBelowMinLimitOfGearFour() {
        Bike bajaj = new Bike();
        bajaj.switchOnOff();
        bajaj.switchOnOff();
        bajaj.changeGear(40, 4);
        assertEquals(3,bajaj.displayGearLevel());
    }
    }