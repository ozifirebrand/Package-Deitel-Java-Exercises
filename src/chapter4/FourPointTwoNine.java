package chapter4;
import  java.util.Scanner;
public class FourPointTwoNine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of square here --> ");
        int squareSide = scanner.nextInt();

        for (int column = 1; column <= squareSide; column++) {
            System.out.print("* ");
        }
        System.out.println();

        for (int row = 0; row < squareSide-2; row++) {
            for (int column = 0; column < 1; column++) {
                System.out.print("* ");
            }
            for (int column = 1; column < squareSide; column++) {
                System.out.print("  ");
            }
            for (int column = 0; column < 1; column++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int column = 1; column <= squareSide; column++) {
            System.out.print("* ");
        }
    }
}