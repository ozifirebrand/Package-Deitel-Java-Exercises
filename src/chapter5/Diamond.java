package chapter5;

public class Diamond {
    public static void main(String[] args) {
        String asterisks = "*";
        String spaces = " ";
        int rowSpaces = 0;
        int rowAsterisks = 5;

//
//        for (int row = 0; row <= 9; row++) {
//            for (int column = 0; column<=row; column++){
//                System.out.print(column);
//            }
//            System.out.println();
//            for (int row2 = 9; row2 >=0; row2-=1 ) {
//                for (int column = 0; column <=row2; column++){
//                    System.out.print(column);
////                System.out.println("Row is "+ row);
////                System.out.println("column is "+ column);
//                }
//                System.out.println();
//        }


//        while (rowSpaces <=5){
//            System.out.print(asterisks);
//            rowSpaces++;
//
//        while (rowAsterisks>= 5) {
//            System.out.print(asterisks);
//            rowAsterisks--;
//            System.out.println();
//
//        }
//        }

        //9 columns, 9 rows

        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for(int j =1; j<= i; j++){
                System.out.print("*");
            }
            for (int j = 1; j <= i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 4; j >= i; j--) {
                System.out.print("*");
            }
            for (int j =5; j>=i; j--){
                System.out.print("*");
            }
//            for (int j = 4; j>= i; j--){
//                System.out.print(" ");
//            }
            System.out.println();
        }
    }
}