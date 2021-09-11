package chapter4;
import  java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
//        int newFactorialNumber = 1;
//        int finalFactorialNumber = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number whose factorial is to be computed");
        /*User inputs number
        Program finds the number's factorial
            How?
            The input is multiplied by one
            One is then subtracted from the input and the new value is saved
            The new value is multiplied by the previous factorial multiplication
            One is also subtracted from the new value and this goes on and on till the new value is one
            The program ends at that point
         */
        int input = scanner.nextInt();
        int newInput=1;
        int one = 1;
        while (input >= 1){
            int factorial = input * newInput * one;
            input = input-one;
            newInput = factorial;
            System.out.println(factorial);
        }
    }
}