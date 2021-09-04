package chapter6;

import java.security.SecureRandom;
import java.util.stream.IntStream;
/*shifting value
* This represents the first number on the scale of numbers to be displayed randomly*/
/*difference between values
* This depicts the difference between individual elements*/
/*scaling factor or bound
* This specifies how many numbers are in the range*/

public class SixPointOneTwoRandom {
    public static void main(String[] args) {
        SecureRandom newRandom = new SecureRandom();
        for (int counter = 0; counter <= 10; counter++) {
            int number = 2 /*shifting value*/ + 2/*difference between values*/
                    * newRandom.nextInt(/*scaling factor or bound*/15);
            System.out.print(number + " ");
        }
    }
}


































//        System.out.println();
//        for (int counter = 0; counter <= 10; counter++) {
//            IntStream h = newRandom.ints();
//            System.out.println(h +" ");
//        }