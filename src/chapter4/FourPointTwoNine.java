package chapter4;
import  java.util.Scanner;
public class FourPointTwoNine {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter size of square here --> ");
        int squareSide = scanner.nextInt();
        String asterisk = "*";
        int noOfAsterisks = 0;
        while (noOfAsterisks <= 20){
            noOfAsterisks = squareSide;
            System.out.print(asterisk);
            noOfAsterisks++;
        }

    }
}