package chapter6;

public class SixPointTwoOneSeperatingDigits {

    public static int returnQuotient(int dividend, int divisor) {
        return dividend/divisor;
    }

    public static int returnRemainder(int dividend, int divisor) {
        return dividend%divisor;
    }

    public static int findDivisor(int digitInput) {
        String inputDigitToString = "" + digitInput;
        int divisor= 1;
        for (char input : inputDigitToString.toCharArray()){
            divisor *= 10;
        }
        return divisor / 10;
    }

    public static void main(String[] args) {
    }

    public static String displayDigits(int inputValue) {
        int divisor = findDivisor(inputValue);
        String inputToString = ""+inputValue;
        int firstSplitDigit;
        int secondSplitDigit;
        String splitDigit= "";
        int ones = 1;
        for (int counter =0; counter< inputToString.length();counter++){
            firstSplitDigit =returnQuotient(inputValue, divisor/ones);
            ones*= 10;
            secondSplitDigit = returnRemainder(firstSplitDigit, 10);
            splitDigit += secondSplitDigit+" ";
        }
        return splitDigit;
    }
    //fixme ASAP
}
