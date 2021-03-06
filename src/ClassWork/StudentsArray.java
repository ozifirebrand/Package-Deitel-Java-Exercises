package ClassWork;

//import java.math.BigDecimal;
//import java.math.RoundingMode;
//import java.text.NumberFormat;
import java.util.Scanner;

public class StudentsArray {
    /*To initialise a 2d array, use the number of columns and rows as initialisers
    To know the no of rows and columns, ask the user to enter the no of students and no of subjects respectively
    */

    private static int[][] initialiseArray() {
        System.out.println("How many students?");
        Scanner scanner = new Scanner(System.in);
        int noOfStudents = scanner.nextInt();
        System.out.println("How many courses?");
        int noOfCourses = scanner.nextInt();
        return new int[noOfStudents][noOfCourses];
    }

    /*To receive input into the array, we iterate through the rows and columns
    The columns increment rapidly and after each iteration is completed, the new row is formed
     */

    private static int[][] receiveInputForEachElement() {
        Scanner scanner = new Scanner(System.in);
        int[][] table = initialiseArray();
        for (int row = 0; row < table.length; row++) {
            for (int column = 0; column < table[row].length; column++) {
                System.out.println("Enter student" + (row + 1) + "'s score for subject " + (1 + column));
                table[row][column] = scanner.nextInt();
            }
        }
        return table;
    }

    private static void displayInputInArray(int [] [] table){
        for (int [] number: table){
            for (int ints: number){
                System.out.print(ints + "\t");
            }
            System.out.println();
        }
    }

    /*To sum each row, sum the elements in the specific row
    To do this, the iterator loops through each column and adds the individual element to an initialised variable - total in row
     */
        public static int sumEachRow(int [][] table                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ){
            int totalInRow =0;
            for (int row = 0; row< table.length; row++){
                for (int column = 0;column<table[row].length; column++){
                    totalInRow += table[row][column];
                    if ( column==table[row].length)return totalInRow;
                }
            }
            return totalInRow;
        }

    public static int sumEachColumn(int [][] table){
        int totalInColumn =0;

//            for (int column = 0;column<table[row].length; column++){
//                for (int row = 0; row< table.length; row++){
//                totalInColumn += table[row][column];
//                if ( column==table[row].length)return totalInColumn;
//            }
        //}
        return totalInColumn;

    }

//
//    public static int determineRow(int [][] table ){
//        int row = 0;
//        int column =0;
//        for (row=0; row< table.length; row++){
//            for (column=0; column<column+1; column++){
//                row= row+1;
//            }
//        }
//        return row;
//    }
//
//    public static int determineColumn(int column){
//        column =0;
//        return column;
//    }
//    public static void loopRows(){
//
//    }
//
//    public static void loopColumns(){
//
//    }
//

//
//    public static int sumEachColumn(int[][] table){
//        int totalInColumn =0;
//        for (int column =0; column<column+1;column++){
//            for (int[] ints : table) {
//                totalInColumn += ints[column];
//            }
//        }
//        return totalInColumn;
//    }
    /*To display row in table or to display whole table at once
    To display whole table
        The inputs are collected and appropriately initialised
        During initialisation, the counter-controlled loop also separates the inputs as rows and
        columns
            To display the average, total and rank one will need to push each row individually and
             divide by number of students.
             This implies that each row will be the major factor in this computation.
             A method that adds all elements in a row and displays the sum immediately will be created.
             Another method that finds the average of the row and immediately displays it will be created.
             These methods will be repeatedly looped in another method (hopefully) until every member
             of the 2d array gets analysed and computed.

     To display several rows simulated as tables
        A method computes the sum for each row
        Another is created for the average
        Another method displays the computations side by side with the values in the row of the array
        Another method calls these three methods (the sum, average method and the display method)
        Another method calls this method and loops over it to display several other elements of the
        2d array//STUCK
     */
}
