package chapter2;

import java.util.Scanner;

	public class TwoPointOneSix{

	public static void main(String ... args){
		
		Scanner input = new Scanner(System.in);

		System.out.println("The larger of two numbers you input will be revealed");

		System.out.println("Input your first number");

		int firstNumber = input.nextInt();

		System.out.println("Input your second number");

		int secondNumber = input.nextInt();

		if (firstNumber > secondNumber)

		System.out.printf("First number, %d is larger", firstNumber);

		if (firstNumber < secondNumber)

		System.out.printf("Second number, %d is larger", secondNumber);

		if (firstNumber == secondNumber)

		System.out.println("These numbers are equal");


}
}