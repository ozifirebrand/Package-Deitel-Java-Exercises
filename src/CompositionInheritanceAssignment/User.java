package CompositionInheritanceAssignment;

import java.util.ArrayList;

public class User {
    int amountPaidByUser;
    public void payForItem(int amountPaid) {
        amountPaidByUser = amountPaid;
    }

    public int getAmountPaidByUser() {
        return amountPaidByUser;
    }
}
