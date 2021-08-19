package chapter6;

import java.util.Scanner;

public class SixPointSixSphereVolume {
    public static double calculateSphereVolume(int radius){
        return (4.0/3.0) * Math.pow(radius, 3);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Radius is ");
        int radius = scanner.nextInt();
        System.out.println("Volume of sphere with radius "+radius +" is "+calculateSphereVolume(radius));
    }
}
