package chapter6;

import java.util.Scanner;

public class OtherExercisesInDeitelChapterSix {
    public static void main(String[] args) {
        calculateFloorValue();
        calculateFloorValueToTheNearestHundreds();
        calculateFloorValueToTheNearestTens();

    }
    private static double input(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    private static void calculateFloorValueToTheNearestHundreds(){
        double x = input();
        double y = Math.floor(x * 100 + 0.5) / 100;
        System.out.println("y to the nearest hundreds is "+y);
    }

    private static void calculateFloorValueToTheNearestTens(){
        double x = input();
        double y = Math.floor(x * 10 + 0.5) / 10;
        System.out.println("y to the nearest tens is "+y);

    }
    private static void calculateFloorValue(){
        double x = input();
        double y = Math.floor(x+ 0.5);
        System.out.println("y is "+y);
    }
}
