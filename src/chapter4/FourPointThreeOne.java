package chapter4;
import java.util.Scanner;
/*user inputs number
Number is looped by dividing by 10^n where n = 0 till remainder
    equals 0
Modulus digits with 10^n in a reverse order with n incrementing
    by 1 till remainder is less than 0
Each digit is then multiplied by 2^n where n = 0 and it increments
    by 1 till remainder is less than 0
Sum of digits gives the decimal figure
Display sum of digits
 */

public class FourPointThreeOne {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int firstConversion= 1;
        int decimalNumber= 10;
        int tens= 1;
        int binaryInteger = 1;
        System.out.println("Enter number --> ");
        int  binaryInput = scanner.nextInt();

        while (binaryInteger > 0) {
            binaryInteger = binaryInput % tens;
            tens = tens * 10;
        }



        //System.out.print("" +1255/1000 +"\n" + 1255%1000 +"\n" +1255%100) ;

    }
}
