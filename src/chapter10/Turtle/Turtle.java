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

    public void turnRight() {
        if ( direction == Direction.EAST ) {
            direction = Direction.SOUTH;
        }else if ( direction == Direction.SOUTH ){
            direction = Direction.WEST;
        }else if ( direction == Direction.WEST ){
            direction = Direction.NORTH;
        }
    }
}