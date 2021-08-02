package chapter2;

import java.util.Scanner;

public class TwoPointTwoSix{

public static void main(String ... args){

Scanner input = new Scanner(System.in);

System.out.println("Enter two integers");

int integer1 = input.nextInt();
int integer2 = input.nextInt();

boolean secondNumberIsAMultiple = integer2 % integer1 == 0 && integer2 > integer1 ;
if (secondNumberIsAMultiple)
    System.out.printf("%d is a multiple of %d", integer1, integer2);

boolean secondNumberIsNotAMultiple = integer2 % integer1 != 1 && integer2 > integer1;
if (secondNumberIsNotAMultiple)
    System.out.printf("%d is not a multiple of %d", integer1, integer2);

boolean firstNumberIsAMultiple = integer1 % integer2 == 0 && integer1 > integer2 ;
if (firstNumberIsAMultiple)
    System.out.printf("%d is a multiple of %d", integer2, integer1);


boolean firstNumberIsNotAMultiple = integer1 % integer2 != 1 && integer1 > integer2;
if (firstNumberIsNotAMultiple)
    System.out.printf("%d is not a multiple of %d", integer2, integer1);

}
}