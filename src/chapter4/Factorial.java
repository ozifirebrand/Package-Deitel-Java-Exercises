package chapter4;
import  java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        int newFactorialNumber = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number whose factorial is to be computed");
        int factorialNumber = scanner.nextInt();


            while (factorialNumber >= 1) {

                if ( factorialNumber > 0 ) {

                newFactorialNumber = factorialNumber * newFactorialNumber;
                factorialNumber -= 1;

                System.out.println("Enter valid value");
                System.out.println(newFactorialNumber);


            }else{
                    System.out.println("Enter a valid value -> ");
                    continue;
                }
        }
        }
    }