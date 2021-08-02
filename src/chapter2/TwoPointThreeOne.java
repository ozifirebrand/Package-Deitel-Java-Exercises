package chapter2;

import java.util.Scanner;

public class TwoPointThreeOne{

public static void main(String ... args){

Scanner neededFigure = new Scanner(System.in);

System.out.println("Enter value that is to be squared and cube");

int newNo = neededFigure.nextInt();

System.out.printf("%d %n%d %n%d", newNo, newNo*newNo, newNo*newNo*newNo);

}

}