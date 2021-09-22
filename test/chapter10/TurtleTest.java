package chapter10;

import chapter10.Turtle.Pen;
import chapter10.Turtle.PenPosition;
import chapter10.Turtle.Turtle;
import chapter10.Turtle.TurtlePosition;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TurtleTest {

    @Test
    public void testThatTurtleHasAPen(){
        Turtle turtle = new Turtle();
        Pen pen = turtle.getNewPen();
        Assertions.assertNotNull(pen);
    }

    @Test
    public void testThatPenIsUpByDefault(){
        //given that we have
        Pen pen = new Pen();
        Assertions.assertSame(PenPosition.UP, pen.getPosition());
    }

    @Test
    public void testThatTurtleCanPlaceThePenDown(){
        //GIVEN
        Turtle turtle = new Turtle();
        Pen pen = new Pen();
        Assertions.assertSame(PenPosition.UP, pen.getPosition());

        //WHEN
        turtle.penDown();

        //ASSERT
        Assertions.assertSame(PenPosition.DOWN, turtle.getNewPen().getPosition());
    }

    @Test
    public void testThatPenCanComeUp(){
        Turtle turtle = new Turtle();
        Pen pen = new Pen();
        pen.setPenPosition(PenPosition.DOWN);
        Assertions.assertSame(PenPosition.DOWN, pen.getPenPosition());

        pen.setPenPosition(PenPosition.UP);
        Assertions.assertSame(PenPosition.UP, pen.getPenPosition());
    }

    @Test
    public void testThatTurtleCanTurnRight(){
        //given
        Turtle turtle = new Turtle();
        TurtlePosition turtlePosition = TurtlePosition.RIGHT;
        //when
        turtle.turnTurtleRight(turtlePosition);
        //assert(
        Assertions.assertSame(TurtlePosition.RIGHT, turtle.turtleHasTurnedRight());
    }

    @Test
    public void testThatTurtleCanTurnLeft(){
        //given
        Turtle turtle = new Turtle();

    }


}