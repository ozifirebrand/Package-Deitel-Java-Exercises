package chapter10.Turtle;
import chapter10.Turtle.*;

import java.util.ArrayList;
import java.util.Scanner;

public class TurtleMain {
    public static void main(String[] args) {
        Turtle turtle = new Turtle();
        SketchPad sketchPad = new SketchPad(20, 20);
        TurtlePosition turtlePosition = new TurtlePosition(0, 0);
        ArrayList<Integer> turtleInputs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                1 = Pen up
                2 = Pen down
                3 = Turn right
                4 = Turn left
                5, 10 = Move forward 10 spaces (replace 10 for a different number of spaces)
                6 = Display the 20-by-20 array
                9 = End of data (sentinel)""");
        int input = scanner.nextInt();
        while (input != 9) {
            turtleInputs.add(input);
            input = scanner.nextInt();
        }
        for (int index=0; index< turtleInputs.size(); index++) {

            boolean firstIndexEqualsOne = turtleInputs.get(0) == 1;
            boolean firstIndexEqualsTwo = turtleInputs.get(0) == 2;
            boolean firstIndexEqualsThree = turtleInputs.get(0) == 3;
            boolean firstIndexEqualsFour = turtleInputs.get(0) == 4;
            boolean firstIndexEqualsFive = turtleInputs.get(0) == 5;
            boolean firstIndexEqualsSix = turtleInputs.get(0) == 6;

            boolean inputFromPreviousIndexNotEqualToFive = turtleInputs.get(index - 1) != 5;

            int inputAtIndex = turtleInputs.get(index);
            int inputAtNextIndex = turtleInputs.get(index + 1);

            if ( index == 0 ) {
                if ( firstIndexEqualsOne ) {
                    turtle.penUp();
                } else if ( firstIndexEqualsTwo ) {
                    turtle.penDown();
                } else if ( firstIndexEqualsThree ) {
                    turtle.turnRight();
                } else if ( firstIndexEqualsFour ) {
                    turtle.turnLeft();
                } else if ( firstIndexEqualsFive ) {
                    turtle.writeOn(sketchPad, inputAtNextIndex);
                } else if ( firstIndexEqualsSix ) {
                    sketchPad.displayFloor();
                }
            } else {
                if ( inputAtIndex == 1 && inputFromPreviousIndexNotEqualToFive ) {
                    turtle.penUp();
                } else if ( inputAtIndex == 2 && inputFromPreviousIndexNotEqualToFive ) {
                    turtle.penDown();
                } else if ( inputAtIndex == 3 && inputFromPreviousIndexNotEqualToFive ) {
                    turtle.turnRight();
                } else if ( inputAtIndex == 4 && inputFromPreviousIndexNotEqualToFive ) {
                    turtle.turnLeft();
                } else if ( inputAtIndex == 5 ) {
                    turtle.writeOn(sketchPad, inputAtNextIndex);
                } else if ( inputAtIndex == 6 && inputFromPreviousIndexNotEqualToFive ) {
                    sketchPad.displayFloor();
                }
            }
        }
        sketchPad.displayFloor();











    }
}