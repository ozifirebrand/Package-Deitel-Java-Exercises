package chapter4;
import  java.util.Scanner;
public class FourPointTwoNine {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter size of square here --> ");
        int squareSide = scanner.nextInt();
        while(squareSide<=20) {
            System.out.print(squareSide);
        }
    }
}