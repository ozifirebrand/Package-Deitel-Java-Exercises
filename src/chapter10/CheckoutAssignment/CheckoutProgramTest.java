package chapter10.CheckoutAssignment;

public class CheckoutProgramTest {
    public static void main(String[] args) {
//        Item item = new Item();
//        User ozi = new User();
        new Cart().pickItems();
        System.out.println(new Cart().getItems());
        }
}
