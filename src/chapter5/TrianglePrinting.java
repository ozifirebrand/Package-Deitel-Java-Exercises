package chapter5; public class TrianglePrinting {public static void main(String[] args) {

        for(int row =0; row <10; row++) {
            for (int column = 10; column > row; column--) {
                System.out.print("  ");
            }
            for (int column = 0; column <= row; column++) {
                System.out.print("* ");
            }
            for (int column =1; column<=row; column++){
                System.out.print("* ");
            }
            for (int column = 1; column>= row; column--){
                System.out.print("  ");
            }
            System.out.println();
        }
        for (int row =0; row <=10; row++){
            for (int column = 0; column<row; column++){
                System.out.print("  ");
            }
            for (int column =10; column>row; column--){
                System.out.print("* ");
            }
           for (int column =10; column>=row; column--){
               System.out.print("* ");
           }
            System.out.println();
        }
    }
}