package chapter7;

import java.util.Scanner;

/*
Program takes user input, ten of them
Array loops through the items
Adds the individual elements
Divides their sum by 10
    To find the smallest number
    First number is assigned as the smallest number
    Loop goes through the array and equates the first number to the smallest no
    If the next number is smaller than the current no, equate the number to the smallest no
    Else keep going

    To find the largest no
    Equate the first no to the largest no
    Loop goes through the array
    If next no is greater than the largest no, equate it to the largest no

Finally display the largest, smallest and average score
 */
//
public class ArraysPractice {

        public static int calculateMinimumNumber(int [] scores) {
            int smallestNumber = scores[0];
            for (int score : scores) {
                if ( score < smallestNumber ) {
                    smallestNumber = score;
                }
            }
            return smallestNumber;
        }
        public static int calculateMaximumNumber(int [] scores){
            int largestNumber = scores[0];
            for (int score : scores) {
                if ( score > largestNumber ) {
                    largestNumber = score;
                }
            }
            return largestNumber;}

        public static int calculateTotalNumber(int[] scores) {
            int totalNumber = 0;
            for (int score : scores) {
                totalNumber += score;
            }
             return totalNumber;
        }

        public static double calculateAverage(int [] scores){
            double noOfStudents = scores.length * 1.0;
            return (calculateTotalNumber(scores)/ noOfStudents);
        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many inputs are you giving please?");
        int numberOfTimes = scanner.nextInt();
        int[] scoresOfStudents = new int[numberOfTimes];
        for (int index = 0; index < scoresOfStudents.length; index++ ){
            System.out.println("Enter score " +(index+1));
            int scoreInput = scanner.nextInt();
            scoresOfStudents[index] = scoreInput;
        }
        System.out.println("Minimum score is "+calculateMinimumNumber(scoresOfStudents));
        System.out.println("Maximum score is "+calculateMaximumNumber(scoresOfStudents));
        System.out.println("Total score is "+calculateTotalNumber(scoresOfStudents));
        System.out.println("Average score is "+calculateAverage(scoresOfStudents));
    }
    }





//        java.util.Scanner scanner = new Scanner(System.in);
//                System.out.println("Enter scores separated by space");
//                int scoreInput = scanner.nextInt();
//                int[] scores = new int[10];