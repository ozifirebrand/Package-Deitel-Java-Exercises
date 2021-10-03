package chapter10;

public class CardValidation {
    private int cardNumberLength;
    private int sumOfOddPlaceNumbers;
    private int sumOfEvenPlacedNumbers;
    private int sumOfNumber = 0;

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
        loopThroughStringOfNumbersAtOddPlace(numbers);
    }

    private void loopThroughStringOfNumbersAtOddPlace(String numbers) {
        for (int index = cardNumberLength-1; index > 0 ; index-=2){
            int numberInIntFormat = convertStringToInt(numbers, index);
            sumOfOddPlaceNumbers += numberInIntFormat;
        }
    }

    private int convertStringToInt(String numbers, int index) {
        char numberAtIndexInCharFormat = numbers.charAt(index);
        return Character.getNumericValue(numberAtIndexInCharFormat);
    }

    public int getOddPlaceNumberSum() {
        return sumOfOddPlaceNumbers;
    }

    private int multiplyNumber(int numberInInt){
        return numberInInt*2;
    }

    private void loopThroughStringOfNumbersAtEvenPlace(String numbers) {
        for (int indexOfNumbers = cardNumberLength-2; indexOfNumbers > 0 ; indexOfNumbers-=2){
            int numberInIntFormat = convertStringToInt(numbers, indexOfNumbers);
            int multiplier = multiplyNumber(numberInIntFormat);
            sumOfEvenPlacedNumbers += multiplier;
        }
    }

    public void sumOfDoubleEvenPlacedNumbers(String numbers) {
        loopThroughStringOfNumbersAtEvenPlace(numbers);
    }

    public int getDoubleEvenPlaceNumberSum() {
        return sumOfEvenPlacedNumbers;
    }

    public int getDigit(int number) {
        int multiplier = multiplyNumber(number);
        if ( multiplier > 9) {
            String numberToString = convertIntToString(multiplier);
            addValues(numberToString);
        }
        return sumOfNumber;
    }

    private String convertIntToString(int number) {
        return String.format("%d", number);
    }

    private void addValues(String numberToString) {
        loopThroughStringOfNumber(numberToString);
    }

    private void loopThroughStringOfNumber(String number) {
        for (int index = 0; index <number.length() ; index++){
            int toIntOfNumber = convertToInt(number, index);
            addIndividualNumbersTo(toIntOfNumber);
        }
    }

    private int convertToInt(String number, int index) {
        return Character.getNumericValue(number.charAt(index));
    }

    private void addIndividualNumbersTo(int toIntOfNumber) {
        sumOfNumber += toIntOfNumber;
    }
}