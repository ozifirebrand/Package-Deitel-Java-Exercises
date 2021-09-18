package chapter10.CheckoutAssignment;

import chapter10.CheckoutAssignment.Item;
import chapter10.CheckoutAssignment.Receipt;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckoutProgram {
    /*
    User inputs product name, price and quantity
    When items purchased remains nothing else, the program ends with a =
    If the buyer picks more than 10k worth of items, give them 5 percent bonus
    The invoice is printed containing the items purchased, quantity, total
        price per item, total cost of items purchased and bonus (if any)
    The buyer pays for the items and a receipt is printed with the balance and
        amount paid

     Broader algorithm
        An input method takes in input for the price and quantity
        Another input method takes input for the product name
        A multidimensional array is useful here to display the inputs
        A while loop takes in input until user enters -1
        An invoice is printed displaying the product name, quantity, unit price
            and total price per item.
            If the total cost is greater than 10k, give a 5 percent bonus, therefore
                print you have a 5 percent bonus
        User inputs amount paid which is subtracted from the total price under the
            condition that amount paid is higher than total amount
        After payment has been made, a receipt is printed showing the items, their
            quantity and total price
        Also, the total price is printed including the bonus and final total amount

<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
        OOP ROUTE

        User has a Cart and Card
        Cart has Items
        Items contains the quantity of
            items purchased and each Item is a Product
        Product contains name and price
        Receipt is an Invoice
        Invoice has Items,
     */
    ArrayList<Item> products = new ArrayList<>();
    Receipt receipt = new Receipt();


    private static double input() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    private static String input2() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void checkout() {
        double number = input();
    }
}