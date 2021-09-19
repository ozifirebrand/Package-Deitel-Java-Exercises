package chapter10.CheckoutAssignment;

import java.util.Scanner;

public class Card {
    double amountPaid;
    double balance;
    /*To get the amount paid
    User inputs amount to be paid
    This amount is subtracted from the balance
    If balance is lesser than the specified amount to be paid,
        User receives a message stating insufficient balance
     */
    public double getAmountPaid() {
        return amountPaid;
    }

    public double setAmountPaid() {
        Scanner scanner = new Scanner(System.in);
        amountPaid =scanner.nextDouble();
        return amountPaid;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance() {
        if ( amountPaid > balance ) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amountPaid;
        }
    }
}