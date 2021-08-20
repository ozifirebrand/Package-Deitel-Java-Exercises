package chapter7;
/*
There is an array
An element is exempted from the summing process of the other elements of the array
The sums are saved into another array.
After the first array has been completely looped through, the maximum and minimum
of the new array is found
 */

import java.util.Scanner;

public class SumMaximumAndMinimumArray {

    public static int sumNumbersIn(int[] valuesInputted) {
        int sumOfIndices = 0;
            for (int valueInputted : valuesInputted) {
                sumOfIndices += valueInputted;
            }
        return sumOfIndices;
    }
    public static int findMaximumNumberIn(int[] numbers){
       return sumNumbersIn(numbers)-findLowestNumberIn(numbers);
    }

    public static int findMinimumNumberIn(int[] numbers){
        return sumNumbersIn(numbers) - findHighestNumberIn(numbers);
    }

    public static int findLowestNumberIn(int[]numbers) {
        int lowestNumber = numbers[0];
        for (int number : numbers) {
            if ( number < lowestNumber ) {
                lowestNumber = number;
            }
        }
        return lowestNumber;
    }

    public static int findHighestNumberIn(int[] numbers){
        int highestNumber = numbers[0];
        for (int number :numbers ){
            if ( number>highestNumber) {
                highestNumber = number;
            }
        }
        return highestNumber;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of elements here");
        int noOfInputs = scanner.nextInt();
        int [] values = new int[noOfInputs];
        System.out.println("Enter nos separated by space ");
        for (int i = 0; i< values.length; i++){
            int input = scanner.nextInt();
            values[i] = input;
        }
//        values = {2, 3,4,5};
        System.out.println(findLowestNumberIn(values));
        System.out.println(findHighestNumberIn(values));
        System.out.println(findMinimumNumberIn(values));
        System.out.println(findMaximumNumberIn(values));
    }
}