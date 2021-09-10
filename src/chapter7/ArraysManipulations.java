package chapter7;

import java.util.Arrays;

public class ArraysManipulations {
    public static void main(String[] args) {
        printSortedArray();
    }

    private static double[] declareArray(){
        double [] doubleArray = {8.4, 9.3, 0.2, 7.9, 3.4};
        return doubleArray;
    }

    private static double[] sortingArrays(){
        double [] doubleArray = declareArray();
        Arrays.sort(doubleArray);
        return doubleArray;
    }

    public static void printSortedArray(){
        double [] doubleArray = sortingArrays();
        for (double number : doubleArray){
            System.out.print(number +", ");
//            if ( doubleArray[doubleArray.length] )
        }
    }
}
