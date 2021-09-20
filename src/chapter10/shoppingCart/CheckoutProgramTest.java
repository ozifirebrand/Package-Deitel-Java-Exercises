package chapter10.shoppingCart;


public class CheckoutProgramTest {
    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.pickNewItem();
        System.out.println(cart.getItems());
    }

}
