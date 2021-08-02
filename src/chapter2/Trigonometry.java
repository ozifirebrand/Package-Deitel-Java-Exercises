package chapter2;//OKOROAFOR OZIOMA ASSIGNMENT 3/7/2021

import java.util.Scanner;
public class Trigonometry{
public static void main(String ... args){

Scanner number = new Scanner(System.in);

System.out.println("Enter the radius and length of a cylinder");

int radius = number.nextInt();

int length = number.nextInt();

float area;

float pi = (float) 3.14;

area = pi * radius * radius;

float volume = area * length;

System.out.printf("The area is %.2f.%nThe volume is %.2f", area, volume);

}

}