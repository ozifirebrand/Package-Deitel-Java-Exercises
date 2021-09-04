package chapter6;

import java.security.SecureRandom;
import java.util.stream.IntStream;

public class SixPointOneTwoRandom {
    /* */

    public static void main(String[] args) {
        SecureRandom newRandom = new SecureRandom();
        for (int counter = 0; counter <= 10; counter++) {
            int number = 2 /*shifting value*/ + 2/*difference between values*/
                    * newRandom.nextInt(/*scaling factor or bound*/15);
            System.out.print(number + " ");
        }
//        System.out.println();
//        for (int counter = 0; counter <= 10; counter++) {
//            IntStream h = newRandom.ints();
//            System.out.println(h +" ");
//        }

    }

}
