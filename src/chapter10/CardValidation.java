package chapter10;

public class CardValidation {
    private int cardNumberLength;
    private int sumOfDoubleEvenNumber;

    public CardValidation(String number){
        boolean numberIsLesserThan13 = number.length() < 13;
        boolean numberIsGreaterThan16 = number.length()> 16;
        if ( !(numberIsLesserThan13 || numberIsGreaterThan16) )
        cardNumberLength = number.length();
        else throw new IllegalArgumentException("Invalid input");

    }

    public void sumOddPlace(String numbers) {
        calculateDoubleSum(numbers);
    }

    private void calculateDoubleSum(String numbers) {
        loopThroughStringOfNumbers(numbers);
    }

    private void loopThroughStringOfNumbers(String numbers) {
        for (int index = cardNumberLength-1; index > 0 ; index-=2){
            int numberInIntFormat = getNumberInIntFormat(numbers, index);
            sumOfDoubleEvenNumber += numberInIntFormat;
        }
    }

    private int getNumberInIntFormat(String numbers, int index) {
        char numberAtIndexInCharFormat = numbers.charAt(index);
        return Character.getNumericValue(numberAtIndexInCharFormat);
    }

    public int getDoubleEvenNumberSum() {
        return sumOfDoubleEvenNumber;
    }
}
