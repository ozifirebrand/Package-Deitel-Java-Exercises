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
    private static int[][] receiveInput(){
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

    public static void displayHorizontalArrayTable(){
        System.out.println("Student \t\t\t Subject scores");
    }

    public static int[][] scoreInOneRow(int[][] table) {
        int noOfRows = 0;
        Scanner scanner = new Scanner(System.in);
        int noOfColumns = scanner.nextInt();
        table[noOfRows] = receiveInput()[noOfColumns];
        return table;
    }

    public static void totalOfColumns(){
    }

    public static void main(String[] args) {
    }
}