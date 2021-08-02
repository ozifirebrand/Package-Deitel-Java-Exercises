package chapter4;

import java.util.Scanner;

/*when i run program, prompt user to enter score.
when user inputs score, let prompt display 49 more times
compute the total sum of the scores and average score.
 */
public class ClassScore {
    public static void main(String[]args){

        java.util.Scanner input = new Scanner(System.in);
        int totalScore = 0;
        int count = 1;
        int score;
       // if (score >=0 && score<=100) {
            for (count = 1; count <= 5; count++) {
                System.out.println("Enter a score");
                score = input.nextInt();
                totalScore += score;
            //}
        }
//        while(count<=5) {
//            System.out.println("Enter a score");
//            int score = input.nextInt();
//            totalScore+= score;
//            count+=1;
//        }
        int averageScore = totalScore/5;
        System.out.println("Total score is " +totalScore);
        System.out.println("Average score is " +averageScore);
    }
}