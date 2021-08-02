package chapter2;

import java.util.Scanner;

public class TwoPointTwoFour{

public static void main(String...args){

Scanner input = new Scanner(System.in);

System.out.println("Enter five integers  --->");

int number1 = input.nextInt();
int number2 = input.nextInt();
int number3 = input.nextInt();
int number4 = input.nextInt();
int number5 = input.nextInt();
boolean firstConditionIsTrue = number1 > number2 && number1 > number3 && number1 > number4 && number1 > number5  ;
boolean secondConditionIsTrue = number2 > number1 && number2 > number3 && number2 > number4 && number2 > number5 ;
boolean thirdConditionIsTrue = number3 > number2 && number3 > number1 && number3 > number4 && number3 > number5 ;
boolean fourthConditionIsTrue = number4 > number2 && number4 > number3 && number4 > number1 && number4 > number5;

if (firstConditionIsTrue)
    System.out.printf("%d is the largest integer %n", number1);

if (secondConditionIsTrue)
    System.out.printf("%d is the largest integer %n", number2);

if (thirdConditionIsTrue)
    System.out.printf("%d is the largest integer %n", number3);

if (fourthConditionIsTrue)
    System.out.printf("%d is the largest integer %n", number4);

boolean fifthConditionIsTrue = (number5 > number2 && number5 > number3 && number5 > number4 && number5 > number1);
if (fifthConditionIsTrue)
    System.out.printf("%d is the largest integer %n", number5);

boolean sixthConditionIsTrue = number1 < number2 && number1 < number3 && number1 < number4 && number1 < number5;
if (sixthConditionIsTrue)
    System.out.printf("%d is the smallest integer %n", number1);

boolean seventhConditionIsTrue = number2 < number1 && number2 < number3 && number2 < number4 && number2 < number5;
if (seventhConditionIsTrue)
    System.out.printf("%d is the smallest integer %n", number2);

boolean eightConditionIsTrue = number3 < number2 && number3 < number1 && number3 < number4 && number3 < number5;
if (eightConditionIsTrue)
    System.out.printf("%d is the smallest integer %n", number3);

boolean ninthConditionIsTrue = number4 < number2 && number4 < number3 && number4 < number1 && number4 < number5 ;
if (ninthConditionIsTrue)
    System.out.printf("%d is the smallest integer %n", number4);

boolean tenthConditionIsTrue = number5 < number2 && number5 < number3 && number5 < number4 && number5 < number1 ;
if (tenthConditionIsTrue)
    System.out.printf("%d is the smallest integer %n", number5);
}
}