package chapter10.CheckoutAssignment;

import java.util.Scanner;

public class Items{
    private int quantityOfItems;
    private double itemPrice;
    private String itemName;

    public int getQuantityOfItems() {
        return quantityOfItems;
    }

    public void setQuantityOfItems() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many items? ");
        quantityOfItems =  scanner.nextInt();
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}
