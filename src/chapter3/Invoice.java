package chapter3;

public class Invoice {
    private String number;
    private String description;
    private int quantity;
    private double pricePerItem;
    double amount;

    Invoice(){

    }

    Invoice(String number, String description, int quantity, double pricePerItem){
        this.number = number;
        this.description = description;
        this.quantity= quantity;
        this.pricePerItem = pricePerItem;
    }

    public void setNumber(String number){
        this.number = number;
    }
    public String getNumber(){
        return number;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    public void setQuantity(int quantity){
this.quantity = quantity;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setPricePerItem(double pricePerItem){
this.pricePerItem = pricePerItem;
    }

    public double getPricePerItem(){
        return pricePerItem;
    }

    public double getInvoiceAmount(double amount){
        amount = quantity * pricePerItem;
        boolean priceOrQuantityIsZero = pricePerItem < 0 || quantity < 0;
        if(priceOrQuantityIsZero ){
            amount = 0;}
        return amount;

    }
    public double getDiscount(double amount){

        double discount = amount/2;
        return discount;
    }

    public static void main(String[] args) {
        Invoice myInvoice = new  Invoice("Water", "part 2", 22, 15.5);

        System.out.println(myInvoice.getDiscount(50));

        System.out.println(myInvoice.getInvoiceAmount(75.2));
    }
}