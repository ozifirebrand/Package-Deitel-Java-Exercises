package chapter10.CheckoutAssignment;

public class CheckoutInvoice implements Price {
    private int quantity;
    private Item product;
    private double bonus;

    public int getQuantity() {
        return quantity;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
