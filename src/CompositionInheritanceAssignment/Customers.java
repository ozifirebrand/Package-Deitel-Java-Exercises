package CompositionInheritanceAssignment;

public class Customers extends Users{
    BillingInformation paper = new BillingInformation();
    BillingInformation receipt = new BillingInformation();
    BillingInformation invoice = new BillingInformation();
    ShoppingCart basket = new ShoppingCart();

    public Customers(){

    }

}
