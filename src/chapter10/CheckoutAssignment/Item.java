package chapter10.CheckoutAssignment;

import java.util.Scanner;
/*
    Each Item has a price tag and quantity
    These two values are multiplied to give the total cost of an Item purchase
    This is attached to the Item name and returned as an Item value
 */
public class Item {
    private int quantityOfItems;
    private double itemPrice;
    private double totalPrice;
    private String itemName;

    private static double input() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    private static String input2() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public Item() {
        itemName = input2();
        System.out.print("Price: ");
        itemPrice = input();
        System.out.print("Quantity: ");
        quantityOfItems =(int)input();
    }

    private void setItemTotalPrice(){
        totalPrice = itemPrice * quantityOfItems;
    }

    public double getItemTotalPrice(){
        return totalPrice;
    }

    public int getQuantityOfItems() {
        return quantityOfItems;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public String getItemName() {
        return itemName;
    }
}