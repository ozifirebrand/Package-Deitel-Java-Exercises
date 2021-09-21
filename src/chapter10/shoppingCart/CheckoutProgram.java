package chapter10.shoppingCart;

import java.util.Scanner;

public class CheckoutProgram {
    /*
    User inputs product name, price and quantity
    Ask if they want more items. Yes means proceed, no means stop receiving inputs
    If the buyer picks more than 10k worth of items, give them 5 percent bonus (your choice though)
    The invoice is printed containing the items purc hased, quantity, total price per item, total cost of items purchased and bonus (if any)
    The buyer pays for the items and a receipt is printed with the items, their quantity, balance and amount paid

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

        User has a Cart, Card and a name
        Cart has Items and total cost of all items
        Item contains the quantity of items purchased, item name, price
            and Item's total cost
        Card contains amount in account

     */
    private static double input() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    private static String input2() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void main(String[] args) {
//        Cart cart = new Cart();
//        cart.pickNewItem();
    }
}