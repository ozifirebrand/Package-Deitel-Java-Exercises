package chapter6;
import java.security.SecureRandom;
import java.util.Scanner;
public class LearningMultiplication {
    /*The computer asks the student what the multiplication of two numbers is
    The user inputs the supposed answer.
    If the user is right, display Very good
    If not,display, try again. Then let the user retry the input
     */
    private static int generateFirstNumber(){
        SecureRandom randomNumber = new SecureRandom();
        return 1 + randomNumber.nextInt(12);}

    private static int generateSecondNumber(){
        SecureRandom randomNumber = new SecureRandom();
        return 1 + randomNumber.nextInt(12);}

    private static int displayQuestions(){
        int firstNumber = generateFirstNumber(); int secondNumber = generateSecondNumber();
        System.out.printf("What is %d times %d %n", firstNumber, secondNumber);
        return firstNumber*secondNumber;}

    public static void confirmAnswer(){
        Scanner scanner = new Scanner(System.in);
        int realAnswer = displayQuestions();
        int studentAnswer = scanner.nextInt();
        if ( studentAnswer != -1 ){
            while (true) {
                if ( studentAnswer == realAnswer ) {
                    System.out.println("Good job!"); break;}
                else { System.out.println("No. Please try again");
                    studentAnswer = scanner.nextInt();}
            } confirmAnswer();}
    }
}