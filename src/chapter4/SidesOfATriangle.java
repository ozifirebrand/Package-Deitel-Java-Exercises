/*How to determine the third side

 */
package chapter4;
import java.util.Scanner;

public class SidesOfATriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//use loops to collect values
        while (  )
        System.out.println("Enter the three sides -> ");
        double firstSide = scanner.nextDouble();
        double thirdSide = scanner.nextDouble();
        double secondSide = scanner.nextDouble();



        String sides = (""+ firstSide +"" +secondSide +"" +thirdSide);

        double firstSum = firstSide + secondSide;
        double secondSum = secondSide + thirdSide;
        double thirdSum = firstSum + thirdSide;

        String sumOfSides = ("" + firstSum +"" +secondSum +"" +thirdSum);
    }
}
