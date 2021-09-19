package chapter10.CheckoutAssignment;

import java.util.ArrayList;
/* User purchases Item
The Item total cost is computed
    How?
    Each Item has a price tag and quantity
    These two values are multiplied to give the total cost of an Item purchase
    This is attached to the Item name and returned as an Item value
The Item list contains the information of total cost for each Item and its name
*/

public class Cart {

    ArrayList<Item> items = new ArrayList<>();
    private double totalCostOfPurchase;


    public ArrayList<Item> getItems() {
        return items;
    }

    public void pickItems(Item item) {
    }

    public double getTotalCostOfPurchase() {
        return totalCostOfPurchase;
    }

    public void computeTotalCostOfPurchase(double costOfPurchase) {
        totalCostOfPurchase += costOfPurchase;
    }
}