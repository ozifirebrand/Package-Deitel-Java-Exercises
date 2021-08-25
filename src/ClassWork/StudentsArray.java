package ClassWork;

import java.util.Scanner;

public class StudentsArray {
    public static void receiveInput(){
        System.out.println("How many students and courses respectively?");
        Scanner scanner = new Scanner(System.in);
        int noOfStudents = scanner.nextInt();
        int noOfCourses = scanner.nextInt();
        int [][] table = new int[noOfStudents][noOfCourses];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.println("Enter student" + (i+1) + "'s score for subject " + (1+j));
                table[i][j] = scanner.nextInt();
            }
        }
    }

    public static void main(String[] args) {

        receiveInput();
        //sumArrayElements(table);

    }
}
























