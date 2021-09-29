package ClassWork;

import java.util.Arrays;
import java.util.Scanner;

public class SevenSegmentDisplay {
    public void arrayss(int [][] segmentDisplay){
        for (int row = 0; row < segmentDisplay.length; row++){
            for (int column = 0; column< segmentDisplay[row].length; column++){
                if ( column != 0 && column!= 3 && row !=2 && row != 0 && row != 4 ){
                    segmentDisplay[row][column] = 0;
                }else {
                    segmentDisplay[row][column] = 1;
                }
            }
        }
    }

    public void initialiseArrays(int [][] segmentDisplay){
        for (int[] ints : segmentDisplay) {
            Arrays.fill(ints, 0);
        }
    }

    public void collectInput(String input){

    }

    public void printArrays(int [][] segmentDisplay){
        for (int[] rows : segmentDisplay) {
            for (int columns : rows) {
                if ( columns == 1 ) {
                    System.out.print(columns + " ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
