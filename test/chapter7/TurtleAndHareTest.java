package chapter7;

import chapter7.TortoiseAndHareProgram.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TurtleAndHareTest {
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
        public void testThereIsAClock(){
            //given
            Clock clock = new Clock();
            //assert
            assertNotNull(clock);
    }

    @Test
    public void testFieldContainsATortoiseAndAHare(){
        //given
        Field field = new Field();
        //assert
        assertNotNull(field.getTortoise());
        assertNotNull(field.getHare());
    }

//    @Test
//    public void testCanMoveOnField(){
//        //given
//        Field field = new Field();
//        //assert
//        assertNotNull(field.getTortoise());
//        assertNotNull(field.getHare());
//    }




}
