package chapter2;

import java.util.Scanner;

public class TwoPointOneSeven{

public static void main(String ... args){

Scanner integer = new Scanner(System.in);

System.out.println("Enter three numbers");

int number1 = integer.nextInt();
int number2 = integer.nextInt();
int number3 = integer.nextInt();


if (number1 > number2 && number1 > number3)

System.out.printf("%d is the largest %n", number1);

if (number1 < number2 && number2 > number3)

System.out.printf("%d is the largest%n", number2);

if (number2 < number3 && number1 < number3)

System.out.printf("%d is the largest%n", number3);

if (number1 > number2 && number3 > number2)

System.out.printf("%d is the smallest%n", number2);

if (number1 < number2 && number1 < number3)

System.out.printf("%d is the smallest%n", number1);

if (number3 < number2 && number1 > number3)

System.out.printf("%d is the smallest%n", number3);
System.out.printf("The sum of the numbers is %d.%nTheir average is %d.%nTheir product is %d%n", number1 + number2 + number3, number1/3 + number2/3 + number3/3, number1 * number2 * number3);


}

}