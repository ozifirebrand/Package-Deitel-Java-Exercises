package CompositionInheritanceAssignment;

import java.util.Scanner;

public class ShoppingCartMain {

    private String collectNameOfItem(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Item: ");
        return scanner.nextLine();
    }

    private int collectQuantityOfItem(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantity: ");
        return scanner.nextInt();
    }

    private int collectPriceOfItem(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Price: ");
        return scanner.nextInt();
    }


    public static void main(String[] args) {
        ShoppingCartMain m = new ShoppingCartMain();
        ShoppingCart cart = new ShoppingCart();
        Scanner scanner = new Scanner(System.in);

        System.out.println("What will you buy today?");
        String itemName = m.collectNameOfItem();
        System.out.println();

        int itemPrice = m.collectPriceOfItem();
        int itemQuantity = m.collectQuantityOfItem();

        Item item = new Item(itemName, itemPrice, itemQuantity);
        cart.addItemToCart(item);

        System.out.print("Any other thing? ");
        String response = scanner.nextLine();

        while (response.equalsIgnoreCase("yes")){
            itemName = m.collectNameOfItem();
            System.out.println();
            itemPrice = m.collectPriceOfItem();
            itemQuantity = m.collectQuantityOfItem();
            item = new Item(itemName, itemPrice, itemQuantity);
            cart.addItemToCart(item);
            System.out.print("Any other thing? ");
            response = scanner.nextLine();
        }
        System.out.println(cart);
    }
}
