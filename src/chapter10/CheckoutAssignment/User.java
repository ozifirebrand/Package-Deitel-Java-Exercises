package chapter10.CheckoutAssignment;

import java.util.Scanner;

public class User {
   private Cart userCart = new Cart();
   private Card userCard = new Card();
   private Receipt userReceipt = new Receipt();
   private String userName;

    public void setUserName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome. What is your name please?");
        this.userName = scanner.nextLine();
    }

    public String getUserName(){
        return userName;
    }
}
