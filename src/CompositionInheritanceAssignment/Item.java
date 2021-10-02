package CompositionInheritanceAssignment;

public class Item {
    private int itemPrice;
    private int itemQuantity;
    int totalOfItem;
    private String itemName;


    public Item(String itemName, int itemPrice, int itemQuantity){
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemQuantity = itemQuantity;
    }
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

    public int displayTotalOfItem(){
        return totalOfItem;
    }

    public void computeTotalOfItem() {
        totalOfItem = itemPrice * itemQuantity;
    }

    public void setItemName(String itemName){
        this.itemName = itemName;
    }
    public String getItemName() {
        return itemName;
    }
}
