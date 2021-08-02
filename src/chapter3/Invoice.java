package chapter3;

public class Invoice {
    private String number;
    private String description;
    private int quantity;
    private double pricePerItem;
    double amount;

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
        if( pricePerItem < 0 || quantity < 0){
            amount = 0;}
        return amount;

    }
    public double getDiscount(double amount){

        double discount = amount/2;
        return discount;
    }
}
