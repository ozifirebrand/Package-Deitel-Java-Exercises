package chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class SixPointThreeFiveLearningMultiplication {

    public static int multiplyQuestions(int firstNumber, int secondNumber) {
        return firstNumber*secondNumber;
    }


    public static String giveTooHighResponse(int inputOfUser, int multiplicationAnswer) {
        if ( isGreaterThan(inputOfUser, multiplicationAnswer) )return "Too high. Keep trying!";
        return null;
    }

    private static boolean isGreaterThan(int inputOfUser, int multiplicationAnswer) {
        return inputOfUser > multiplicationAnswer;
    }

    public static int generateNumber() {
        int firstBoundary = 1;
        SecureRandom randomNumber = new SecureRandom();
        return firstBoundary + randomNumber.nextInt(12);
    }

    public static String giveEqualsResponse(int inputOfUser, int multiplication) {
        String equalsResponse= "Good job. Wonderful!";
        if ( isEqualTo(inputOfUser, multiplication) ) return equalsResponse;
        return null;
    }

    private static boolean isEqualTo(int inputOfUser, int multiplication) {
        return inputOfUser==multiplication;
    }

    public static String giveTooLowResponse(int inputOfUser, int multiplication) {
        return "Too low. Keep trying.";
    }



    public static void main(String[] args) {
        String exitValue = "yes";
        while (exitValue.equals("yes")){
            int firstNumber = SixPointThreeFiveLearningMultiplication.generateNumber();
            int secondNumber = SixPointThreeFiveLearningMultiplication.generateNumber();

            System.out.printf("What is %d times %d? \n", firstNumber, secondNumber);

            Scanner scanner = new Scanner(System.in);
            int userInput = scanner.nextInt();
            int multipliedNumber = SixPointThreeFiveLearningMultiplication.multiplyQuestions(firstNumber, secondNumber);

            System.out.println("Type yes to continue and no to end");
            exitValue= scanner.nextLine();
        }
    }
}
