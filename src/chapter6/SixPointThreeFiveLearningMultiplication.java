package chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class SixPointThreeFiveLearningMultiplication {

    private static boolean isGreaterThan(int inputOfUser, int multiplicationAnswer) {
        return inputOfUser > multiplicationAnswer;
    }

    private static boolean isEqualTo(int inputOfUser, int multiplication) {
        return inputOfUser==multiplication;
    }

    private static int generateNumber() {
        int firstBoundary = 1;
        SecureRandom randomNumber = new SecureRandom();
        return firstBoundary + randomNumber.nextInt(12);
    }

    private static String giveTooLowResponse() {
        return "Too low. Keep trying.";
    }

    private static String giveTooHighResponse() {
        return "Too high. Keep trying!";
    }

    private static String giveEqualsResponse() {
        return "Good job. Wonderful!";
    }

    public static int multiplyQuestions(int firstNumber, int secondNumber) {
        return firstNumber*secondNumber;
    }

    public static boolean isLowerThan(int userAnswer, int realAnswer) {
        return userAnswer<realAnswer;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int exitValue = 1;
        while (exitValue==1) {
            int firstNumber = generateNumber();
            int secondNumber = generateNumber();
            int realAnswer = multiplyQuestions(firstNumber, secondNumber);

            String question = String.format("What is %d times %d? \n", firstNumber, secondNumber);
            System.out.println(question);

            int userAnswer = scanner.nextInt();
            while (userAnswer != realAnswer) {
                if ( isGreaterThan(userAnswer, realAnswer) ) {
                    System.out.println(giveTooHighResponse());
                    userAnswer = scanner.nextInt();
                }
                if ( isLowerThan(userAnswer, realAnswer) ) {
                    System.out.println(giveTooLowResponse());
                    userAnswer = scanner.nextInt();
                }
            }
            if ( isEqualTo(userAnswer, realAnswer) ) {
                System.out.println(giveEqualsResponse());
                System.out.println("Type 1 to continue and 2 to end");
            }
            exitValue = scanner.nextInt();

        }
    }
}

