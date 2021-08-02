package chapter2;//OKOROAFOR OZIOMA ASSIGNMENT 3/7/2021

import java.util.Scanner;
public class Degree{
public static void main (String ... args){
Scanner f = new Scanner(System.in);

System.out.print("Enter a degree in celsius --->");
int celsius = f.nextInt();
double fahrenheit = 9.0 / 5 * celsius + 32;
System.out.printf("%d Celsius is %.2f Fahrenheit", celsius, fahrenheit);

}
}