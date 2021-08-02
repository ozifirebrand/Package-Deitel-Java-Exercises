package ClassWork;

/*Prompt commands user to enter a score
User inputs score.
If score is between 90 and 100, output displays A.
If score is between 80 and 89, output displays B.
If score is between 70 and 79, output displays C.
If score is between 60 and 69, output displays D.
If score is lesser than 60, output displays F.*/

import java.util.Scanner;


public class LasuScoring{

    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a score >> ");
        int score = scanner.nextInt();

        if (score >= 90 || score == 100){
            System.out.println("A");

        }

        if (score >= 80 && score <= 89){
            System.out.println("B");

        }

        if (score >= 70 && score <= 79){
            System.out.println("C");

        }

        if (score >= 60 && score <= 69){
            System.out.println("D");

        }

        if (score < 60){
            System.out.println("F");

        }
    }
}