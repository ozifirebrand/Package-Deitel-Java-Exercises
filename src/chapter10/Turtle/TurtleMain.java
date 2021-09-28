package chapter10.Turtle;
import chapter10.Turtle.*;

import java.util.Scanner;

public class TurtleMain {
    public void implementTurtle(int input, int numberOfMoves){
        Turtle turtle = new Turtle();
        SketchPad sketchPad = new SketchPad(20, 20);
        TurtlePosition turtlePosition = new TurtlePosition(10, 10);
        if ( input == 1 ){
            numberOfMoves=0;
            turtle.penUp();
        }
        if ( input==2 ){
            numberOfMoves=0;
            turtle.penDown();
        }
        if ( input == 3 ){
            numberOfMoves=0;
            turtle.turnRight();
        }
        if ( input==4 ){
            numberOfMoves=0;
            turtle.turnLeft();
        }
        if ( input==5){
            turtle.writeOn(sketchPad, numberOfMoves);
        }
        if ( input == 6 ){
            sketchPad.displayFloor();
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        while (input!=9){
            if ( input == 1 ){

            }
        }


    }
}
