package CompositionInheritanceAssignment;

public class Item {
    private int itemPrice;
    private int itemQuantity;
    int totalOfItem;


    public void statePrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int displayPrice() {
        return itemPrice;
    }

    public void stateQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public int displayQuantity() {
        return itemQuantity;
    }

    public int computeTotalOfItem() {
        totalOfItem = itemPrice * itemQuantity;
        return totalOfItem;
    }
}
