package chapter10.Turtle;
import chapter10.Turtle.*;

import java.util.Scanner;

public class TurtleMain {
    Turtle turtle = new Turtle();
    SketchPad sketchPad = new SketchPad(20, 20);
    TurtlePosition turtlePosition = new TurtlePosition(10, 10);

    public void implementTurtle(int input){
        if ( input == 1 ){
            turtle.penUp();
        }
        if ( input==2 ){
            turtle.penDown();
        }
        if ( input == 3 ){
            turtle.turnRight();
        }
        if ( input==4 ){
            turtle.turnLeft();
        }
        if ( input == 6 ){
            sketchPad.displayFloor();
        }
    }

    public void writeOnSketchpad(int input, int numberOfMoves){
        if ( input==5 ){
            turtle.writeOn(sketchPad, numberOfMoves);
        }
    }


    public static void main(String[] args) {
        TurtleMain turtleMain = new TurtleMain();
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        while (input!=9){
            if ( input == 1 || input==2 || input==3|| input==4|| input==6 ) {
                turtleMain.implementTurtle(input);
            }
//            }else if ( input ==5 ){
//                turtleMain.writeOnSketchpad(input);
//            }
        }
    }
}
