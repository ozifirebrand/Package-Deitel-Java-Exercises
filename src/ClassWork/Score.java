package ClassWork;
import java.util.Scanner;
public class Score {
    //Prompt>> write a score

//If user writes 60 and above, output is pass

//If user writes below 60, output is fail

        public static void main(String[]args){

            Scanner scanner = new Scanner(System.in);

            System.out.println("Write the score >> ");

            int score = scanner.nextInt();

            if (score >= 60){

                System.out.println("Pass");
            }else

            /*if (score < 60)*/{

                System.out.println("Fail");
            }

        }

    }
