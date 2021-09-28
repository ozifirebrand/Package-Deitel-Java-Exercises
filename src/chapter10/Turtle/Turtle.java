 package chapter10.Turtle;
import static chapter10.Turtle.Direction.*;
import static chapter10.Turtle.PenPosition.*;

 public class Turtle {
     private TurtlePosition turtlePosition = new TurtlePosition(0, 0);
     private Direction direction = EAST;
     private Pen newPen = new Pen();

     public Pen getNewPen() {
         return newPen;
     }

     public void penDown() {
         newPen.setPenPositionTo(DOWN);
     }

     public void penUp() {
         newPen.setPenPositionTo(UP);
     }

     public Direction getCurrentDirection() {
         return direction;
     }

     public void turnRight() {
         if ( direction == NORTH ) direction = EAST;
         else if ( direction == WEST ) direction = NORTH;
         else if ( direction == SOUTH ) direction = WEST;
         else if ( direction == EAST ) direction = SOUTH;
     }

     public void turnLeft() {
         if ( direction == EAST ) direction = NORTH;
         else if ( direction == NORTH ) direction = WEST;
         else if ( direction == WEST ) direction = SOUTH;
         else if ( direction == SOUTH ) direction = EAST;
     }

     public TurtlePosition getCurrentPosition() {
         return turtlePosition;
     }

     public void moveForward(int numberOfSteps) {

         if ( direction == EAST ) {
             int currentColumnPosition = turtlePosition.getColumnPosition();
             turtlePosition.setColumnPosition(currentColumnPosition + numberOfSteps - 1);
         } else if ( direction == SOUTH ) {
             int currentRowPosition = turtlePosition.getRowPosition();
             turtlePosition.setRowPosition(currentRowPosition + numberOfSteps -1);
         } else if ( direction == WEST ) {
             int columnPosition = turtlePosition.getColumnPosition();
             turtlePosition.setColumnPosition(columnPosition - numberOfSteps);
         } else if ( direction == NORTH ) {
             int rowPosition = turtlePosition.getRowPosition();
             turtlePosition.setRowPosition(rowPosition - numberOfSteps);
         }
     }

     public void writeOn(SketchPad sketchPad, int numberOfMoves) {
         int [][] floor = sketchPad.getFloor();
         int rowPosition = turtlePosition.getRowPosition();
         int columnPosition = turtlePosition.getColumnPosition();

         if ( this.newPen.getPosition() == DOWN ) {
             if ( this.direction == EAST ) {

                 for (int index = 0; index < numberOfMoves; index++){
                     floor[rowPosition][columnPosition+index] =1;
                 }
             }else if ( this.direction == SOUTH ){
                 for ( int index = 0; index < numberOfMoves; index++){
                     floor[rowPosition+index][columnPosition] = 1;
                 }
             } else if ( direction == WEST ) {
                 for (int index = 0; index< numberOfMoves; index++){
                     floor[rowPosition][columnPosition-index] = 1;
                 }
             }else if ( direction ==NORTH ){
                 for (int index = 0; index < numberOfMoves;index++){
                     floor[rowPosition-index][columnPosition]= 1;
                 }
             }
         }else if ( newPen.getPosition() == UP ){

             if ( direction == WEST ){
                 for (int index =0; index<numberOfMoves; index++){
                     floor[rowPosition][columnPosition-index] = 4;
                 }
             }else if ( direction == SOUTH ){
                 for (int index = 0; index < numberOfMoves; index++){
                     floor[rowPosition+index][columnPosition] =4;
                 }
             }else if ( direction==EAST ){
                 for (int index = 0; index < numberOfMoves; index++){
                     floor[rowPosition][columnPosition + index]= 4;
                 }
             }else if ( direction == NORTH ){
                 for (int index=0; index< numberOfMoves; index++){
                     floor[rowPosition-index][columnPosition] = 4;
                 }
             }
         }
        moveForward(numberOfMoves);
     }
 }
 //fixme Same is used for singletons
//todo is also a keyword that highlights stuffs