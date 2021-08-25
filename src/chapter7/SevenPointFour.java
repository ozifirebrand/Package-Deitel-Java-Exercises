package chapter7;

import java.io.OptionalDataException;
import java.util.Scanner;

public class SevenPointFour {
    int[][] table = new int[ARRAY_SIZE][ARRAY_SIZE];

    public static final int ARRAY_SIZE = 3;
//table.length is the number of rows in the array

    public static void showArrayElements(int[][] array) {
        for (int counter = 0; counter < array.length; counter++) {
            for (int index = 0; index < array[counter].length; index++) {
                System.out.print(array[counter][index]);
            }
            System.out.println();
        }
    }

    public static void sumArrayElements(int[][] array) {
        int totalOfArrays = 0;
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                totalOfArrays += array[row][column];
            }
            System.out.print(totalOfArrays);
        }
    }

}