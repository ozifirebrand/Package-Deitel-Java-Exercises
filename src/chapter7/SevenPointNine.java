package chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class SevenPointNine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] t = new int[2][3];

    /*How many rows does t have?
    2
    How many columns does t have?
    3
    How many elements does t have?
    2*3 = 6
    Write access expressions for all elements in row 1 of t
    For first row; t[0] - t[0][0], t[0][1], t[0][2]

    Write all expressions for column two
    For column two;
    t[0][1]
    t[1][1]

    Write a single statement that sets the elements of t in row 0
    and column 1 to zero
    t[0][1] = 0;

    Write individual statements to initialise each element of t to zero
    t[0][0]= 0;
    t[0][1] = 0;
    t[0][2] = 0;
    t[1][0]= 0;
    t[1][1]= 0;
    t[1][2]= 0;

    Write a nested for statement that initializes each element of t to zero.
    for (int row = 0; row < t.length; t++){
        for (int column = 0; column < t[row].length; column++){
        t[row][column] = 0;
        }
    }

    Write a nested for statement that inputs the values for the elements of t from the user.
    for (int row = 0; row < t.length){
        for (int column = 0; column <t[row].length; column++)
            System.out.println("What is row" +row +" and column"
            +column +"'s value?")
            t[row][column] = scanner.nextInt();
            }
        }

    Write a series of statements that displays the smallest value in t
    int smallestNumber = t[0][0];
    for(int row = 0; row<t.length; row++){
        for(int column = 0; column<t[row].length; column++){
            if (t[row][column] < smallestNumber){
            smallestNumber = t[row][column];
            }
        }System.out.print(smallestNumber);
    }

    Write a single printf statement that displays the elements of the first
    row of t
    System.out.printf(""+row [0][0]+""+row[0][1]+""+row[0][2]);

    Write a statement that prints the sum of the elements in the third column
    without using repetition
    System.out.println(t[0][2]+t[1][2]);

    Write a series of statements that displays the contents of t in tabular
    format. List the column indices as headings across the top, and list the
    row indices at the left of each row.

    for (int row = 0; row < t.length){
    System.out.print(row +" \t");
        for (int column = 0; column < t[row].length; column++){
            t[row][column] = scanner.nextInt();
            System.out.print(t[row][column] +" ");
            }
            System.out.println();
        }
    */

    }
}
