/*user inputs number
Number is looped by dividing by 10^n where n = 0 till remainder
    equals 0
Save digits in a string
Modulus digits with 10^n in a reverse order with n incrementing
    by 1 till remainder is less than 0
Each digit is then multiplied by 2^n where n = 0 and it increments
    by 1 till remainder is less than 0
Sum of digits gives the decimal figure
Display sum of digits
 */

package chapter4;
import java.text.MessageFormat;
import java.util.Scanner;
public class FourPointThreeOne {
    public static void main(String[] args) {

        int counter = 0 ;
        int firstConversion= 0;
        String digitsStored= "" + firstConversion;
        int decimalNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number --> ");
       int  binaryInteger = scanner.nextInt();
       while(binaryInteger>= 0){
           firstConversion = (int)(binaryInteger/Math.pow(10, counter));
           counter+=1;
           digitsStored = MessageFormat.format("{0}{1}", digitsStored, firstConversion);

}

    }
}
