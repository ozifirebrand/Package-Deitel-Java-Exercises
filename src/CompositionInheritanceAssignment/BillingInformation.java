package CompositionInheritanceAssignment;

public class BillingInformation {
//   private String phoneNumberOfReceiver;
//   private String nameOfReceiver;
//   private String deliveryAddress;
//   private CreditCardInfo creditCard = new CreditCardInfo();


   @Override
   public boolean equals(Object newBillingInformation){
      if (!(newBillingInformation instanceof BillingInformation billingInformation)) return false;
      BillingInformation bill = (BillingInformation) newBillingInformation;
      return true;
   }
}
