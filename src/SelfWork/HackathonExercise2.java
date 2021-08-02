package SelfWork;

/*Display prompt that reads Enter student's score an name
User inputs score and name
Prompt keeps displaying message until required number of students is gotten
System displays student's name with the highest score
 */

import java.util.Scanner;

public class HackathonExercise2 {
public static void main(String[] args){
    Scanner scannerObject = new Scanner(System.in);
    int studentScore;
    int numberOfStudents = 1;
    String studentName ;

    while (numberOfStudents<20) {
        System.out.println("Enter a student's name and score");
        studentName = scannerObject.next();
        studentScore = scannerObject.nextInt();

    }

}
}
