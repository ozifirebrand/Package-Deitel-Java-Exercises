package CompositionInheritanceAssignment;

import java.util.ArrayList;

public class ShoppingCart {

    private ArrayList<Item> items = new ArrayList<>();
    private int totalPriceOfItems;

    public void addItemToCart(Item item) {
        items.add(item);
    }

    public ArrayList<Item> getItemsInCart() {
        return items;
    }

    public int getTotalPriceOfItemsInCart() {
        return totalPriceOfItems;
    }

    public void computeTotalPriceOfItemsInCart() {
        for (Item item : items) {
            item.computeTotalOfItem();
            totalPriceOfItems += item.displayTotalOfItem();
        }
    }

    public void displayItems() {
        for (Item item : items){
            item.computeTotalOfItem();
            System.out.println(item.getItemName() +"\t" +item.displayPrice() + "\t" +item.displayQuantity() + "\t" +item.displayTotalOfItem());
        }
    }
}
