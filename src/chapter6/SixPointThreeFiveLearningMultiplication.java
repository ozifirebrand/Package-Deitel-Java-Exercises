package chapter6;

import java.security.SecureRandom;

public class SixPointThreeFiveLearningMultiplication {

    public static int multiplyQuestions(int firstNumber, int secondNumber) {
        return firstNumber*secondNumber;
    }

    public static boolean isGreaterThan(int inputOfUser, int multiplicationAnswer) {
        return inputOfUser > multiplicationAnswer;
    }

    public static int generateNumber() {
        SecureRandom randomNumber = new SecureRandom();
        return 1 + randomNumber.nextInt(12);}
    }
