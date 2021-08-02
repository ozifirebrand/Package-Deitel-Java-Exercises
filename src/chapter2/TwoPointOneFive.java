package chapter2;

import java.util.Scanner;
	public class TwoPointOneFive{

		public static void main(String... args){

			Scanner input = new Scanner(System.in);

			System.out.println("You will enter two numbers whose sum, difference, product and quotient will be computed");

			System.out.println("Enter your first number below");

			int firstNumber = input.nextInt();

			System.out.println("Enter your second number below");

			int secondNumber = input.nextInt();

			System.out.printf("The sum of the numbers is %d.%nThe difference between them is %d.%nTheir product is %d and their division is %d.%n", firstNumber + secondNumber, firstNumber - secondNumber, firstNumber * secondNumber, firstNumber / secondNumber);

					
}
}