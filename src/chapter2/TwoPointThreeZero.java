package chapter2;

import java.util.Scanner;

public class TwoPointThreeZero{

public static void main(String...args){

Scanner input = new Scanner(System.in);

System.out.println("Enter 5-digit integer that is to be split -->");

int splitNumber = input.nextInt();

System.out.printf("%d %d %d %d %d ", splitNumber/10000, 
splitNumber%10000/1000, splitNumber%1000/100, splitNumber%100/10, splitNumber%10);





































//int splitInteger = input.nextInt();

//System.out.printf("%d", splitInteger);

//int splitInteger2 = input.nextInt();

//System.out.printf("%d", splitInteger2);

//int splitInteger3 = input.nextInt();

//System.out.printf("%d", splitInteger3);

//int splitInteger4 = input.nextInt();

//System.out.printf("%d", splitInteger4);

//int splitInteger5 = input.nextInt();

//System.out.printf("%d", splitInteger5);

//System.out.printf("%d %d %d %d %d", splitInteger, splitInteger2, splitInteger3, splitInteger4, splitInteger5 );

//System.out.printf("Type a number to be split");

//int firstNumber = input.nextInt();

//System.out.printf("%d", firstNumber%100000);

//System.out.print(' ');

//System.out.printf("%d", firstNumber%10000);

//System.out.print(' ');

//System.out.printf("%d", firstNumber%1000);

//System.out.print(' ');

//System.out.printf("%d", firstNumber%100);

//System.out.print(' ');

//System.out.printf("%d", firstNumber%10);

//System.out.print(' ');

//System.out.printf("%d", firstNumber%1);

}

}