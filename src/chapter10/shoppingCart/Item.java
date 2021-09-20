package chapter10.shoppingCart;

import java.util.Scanner;

public class Item {
    int quantityOfItems;
    double totalItemAmount =0;
    String itemName;
    double itemPrice;

    Scanner scanner = new Scanner(System.in);

    public Item(){
        getItemName();
        returnItemPrice();
        returnQuantityOfItem();
        getTotalOfItem();
    }

    public String getItemToString() {
        return String.format("%-10s \t\t %-5.2f \t\t %-4d \t\t %-10.2f", getItemName(), returnItemPrice(),
                returnQuantityOfItem(), getTotalOfItem());
    }

    private void inputItemName(){
        System.out.print("Item name: ");
        itemName = scanner.nextLine();
    }

    public String getItemName(){
        inputItemName();
        return itemName;
    }

    private void inputItemPrice(){
        System.out.println("Price: ");
        itemPrice = scanner.nextDouble();
    }

    public double returnItemPrice(){
        inputItemPrice();
        return itemPrice;
    }

    private void inputQuantityOfItem(){
        System.out.println("Quantity: ");
        quantityOfItems = scanner.nextInt();
    }

    public int returnQuantityOfItem(){
        inputQuantityOfItem();
        return quantityOfItems;
    }

    public double getTotalOfItem() {
        computeTotalOfItems();
        return totalItemAmount;
    }

    private void computeTotalOfItems() {
        totalItemAmount = quantityOfItems *itemPrice;
    }
}
