package chapter6;

import java.util.Scanner;

public class SixPointOneFiveHypotenuseProgram {

    public static double calculateHypotenuse(double sideOne, double sideTwo) {
        return Math.sqrt(Math.pow(sideOne, 2) + Math.pow(sideTwo, 2));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("CALCULATING THE HYPOTENUSE OF A TRIANGLE FROM ITS 2 SIDES.");
        System.out.print("Enter side one: ");
        double sideOne = scanner.nextDouble();
        System.out.print("Enter side two: ");
        double sideTwo = scanner.nextDouble();
        System.out.printf("The hypotenuse is %.3f", calculateHypotenuse(sideOne, sideTwo));

    }
}
