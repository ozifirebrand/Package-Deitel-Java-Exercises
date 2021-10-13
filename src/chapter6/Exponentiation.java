package chapter6;

import java.util.Scanner;

public class Exponentiation {

    public static int findIntegerPower(int base, int exponent) {
        int integerPower = 1;
        for (int count =0; count< exponent; count++) integerPower *= base;
        return integerPower;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a base number: ");
        int base = scanner.nextInt();
        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();
        System.out.println("The exponent of " +base+" to "+ exponent+" is "+findIntegerPower(base, exponent));
    }
    //todo: can be further modified for improvement
}
