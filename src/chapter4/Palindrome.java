package chapter4;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        int counter = 0;
        int invalidNumber;

        Scanner scanner = new Scanner(System.in);

/*
Prompt displays "Input integer"
If the number is a palindrome, display this is a palindrome
If the number is not a palindrome, display this is not a palindrome.
if number is greater than 5-digit, display an error message and ask user to input number again.

 HOW
    User inputs integer which is split, to form separate integers.
    Form a string with the obtained integers.
    If the string formed is equal to the string obtained from reading the split integers
    backwards, then it is a palindrome.
    System displays "This is a palindrome"
    Otherwise it is not. The system displays "This is not a palindrome"
    If during sout, the string obtained has an additional character, then display error
    message and allow user input new integer.
*/

        while (counter <= 3){

                System.out.println("Enter a five-digit number --> ");
                int fiveDigitInteger = scanner.nextInt();

                invalidNumber = (fiveDigitInteger / 100000);
                int firstNumber = (fiveDigitInteger / 10000) % 10;
                int secondNumber = (fiveDigitInteger / 1000) % 10;
                int thirdNumber = (fiveDigitInteger / 100) % 10;
                int fourthNumber = (fiveDigitInteger / 10) % 10;
                int fifthNumber = fiveDigitInteger % 10;

                String firstPalindrome = ("" + firstNumber + "" + secondNumber + ""
                        + thirdNumber + "" + fourthNumber + "" + fifthNumber);
                String secondPalindrome = ("" + fifthNumber + "" + fourthNumber + ""
                        + thirdNumber + "" + secondNumber + "" + firstNumber + "");

                if ( firstPalindrome.equals(secondPalindrome)) {
                    System.out.println("This is a palindrome");
                }
                else if (invalidNumber>0 && firstPalindrome!=secondPalindrome){
                System.out.println("Enter a valid number");

                }else if (firstPalindrome != secondPalindrome){
                    System.out.println("This is not a palindrome");
                }

                counter++;
            }
    }
}