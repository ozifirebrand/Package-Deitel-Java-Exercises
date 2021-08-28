package ClassWork;

//import java.math.BigDecimal;
//import java.math.RoundingMode;
//import java.text.NumberFormat;
import java.util.Scanner;

/* OR from an already made 2d array which is best
A new array can be initialised such that its number of rows is the number of a given index
Each row can then be initialised using the index of the row and column - which has been increasing systematically
 */


public class StudentsArray {
    /*To initialise a 2d array, use the number of columns and rows as initialisers
    To know the no of rows and columns, ask the user to enter the no of students and no of subjects respectively
    */

    private static int[][] initialiseArray(){
        System.out.println("How many students and courses respectively?");
        Scanner scanner = new Scanner(System.in);
        int noOfStudents = scanner.nextInt();
        int noOfCourses = scanner.nextInt();
        return new int[noOfStudents][noOfCourses];
    }

    /*To receive input into the array, we iterate through the rows and columns
    The columns increment rapidly and after each iteration is completed, the new row is formed
     */

    private static int[][] receiveInputForEachElement(){
        Scanner scanner = new Scanner(System.in);
        int [] [] table = initialiseArray();
        for (int row = 0; row < table.length; row++) {
            for (int column = 0; column < table[row].length; column++) {
                System.out.println("Enter student" + (row+1) + "'s score for subject " + (1+column));
                table[row][column] = scanner.nextInt();
            }
        }
        return table;
    }

    /*To display row in table or to display whole table at once
    To display whole table
        The inputs are collected and appropriately initialised
        During initialisation, the counter-controlled loop also separates the inputs as rows and
        columns
            To display the average, total and rank one will need to add each row individually and
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
    public static int determineRow(){
        return 0;

    }

    private static int addInputsInOneRow(int rowNumber){
        int[][] table = receiveInputForEachElement();
        int totalInRow = 0;
        for (;rowNumber< rowNumber+1;rowNumber++){
            for ( int noOfColumns=0; noOfColumns< table[rowNumber].length; noOfColumns++){
                totalInRow = table[rowNumber][noOfColumns];
            }
        }
        return totalInRow;
    }

    private static void sumRows(){

    }

    /*To loop to the next row, there will be an increment of one
    The row index is incremented by one and the sum of the row is computed

     */

    private static int iterateThroughColumnForSumInRows(){
        int rowNumber = determineRow();
        rowNumber = rowNumber + 1;
        return rowNumber;
    }
//
//    public static void
//    public static void displayHorizontalArrayTable(){
//        System.out.println("Student \t\t\t Subject scores");
//    }

    public static int[][] scoreInOneRow(int[][] table) {
        int noOfRows = 0;
        Scanner scanner = new Scanner(System.in);
        int noOfColumns = scanner.nextInt();
        table[noOfRows] = receiveInputForEachElement()[noOfColumns];
        return table;
    }

    public static void totalOfColumns(){
    }

    public static void main(String[] args) {
    }
}


//    public static void displayInputsInTable(){
//        int [] [] table = receiveInputForEachElement();
//        for (int row = 0; row< table.length; row++){
//            for (int column = 0; column < table[row].length; column++){
//            System.out.println(table[row][column] + "\t");
//            }
//        }
//        System.out.println();
//    }
