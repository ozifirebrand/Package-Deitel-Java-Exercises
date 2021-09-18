package chapter10.CheckoutAssignment;

import java.util.ArrayList;

public class Cart {
    ArrayList<Items> items = new ArrayList<>();
    private double totalCostOfPurchase;

    public ArrayList<Items> returnItems() {
        return items;
    }

    public void purchaseItems(Items item) {
        items.add(item);
    }

    public double getTotalCostOfPurchase() {
        return totalCostOfPurchase;
    }

    public void computeTotalCostOfPurchase(double costOfPurchase) {
        totalCostOfPurchase += costOfPurchase;
    }
}













