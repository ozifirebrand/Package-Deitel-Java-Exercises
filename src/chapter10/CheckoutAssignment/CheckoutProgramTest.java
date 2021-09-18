package chapter10.CheckoutAssignment;

public class CheckoutProgramTest {
    public static void main(String[] args) {
        Cart cart = new Cart();
        Items items = new Items();
        cart.purchaseItems(items);
        System.out.println(cart.returnItems());
    }
}
