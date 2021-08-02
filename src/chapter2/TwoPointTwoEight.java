package chapter2;

import java.util.Scanner;

public class TwoPointTwoEight{

public static void main(String...args){

Scanner input = new Scanner(System.in);

System.out.println("Enter your radius");

double radius = input.nextFloat();

double diameter = 2 * radius;

double circumference = 2 * Math.PI * radius;

double area = Math.PI * radius * radius;

System.out.printf("The diameter of the circle is %.2f.%nThe circumference is %.2f.%nThe area is %.2f%n", diameter, circumference, area);
}
}