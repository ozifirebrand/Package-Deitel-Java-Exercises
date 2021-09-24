package chapter10;

import chapter10.Turtle.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TurtleTest {
    Turtle turtle;
    Pen pen;

    @BeforeEach
    public void setUp() {
        turtle = new Turtle();
        pen = turtle.getNewPen();
    }

    @Test
    @DisplayName("Test that turtle has a pen")
    public void testThatTurtleHasAPen() {
        Assertions.assertNotNull(pen);
    }

    @Test
    @DisplayName("Test that pen is up by default")
    public void testThatPenIsUpByDefault() {
        //given that we have
        Assertions.assertSame(PenPosition.UP, pen.getPosition());
    }

    @Test
    @DisplayName("Test that turtle can turn turn pen down")
    public void testThatTurtleCanPlaceThePenDown() {
        //GIVEN
        Assertions.assertSame(PenPosition.UP, pen.getPosition());
        //WHEN
        turtle.penDown();
        //ASSERT
        Assertions.assertSame(PenPosition.DOWN, pen.getPosition());
    }

    @Test
    @DisplayName("Test that turtle can turn turn pen up")
    public void testThatPenCanComeUp() {
        turtle.penDown();
        Assertions.assertSame(PenPosition.DOWN, pen.getPenPosition());

        turtle.penUp();
        Assertions.assertSame(PenPosition.UP, pen.getPenPosition());
    }

    @Test
    @DisplayName("Test that turtle can turn right while facing east")
    public void testThatTurtleCanTurnRight() {
        Assertions.assertSame(Direction.EAST, turtle.getCurrentDirection());
        turtle.turnRight();
        Assertions.assertSame(Direction.SOUTH, turtle.getCurrentDirection());
    }

    @Test
    @DisplayName("Test that turtle can turn right while facing south")
    public void testThatTurtleCanTurnRight2(){
        //when
        turtle.turnRight();
        Assertions.assertSame(Direction.SOUTH, turtle.getCurrentDirection());
        turtle.turnRight();
        //assert
        Assertions.assertSame(Direction.WEST, turtle.getCurrentDirection());
    }

    @Test
    @DisplayName("Test that turtle can turn right while facing west")
    public void testThatTurtleCanTurnRight3(){
        //given
        turtle.turnRight();
        Assertions.assertSame(Direction.SOUTH, turtle.getCurrentDirection());
        turtle.turnRight();
        Assertions.assertSame(Direction.WEST, turtle.getCurrentDirection());
        //when
        turtle.turnRight();
        //assert
        Assertions.assertSame(Direction.NORTH, turtle.getCurrentDirection());
    }

    @Test
    @DisplayName("Test that turtle can turn right while facing north")
    public void testThatTurtleCanTurnRight4(){
        //given
        turtle.turnRight();
        Assertions.assertSame(Direction.SOUTH, turtle.getCurrentDirection());
        turtle.turnRight();
        Assertions.assertSame(Direction.WEST, turtle.getCurrentDirection());
        turtle.turnRight();
        Assertions.assertSame(Direction.NORTH, turtle.getCurrentDirection());
        //when
        turtle.turnRight();
        //assert
        Assertions.assertSame(Direction.EAST, turtle.getCurrentDirection());
    }

    @Test
    @DisplayName("Test that turtle can turn left while facing east")
    public void testThatTurtleCanTurnLeft(){
        turtle.turnLeft();
        Assertions.assertSame(Direction.NORTH, turtle.getCurrentDirection());
    }


    @Test
    @DisplayName("Test that turtle can turn left while facing north")
    public void testThatTurtleCanTurnLeft2(){
        turtle.turnLeft();
        Assertions.assertSame(Direction.NORTH, turtle.getCurrentDirection());
        turtle.turnLeft();
        Assertions.assertSame(Direction.WEST, turtle.getCurrentDirection());
    }

    @Test
    @DisplayName("Test that turtle can turn left while facing west")
    public void testThatTurtleCanTurnLeft3(){
        //WHEN
        turtle.turnLeft();
        Assertions.assertSame(Direction.NORTH, turtle.getCurrentDirection());
        turtle.turnLeft();
        Assertions.assertSame(Direction.WEST, turtle.getCurrentDirection());
        turtle.turnLeft();
        //ASSERT
        Assertions.assertSame(Direction.SOUTH, turtle.getCurrentDirection());
    }

    @Test
    @DisplayName("Test that turtle can turn left while facing south")
    public void testThatTurtleCanTurnLeft4(){
        //WHEN
        turtle.turnLeft();
        Assertions.assertSame(Direction.NORTH, turtle.getCurrentDirection());
        turtle.turnLeft();
        Assertions.assertSame(Direction.WEST, turtle.getCurrentDirection());
        turtle.turnLeft();
        Assertions.assertSame(Direction.SOUTH, turtle.getCurrentDirection());
        //ASSERT
        turtle.turnLeft();
        Assertions.assertSame(Direction.EAST, turtle.getCurrentDirection());
    }

    @Test
    @DisplayName("Test that turtle can move forward while facing east")
    public void testThatTurtleCanMoveForwardWhileFacingEast(){
//        given
        TurtlePosition turtlePosition= new TurtlePosition(0,0);
        Assertions.assertEquals(turtle.getCurrentPosition(), turtlePosition);
        turtle.moveForward();
        Assertions.assertEquals(new TurtlePosition(0,1), turtle.getCurrentPosition());
        TurtlePosition pos = new TurtlePosition(0,0);
    }

//    @Test
//    @DisplayName("Test that turtle can move forward while facing east")
//    public void
}