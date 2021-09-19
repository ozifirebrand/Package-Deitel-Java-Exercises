package chapter10.CheckoutAssignment;

import java.util.Scanner;

public class Item {
    private int quantityOfItems;
    private double itemPrice;
    private String itemName;

    public void setQuantityOfItems() {
        System.out.println("Quantity: ");
        Scanner scanner = new Scanner(System.in);
        quantityOfItems = scanner.nextInt();
    }

    public void setItemPrice() {
        Scanner scanner = new Scanner(System.in);
        itemPrice = scanner.nextDouble();
    }

    public void setItemName() {
        Scanner scanner = new Scanner(System.in);
        itemName = scanner.nextLine();
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
//
//    Item(String itemName, double itemPrice, int quantityOfItems){
//        this.itemName = itemName;
//        this.itemPrice = itemPrice;
//        this.quantityOfItems = quantityOfItems;
}








































//    public Item(){
//
//    }
//    public int getQuantityOfItems() {
//        return quantityOfItems;
//    }
//
//    public void setQuantityOfItems() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Quantity: ");
//        quantityOfItems =  scanner.nextInt();
//    }
//
//    public double returnItemPrice() {
//        return itemPrice;
//    }
//
//    public void setItemPrice() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Price: ");
//        itemPrice = scanner.nextDouble();
//    }
//
//    public String getItemName() {
//        return itemName;
//    }
//
//    public void setItemName() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Product: ");
//        itemName =  scanner.nextLine();
//    }

