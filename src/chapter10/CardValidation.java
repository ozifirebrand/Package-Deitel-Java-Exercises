package chapter10;

public class CardValidation {
    private int cardNumberLength;

    public CardValidation(String number){
        cardNumberLength = number.length();

    }

    public int getSize() {
        return cardNumberLength;
    }
}
