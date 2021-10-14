package chapter6;

import java.security.SecureRandom;

public class SixPointThreeFiveLearningMultiplication {

    public static int multiplyQuestions(int firstNumber, int secondNumber) {
        return firstNumber*secondNumber;
    }

    private static boolean isGreaterThan(int inputOfUser, int multiplicationAnswer) {
        return inputOfUser > multiplicationAnswer;
    }

    public static int generateNumber() {
        SecureRandom randomNumber = new SecureRandom();
        return 1 + randomNumber.nextInt(12);
    }

    public static String giveResponse1(int inputOfUser, int multiplication) {
        String tooHighResponse = "Too high. Keep trying!";
        String tooLowResponse= "Too low. Keep trying.";
        String equalsResponse= "Good job. Wonderful!";
        if ( isGreaterThan(inputOfUser, multiplication) ){
            return tooHighResponse;
        }else if ( isEqualTo(inputOfUser, multiplication) ) return equalsResponse;
        return tooLowResponse;
    }

    private static boolean isEqualTo(int inputOfUser, int multiplication) {
        return inputOfUser==multiplication;
    }


    public static void main(String[] args) {
    }
}
