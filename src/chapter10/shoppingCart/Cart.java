package chapter10.shoppingCart;

import java.util.ArrayList;
import java.util.Scanner;

public class Cart {
    Scanner scanner = new Scanner(System.in);
    double totalOfItems;
    ArrayList<Item> items = new ArrayList<>();

    public void getItemsInCartToString(){
        for (Item item: items){
            System.out.println(item.getItemToString());
            System.out.println();
        }
    }

    private Item pickItem(){
        return new Item();

    }

    private String purchaseAgain(){
        System.out.println("Any thing else?");
        return scanner.next();
    }

    public void pickNewItem() {
        Item item = pickItem();
        items.add(item);
        String response = purchaseAgain();
        while (response.equals("yes")) {
            items.add(item);
            pickItem();
        }
    }

    private void calculateTotalOfItems(){
        totalOfItems = 0;
        for (Item item : items){
            totalOfItems += item.getTotalOfItem();
        }
    }
    public double getTotalOfItems(){
        calculateTotalOfItems();
        return totalOfItems;
    }
}
