package chapter10.Turtle;

import chapter10.Direction;

public class Turtle {
    private Direction direction = Direction.EAST;
    private Pen newPen = new Pen();

    public Pen getNewPen() {
        return newPen;
    }

    public void penDown() {
        newPen.setTurtlePositionTo(PenPosition.DOWN);
    }

    public void penUp(){
        newPen.setTurtlePositionTo(PenPosition.UP);
    }


    public Direction getCurrentDirection() {
        return direction;
    }
//fixme Same is used for singletons
    //todo is also a keyword that highlights stuffs
    public void turnRight() {
        if ( direction == Direction.NORTH ) direction = Direction.EAST;
       else if ( direction == Direction.WEST ) direction = Direction.NORTH;
       else if ( direction == Direction.SOUTH ) direction = Direction.WEST;
       else if ( direction == Direction.EAST ) direction = Direction.SOUTH;
    }

    public void turnLeft(){
        if ( direction == Direction.EAST ) direction = Direction.NORTH;
        else if ( direction == Direction.NORTH ) direction = Direction.WEST;
        else if ( direction == Direction.WEST ) direction = Direction.SOUTH;
        else if ( direction == Direction.SOUTH ) direction = Direction.EAST;
    }
}