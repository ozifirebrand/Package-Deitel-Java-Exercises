package chapter6;

public class SixPointTwoOneSeperatingDigits {

    public static int returnQuotient(int dividend, int divisor) {
        return dividend/divisor;
    }

    public static int returnRemainder(int dividend, int divisor) {

        return dividend%divisor;
    }

    public static String displayDigits(int inputValue) {
        int divisor = findDivisor(inputValue);
        String valueToString = "" + inputValue;
        int quotient;
        int remainder;
        String outputDisplay = "";
        int lastIntegerIndex = 1;
        int reducedDivisors = divisor;
        System.out.println(reducedDivisors);
        if ( reducedDivisors > 1 ) {
            for (int counter = 0; counter < valueToString.length(); counter++) {
                quotient = returnQuotient(inputValue, reducedDivisors);
                System.out.println(quotient);
                if ( counter == 0 ) {
                    outputDisplay += quotient + " ";
                } else if ( counter == valueToString.length() - 1 ) {
                    remainder = returnRemainder(inputValue, 10 );
                    System.out.println(remainder);
                    outputDisplay += remainder + " ";
                    System.out.println(outputDisplay);
                } else {
                    System.out.println(quotient);
                    remainder = returnRemainder(quotient, reducedDivisors);
                    System.out.println(remainder);
                    outputDisplay += remainder + " ";
                }
                System.out.println(outputDisplay);
                reducedDivisors /= 10;
                System.out.println(reducedDivisors);
            }
        }
        return outputDisplay;
    }

    private static int findDivisor(int digitInput) {
        String inputDigitToString = "" + digitInput;
        int divisor= 1;
        for (char input : inputDigitToString.toCharArray()){
            divisor *= 10;
        }
        return divisor / 10;
    }

    public static void main(String[] args) {
        System.out.println(displayDigits(36302));
    }
    //fixme ASAP
}
