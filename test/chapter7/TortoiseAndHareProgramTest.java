package chapter7;

import chapter7.TortoiseAndHareProgram.Field;
import chapter7.TortoiseAndHareProgram.Hare;
import chapter7.TortoiseAndHareProgram.Tortoise;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TortoiseAndHareProgramTest {
    @Test
    public void testThereIsATurtle(){
        //given
        Tortoise tortoise = new Tortoise();
        //assert
        assertNotNull(tortoise);
    }

    @Test
    public void testThereIsAHare(){
        //given
        Hare hare = new Hare();
        //assert
        assertNotNull(hare);
    }

    @Test
    public void testThereAre20RowsAndColumnsInField(){
        //given
        Field field = new Field();
        //assert
        assertEquals(20, field.getNumberOfRowsInField());
        assertEquals(20, field.getNumberOfColumnsInField());
    }

    @Test
    public void testFieldContainsATortoiseAndAHare(){
        //given
        Field field = new Field();
        //assert
        assertNotNull(field.getTortoise());
        assertNotNull(field.getHare());
    }
/*Random numbers are generated
Racers start at position 1 of 70 squares
Racers are Hare and Tortoise
Racers can only move forward or sideways per second
Tortoise Fast plod  50% 3  squares to the right
         Slip       20% 6  squares to the left
         Slow plod  30% 1  square to the right
    Hare Sleep      20%    No move at all
         Big hop    20% 9  squares to the right
         Big slip   10% 12 squares to the left
         Small hop  30% 1  square to the right
         Small slip 20% 2  squares to the left
 */
    @Test
    public void testHarePositionOnFieldIsAtPoint1(){
        //given
//        Field field = new Field();
//        //assert
//        assertEquals([0] ,field.getHarePosition());
    }




}
