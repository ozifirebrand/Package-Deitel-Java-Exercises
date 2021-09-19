package chapter10.CheckoutAssignment;

import java.util.ArrayList;
import java.util.Scanner;
/* User purchases Item
The Items' total cost is computed using the individual Items cost
The Item list contains the information of total cost for each Item and its name
*/

public class Cart {

    ArrayList<Item> items = new ArrayList<>();
    private double totalCostOfPurchase;

    public void pickItems() {
        System.out.println("What do you want to purchase?");
//        Item item = new Item();
//        items.add(item);
        purchaseAgain();
    }

    public void purchaseAgain() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Any other thing?");
        String input = scanner.nextLine();
        while (true) {
            if ( input.equals("yes") ){
            pickItems();}
            else {
                break;
            }
        }
    }

    public ArrayList<Item> getItems() {
        return items;
    }
}