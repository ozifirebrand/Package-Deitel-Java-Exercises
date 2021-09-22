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
    public void testThatTurtleHasAPen() {
        Assertions.assertNotNull(pen);
    }

    @Test
    public void testThatPenIsUpByDefault() {
        //given that we have
        Assertions.assertSame(PenPosition.UP, pen.getPosition());
    }

    @Test
    public void testThatTurtleCanPlaceThePenDown() {
        //GIVEN
        Assertions.assertSame(PenPosition.UP, pen.getPosition());

        //WHEN
        turtle.penDown();

        //ASSERT
        Assertions.assertSame(PenPosition.DOWN, pen.getPosition());
    }

    @Test
    public void testThatPenCanComeUp() {
        turtle.penDown();
        Assertions.assertSame(PenPosition.DOWN, pen.getPenPosition());

        turtle.penUp();
        Assertions.assertSame(PenPosition.UP, pen.getPenPosition());
    }

    @Test
    @DisplayName("Turtle can turn right when facing east test")
    public void testThatTurtleCanTurnRight() {
        Assertions.assertSame(Direction.EAST, turtle.getCurrentDirection());
        turtle.turnRight();
        Assertions.assertSame(Direction.SOUTH, turtle.getCurrentDirection());
    }

    @Test
    @DisplayName("Turtle can turn right when facing south test.")
    public void testThatTurtleCanTurnRight2(){
        //when
        turtle.turnRight();
        turtle.turnRight();
        //assert
        Assertions.assertSame(Direction.WEST, turtle.getCurrentDirection());
    }

    @Test
    public void testThatTurtleCanTurnRight3(){
        //when
        turtle.turnRight();
        turtle.turnRight();
        turtle.turnRight();
        Assertions.assertSame(Direction.NORTH, turtle.getCurrentDirection());
    }
}