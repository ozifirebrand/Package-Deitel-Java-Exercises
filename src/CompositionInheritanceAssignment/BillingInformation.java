package CompositionInheritanceAssignment;

public class BillingInformation {

   @Override
   public boolean equals(Object newBillingInformation){
      if (!(newBillingInformation instanceof BillingInformation billingInformation)) return false;
      BillingInformation bill = (BillingInformation) newBillingInformation;
      return true;
   }
}