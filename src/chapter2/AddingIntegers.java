/*PSEUDOCODE
Prompt user to input first number
User inputs number
Prompt user to input second number
User inputs number
Compute sum as the sum of the two integers
Display the sum.
End program.

 */
package chapter2;
import java.util.Scanner;
public class AddingIntegers {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in first number below ");
        int firstNumber = scanner.nextInt();
        System.out.println("Type in second number below ");
        int secondNumber = scanner.nextInt();
        System.out.println("Sum of the two integers is " +(firstNumber+secondNumber));


    }
}
