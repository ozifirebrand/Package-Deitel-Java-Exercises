package chapter6;

import java.util.Scanner;

public class SixPointOneZero {

    public static double roundUpNumberToInteger(double value) {
        return Math.floor(value);
    }

    public static double roundUpNumberToTenths(double number) {
        return Math.floor(number*10 +.5)/10;
    }

    public static double roundUpNumberToHundredths(double number) {
        return Math.floor(number*100 +.5)/100;
    }

    public static double roundUpNumberToThousandths(double number) {
        return Math.floor(number*1000 +.5)/1000;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a decimal number to be rounded up to the nearest\ninteger, tenth, hundredth and thousandth");
        double numberToBeRoundedUp= scanner.nextDouble();
        System.out.println(numberToBeRoundedUp+" to the nearest integer is "+roundUpNumberToInteger(numberToBeRoundedUp));
        System.out.println(numberToBeRoundedUp+" to the nearest tenths is "+roundUpNumberToTenths(numberToBeRoundedUp));
        System.out.println(numberToBeRoundedUp+" to the nearest hundreths is "+roundUpNumberToHundredths(numberToBeRoundedUp));
        System.out.println(numberToBeRoundedUp+" to the nearest thousandths is "+roundUpNumberToThousandths(numberToBeRoundedUp));
    }
    //This program can be improved in many other beautiful ways. This implemetation is strictly for academic reasons
}
