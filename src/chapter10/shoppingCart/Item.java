package chapter10.shoppingCart;

import java.util.Scanner;

public class Item {
   private int quantityOfItems;
   private double totalItemAmount;
   private String itemName;
   private double itemPrice;

    Scanner scanner = new Scanner(System.in);

    public Item(){
        quantityOfItems = 0;
        totalItemAmount = 0.0;

    }

    public String getItemToString() {
        return String.format("%-10s \t\t %-5.2f \t\t %-4d \t\t %-10.2f", getItemName(), returnItemPrice(),
                returnQuantityOfItem(), getTotalOfItem());
    }

    public void inputItemName(){
        System.out.print("Item name: ");
        itemName = scanner.nextLine();
    }

    public String getItemName(){
        return itemName;
    }

    public void inputItemPrice(){
        System.out.print("Price: ");
        itemPrice = scanner.nextDouble();
    }

    public double returnItemPrice(){
        return itemPrice;
    }

    public void inputQuantityOfItem(){
        System.out.print("Quantity: ");
        quantityOfItems = scanner.nextInt();
    }

    public int returnQuantityOfItem(){
        return quantityOfItems;
    }

    public double getTotalOfItem() {
        return totalItemAmount;
    }

    public void computeTotalOfItems() {
        totalItemAmount = quantityOfItems *itemPrice;
    }
}
