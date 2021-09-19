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

    public Item() {
        itemName = input2();
        System.out.print("Price: ");
        itemPrice = input();
        System.out.print("Quantity: ");
        quantityOfItems =(int)input();
    }

    public void getItem(){
        System.out.print(getItemName() +"\t");
        System.out.print(getItemPrice() +"\t");
        System.out.print(getQuantityOfItems() +"\t");
        System.out.println(getItemTotalPrice());
    }

    private static double input() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    private static String input2() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }


    private void setItemTotalPrice(){
        totalPrice = itemPrice * quantityOfItems;
    }

    private double getItemTotalPrice(){
        setItemTotalPrice();
        return totalPrice;
    }

    private int getQuantityOfItems() {
        return quantityOfItems;
    }

    private double getItemPrice() {
        return itemPrice;
    }

    public String getItemName() {
        return itemName;
    }
}