package CompositionInheritanceAssignment;

import java.util.ArrayList;

public class User {
    private int amountPaidByUser;
    private ArrayList<BillingInformation> billingInformation = new ArrayList<>();

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

    public CardType paidWith() {
        return cardType;
    }

    public ArrayList<BillingInformation> getBillingInformation() {
        return billingInformation;
    }

    public void giveBillingInformation(BillingInformation bill) {
        billingInformation.add(bill);
    }
}
