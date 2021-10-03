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

    public void sumOfDoubleEvenNumber(String numbers) {
        for (int index = numbers.length()-1; index > 0 ; index-=2){
            char numberAtIndexInCharFormat = numbers.charAt(index);
            int numberInIntFormat = Character.getNumericValue(numberAtIndexInCharFormat);
            sumOfDoubleEvenNumber += numberInIntFormat;
        }
    }

    public int getDoubleEvenNumberSum() {
        return sumOfDoubleEvenNumber;
    }
}
