package CompositionInheritanceAssignment;

import java.util.ArrayList;

public class User {
    int amountPaidByUser;
    CardType cardType;
    public void payForItem(int amountPaid) {
        amountPaidByUser = amountPaid;
    }

    public void payWith(CardType cardType){
        this.cardType = cardType;
    }

    public int getAmountPaidByUser() {
        return amountPaidByUser;
    }
}
