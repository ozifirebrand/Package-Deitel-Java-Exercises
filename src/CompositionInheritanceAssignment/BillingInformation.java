package CompositionInheritanceAssignment;

public class BillingInformation {
    String phoneNumberOfReceiver;
    String nameOfReceiver;
    String deliveryAddress;
    CreditCardInfo creditCard = new CreditCardInfo();

    public BillingInformation(){

    }
}
