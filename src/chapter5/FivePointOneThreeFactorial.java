package chapter5;
/*User inputs the number whose factorial is to be found
The console displays the factorial of the number

    CALCULATING THE FACTORIAL
    The input is multiplied by the new factorial number which is one
    The new factorial number is the output of the multiplication
    One is subtracted from the input
    The new input is multiplied by the new factorial number until input
        is equal to one
 */
import java.util.Scanner;
public class FivePointOneThreeFactorial {
    public static void main(String[] args) {
        int newFactorialValue = 1;
        int counter = 1;
        //factorialValue=1;
        Scanner scanner = new Scanner(System.in);
        //while (counter <= 9) {

            System.out.print("Type number to calculate its factorial\n");
            int factorialValue = scanner.nextInt();
            while (factorialValue != 0) {
                if ( factorialValue <= 15 && factorialValue > 0 ) {

                    newFactorialValue *= factorialValue;
                    factorialValue--;
                }

        }System.out.println(newFactorialValue);
        //}
        //counter++;

    }
}