package chapter10;

public class CardValidation {
    private int cardNumberLength;

    public CardValidation(String number){
        boolean numberIsLesserThan13 = number.length() < 13;
        boolean numberIsGreaterThan16 = number.length()> 16;
        if ( !(numberIsLesserThan13 || numberIsGreaterThan16) )
        cardNumberLength = number.length();
        else throw new IllegalArgumentException("Invalid input");

    }

    public int getSize() {
        return cardNumberLength;
    }
}
