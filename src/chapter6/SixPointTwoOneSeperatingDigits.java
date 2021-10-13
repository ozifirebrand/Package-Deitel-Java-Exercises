package chapter6;

public class SixPointTwoOneSeperatingDigits {

    public static int returnQuotient(int dividend, int divisor) {
        return dividend/divisor;
    }

    public static int returnRemainder(int dividend, int divisor) {
        return dividend%divisor;
    }

    public static String splitInput(int digitInput) {
        String inputDigitToString = "" + digitInput;
        String output = "";
        for (char input : inputDigitToString.toCharArray()){
            output += input +" ";
        }
        return output;
    }
}
