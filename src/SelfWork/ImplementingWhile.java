package chapter4;
import  java.util.Scanner;
// receive input and add scores collected from input
// from collected scores get total and average
// if grade is greater than 100 or lesser than 0, don't accept

public class ImplementingWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int grade = 0;
        int numberOfStudents = 1;
        int maximumScore = 100;
        int minimumScore = 0;
        while (numberOfStudents <= 10) {
            System.out.println("Enter student score");
           int studentGrade = input.nextInt();
            grade += studentGrade;
            boolean scoreIsValid= studentGrade > maximumScore || studentGrade<minimumScore;
            if (scoreIsValid ) {
                numberOfStudents -= 1;
                studentGrade=0;
                System.out.println("Enter valid number between 0 and 100 inclusive ");
            }
            System.out.printf("Counter is %d%n", numberOfStudents);
            numberOfStudents++;
        }
        double average = (double) grade / numberOfStudents;
        System.out.printf("Total grade is %d.%nAverage is %.2f.%nCounter is %d", grade, average, numberOfStudents);
    }
}