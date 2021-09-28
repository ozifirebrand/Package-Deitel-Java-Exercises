package ClassWork;

import java.util.Scanner;

public class SevenSegmentDisplay {
    public void arrayss(int [][] segmentDisplay){
        for (int row = 0; row < segmentDisplay.length; row++){
            for (int column = 0; column< segmentDisplay[row].length; column++){
                    segmentDisplay[0][column] = 1;
                    if ( row < 3 ) segmentDisplay[row][3] =1;
                    if ( row >= 3 ) segmentDisplay[row][3] =1;
                    segmentDisplay[4][column] = 1;
                    if ( row >= 2 ) segmentDisplay[row][0] =1;
                    if ( row < 3 ) segmentDisplay[row][0] =1;
                    segmentDisplay[2][column] = 1;
                }
            }
        }
    }
//for ( int index =0; index < input.length(); index++){
//        if ( input.charAt(index)== 1 ){
//        }
//        }

    /*user enters bits of numbers
    the first number is for a
    next is for b
    next is for c and so on
     */
//    public void displayInput(String input, String [] [] segmentDisplay) {
//
//        for (int row = 0; row < segmentDisplay.length; row++){
//            for (int column = 0; column< segmentDisplay[row].length; column++){
//                if ( input.charAt(0) == 1 ){
//                    segmentDisplay[0][column] = "-";
//                }
//                if ( input.charAt(1) == 1 ){
//                    if ( row < 3 )
//                        segmentDisplay[row][3] = "|";
//                }if ( input.charAt(2) == 1 ){
//                    if ( row >= 3 )
//                        segmentDisplay[row][3] = "|";
//                }if ( input.charAt(3) == 1 ){
//                    segmentDisplay[4][column] = "-";
//                }if ( input.charAt(4) == 1 ){
//                    if ( row >= 2 )
//                        segmentDisplay[row][0] = "|";
//                }if ( input.charAt(5) == 1 ){
//                    if ( row < 3 )
//                        segmentDisplay[row][0] = "|";
//                }if ( input.charAt(6) == 1 ){
//                    segmentDisplay[2][column] = "-";
//                }
//            }
//        }
//    }