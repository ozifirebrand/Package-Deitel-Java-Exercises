package chapter4;
import  java.util.Scanner;
public class FourPointTwoNine {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        System.out.println("Enter size of square here --> ");
        int squareSide = scanner.nextInt();

        String asterisk = "*";

        if (squareSide<=20){
        for (int rows = 1;rows <= squareSide; rows++){
            for (int column = rows; column<=squareSide; column++ ) {
                System.out.print(asterisk);
                // rows++;
            }
            System.out.println();
            }


        }

    }
}