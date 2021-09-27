 package chapter10.Turtle;

import chapter10.Direction; import chapter10.SketchPad; import chapter10.TurtlePosition;

 public class Turtle {
     private TurtlePosition turtlePosition = new TurtlePosition(0, 0);
     private Direction direction = Direction.EAST;
     private Pen newPen = new Pen();

     public Pen getNewPen() {
         return newPen;
     }

     public void penDown() {
         newPen.setTurtlePositionTo(PenPosition.DOWN);
     }

     public void penUp() {
         newPen.setTurtlePositionTo(PenPosition.UP);
     }

     public Direction getCurrentDirection() {
         return direction;
     }

     public void turnRight() {
         if ( direction == Direction.NORTH ) direction = Direction.EAST;
         else if ( direction == Direction.WEST ) direction = Direction.NORTH;
         else if ( direction == Direction.SOUTH ) direction = Direction.WEST;
         else if ( direction == Direction.EAST ) direction = Direction.SOUTH;
     }

     public void turnLeft() {
         if ( direction == Direction.EAST ) direction = Direction.NORTH;
         else if ( direction == Direction.NORTH ) direction = Direction.WEST;
         else if ( direction == Direction.WEST ) direction = Direction.SOUTH;
         else if ( direction == Direction.SOUTH ) direction = Direction.EAST;
     }

     public TurtlePosition getCurrentPosition() {
         return turtlePosition;
     }

     public void moveForward(int numberOfSteps) {
         if ( direction == Direction.EAST ) {
             int currentColumnPosition = turtlePosition.getColumnPosition();
             turtlePosition.setColumnPosition(currentColumnPosition + numberOfSteps - 1);
         } else if ( direction == Direction.SOUTH ) {
             int rowPosition = turtlePosition.getRowPosition();
             turtlePosition.setRowPosition(rowPosition + numberOfSteps);
         } else if ( direction == Direction.WEST ) {
             int columnPosition = turtlePosition.getColumnPosition();
             turtlePosition.setColumnPosition(columnPosition - numberOfSteps);
         } else if ( direction == Direction.NORTH ) {
             int rowPosition = turtlePosition.getRowPosition();
             turtlePosition.setRowPosition(rowPosition - numberOfSteps);
         }
     }

     public void writeOn(SketchPad sketchPad, int numberOfMoves) {
         if ( this.newPen.getPosition() == PenPosition.DOWN ) {
             if ( this.direction == Direction.EAST ) {
                 int [][] floor = sketchPad.getFloor();
                 int rowPosition = turtlePosition.getRowPosition();
                 int columnPosition = turtlePosition.getColumnPosition();
                 for (int index = 0; index < numberOfMoves; index++){
                     floor[rowPosition][columnPosition+index] =1;
                 }
             }
         }
        moveForward(numberOfMoves);
     }
 }
 //fixme Same is used for singletons
//todo is also a keyword that highlights stuffs