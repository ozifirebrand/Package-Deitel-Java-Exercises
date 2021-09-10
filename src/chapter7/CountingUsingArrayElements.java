package chapter7;

import java.security.SecureRandom;

public class CountingUsingArrayElements {
    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();
        int [] frequency = new int[7];

        for (int roll = 1; roll <= 6000000; roll++){
            ++frequency[1+ randomNumbers.nextInt(6)];
        }

        for (int face = 1; face< frequency.length; face++){
            System.out.println(face +"\t" +frequency[face]);
        }
    }
}
