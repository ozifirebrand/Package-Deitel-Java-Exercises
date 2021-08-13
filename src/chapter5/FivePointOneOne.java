package chapter5;
/*Prompt asks for the numbers to be compared .
User inputs the first number which is assumed to be the number of inputs
  User keeps receiving prompts until the first number becomes zero (the first
    number has been decrementing all the while.)
  The numbers are compared and the smallest is checked by comparing the new input
  with the current smallest number.

 */
import java.util.Scanner;
public class FivePointOneOne {
    public static void main(String[] args) {
        System.out.println("Enter number of times loop will run: ");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();

        System.out.print("Enter number: ");
        int smallestNumber = scanner.nextInt();

        System.out.println("Smallest number is " +smallestNumber);
        while (firstNumber>1){
            System.out.print("Enter number: ");
            int otherInputs = scanner.nextInt();

            if ( otherInputs< smallestNumber ){
                smallestNumber = otherInputs;
            }
            System.out.println("Smallest number is " +smallestNumber +"\n");
            firstNumber--;
        }
    }
}
