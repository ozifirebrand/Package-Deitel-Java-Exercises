package chapter10.CheckoutAssignment;

import java.util.Scanner;

public class User {
   private Cart cart = new Cart();
   private Card card = new Card();
   private Receipt receipt = new Receipt();
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
