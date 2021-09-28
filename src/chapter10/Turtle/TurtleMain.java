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
          int input = Integer.parseInt(scanner.next());
          while ( input != 9){
              turtleInputs.add(input);
              input = Integer.parseInt(scanner.next());
          }
          System.out.println(turtleInputs);
    }
}
