package chapter2;

import java.util.Scanner;
public class TwoPointTwoFive{

public static void main(String ... args){

Scanner integer = new Scanner(System.in);

System.out.println("Enter an integer");
    System.out.println("Its evenness or oddness will be displayed");

int inputInteger = integer.nextInt();

if (inputInteger % 2 == 0)

System.out.printf("%d is even", inputInteger);

if (inputInteger % 2 == 1)

System.out.printf("%d is odd", inputInteger);

}

}