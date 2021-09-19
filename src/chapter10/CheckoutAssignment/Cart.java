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


    public Cart() {
        User user = new User();
//        ArrayList<Item> items = new ArrayList<>();
    }

    private String askAgain(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Any other thing?");
        return scanner.nextLine();
    }

    private void purchaseAgain() {
        while (true) {
            String input = askAgain();
            if ( input.equals("yes") ){
                System.out.println("What else? ");
            Item item = new Item();
            items.add(item);}
            else if ( input.equals("no") ){
                break;
            }
        }
    }

    public void pickItems(){
        Item item = new Item();
        items.add(item);
        purchaseAgain();
    }

    public void getItems() {
        for (Item item : items){
            item.getItem();
        }
    }
}