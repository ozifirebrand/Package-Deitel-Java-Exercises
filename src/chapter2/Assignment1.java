package chapter2;

import java.util.Scanner;
 
 public class Assignment1{
   
      public static void main(String... args){

	Scanner input = new Scanner(System.in);

	int mysteryNumber = 7;
       
	System.out.println("Enter a guess Mystery Number between 1 - 20");

	int guessMysteryNumber = input.nextInt();

	if (guessMysteryNumber < mysteryNumber)
	   
	   System.out.println("Your guess number is too low");

	if (guessMysteryNumber > mysteryNumber)
	   
	   System.out.println("Your guess number is too high");

	if (guessMysteryNumber == mysteryNumber)
	   
	   System.out.println("Your guess number is correct");
}
}