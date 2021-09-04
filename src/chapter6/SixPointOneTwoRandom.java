package chapter6;

import java.security.SecureRandom;
import java.util.Scanner;
import java.util.stream.IntStream;
/*shifting value
* This represents the first number on the scale of numbers to be displayed randomly*/
/*difference between values
* This depicts the difference between individual elements*/
/*scaling factor or bound
* This specifies how many numbers are in the range*/

public class SixPointOneTwoRandom {
    public static void main(String[] args) {
        configureRandomValues();
    }

    public static void configureRandomValues(){
        SecureRandom newRandom = new SecureRandom();
        Scanner scanner = new Scanner(System.in);
        System.out.println("How what is the range of the numbers?");
        int range = scanner.nextInt();
        System.out.println("What is your starting point?");
        int startingPoint = scanner.nextInt();
        System.out.println("What is the difference between the random numbers to be generated?");
        int difference = scanner.nextInt();
       for (int counter = 0; counter < range; counter++) {
            int randomNumber = startingPoint + difference
                    * newRandom.nextInt(range);
            System.out.print(randomNumber + " ");
        }

    }
}


































//        System.out.println();
//        for (int counter = 0; counter <= 10; counter++) {
//            IntStream h = newRandom.ints();
//            System.out.println(h +" ");
/*for (int counter = 0; counter < range; counter++) {
            int number = startingPoint /*shifting value+ differencedifference between values
        * newRandom.nextInt(scaling factor or boundrange);
        System.out.print(number + " ");
        }
        */
//        }