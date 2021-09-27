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
    public void testThatTurtleCanTurnRight2() {
        //when
        turtle.turnRight();
        Assertions.assertSame(Direction.SOUTH, turtle.getCurrentDirection());
        turtle.turnRight();
        //assert
        Assertions.assertSame(Direction.WEST, turtle.getCurrentDirection());
    }

    @Test
    @DisplayName("Test that turtle can turn right while facing west")
    public void testThatTurtleCanTurnRight3() {
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
    public void testThatTurtleCanTurnRight4() {
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
    public void testThatTurtleCanTurnLeft() {
        turtle.turnLeft();
        Assertions.assertSame(Direction.NORTH, turtle.getCurrentDirection());
    }


    @Test
    @DisplayName("Test that turtle can turn left while facing north")
    public void testThatTurtleCanTurnLeft2() {
        turtle.turnLeft();
        Assertions.assertSame(Direction.NORTH, turtle.getCurrentDirection());
        turtle.turnLeft();
        Assertions.assertSame(Direction.WEST, turtle.getCurrentDirection());
    }

    @Test
    @DisplayName("Test that turtle can turn left while facing west")
    public void testThatTurtleCanTurnLeft3() {
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
    public void testThatTurtleCanTurnLeft4() {
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
    public void testThatTurtleCanMoveForwardWhileFacingEast() {
//        given
        Assertions.assertSame(Direction.EAST, turtle.getCurrentDirection());
        turtle.moveForward(5);
        Assertions.assertEquals(new TurtlePosition(0, 5), turtle.getCurrentPosition());
    }

    @Test
    @DisplayName("Test that turtle can move forward while facing south")
    public void testThatTurtleCanMoveForwardInSouth() {
        //given ...
        //when
        turtle.turnRight();
        turtle.moveForward(4);
        //assert
        Assertions.assertEquals(new TurtlePosition(4, 0), turtle.getCurrentPosition());
    }

    @Test
    @DisplayName("Test that turtle can move forward while on west position")
    public void testThatTurtleCanMoveForwardAtWest() {
        //given ...
        //when
        turtle.turnRight();
        turtle.turnRight();
        Assertions.assertSame(Direction.WEST, turtle.getCurrentDirection());
        turtle.moveForward(4);
        //assert
        Assertions.assertEquals(new TurtlePosition(0, -4), turtle.getCurrentPosition());
    }

    @Test
    @DisplayName("Test that turtle can move forward while on north direction")
    public void testThatTurtleCanMoveForwardAtNorth() {
        //given ...
        //when
        turtle.turnRight();
        turtle.turnRight();
        turtle.turnRight();
        Assertions.assertSame(Direction.NORTH, turtle.getCurrentDirection());
        turtle.moveForward(4);
        //assert
        Assertions.assertEquals(new TurtlePosition(-4, 0), turtle.getCurrentPosition());
    }

    @Test
    public void testCanWriteOnSketchPad() {
        //given
        turtle.penDown();
        Assertions.assertSame(Direction.EAST, turtle.getCurrentDirection());
        SketchPad sketchPad = new SketchPad(5, 5);
        turtle.writeOn(sketchPad, 3);
        //assert
        int[][] floor = sketchPad.getFloor();
        Assertions.assertEquals(1, floor[0][0]);
        Assertions.assertEquals(1, floor[0][1]);
        Assertions.assertEquals(1, floor[0][2]);
        Assertions.assertEquals(0, sketchPad.getFloor()[0][3]);
        Assertions.assertEquals(new TurtlePosition(0, 2), turtle.getCurrentPosition());
        sketchPad.displayFloor();
    }
}