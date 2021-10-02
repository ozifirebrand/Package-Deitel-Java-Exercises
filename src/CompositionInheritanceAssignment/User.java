package CompositionInheritanceAssignment;

import java.util.ArrayList;

public class User {
    private String name;
    private int amountPaidByUser;
    private ArrayList<BillingInformation> billingInformation = new ArrayList<>();

    private CardType cardType;
    public void payForItem(int amountPaid) {
        amountPaidByUser = amountPaid;
    }

    public int getAmountPaidByUser() {
        return amountPaidByUser;
    }


    public void payWith(CardType cardType){
        this.cardType = cardType;
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

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
