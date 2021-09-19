package chapter10.CheckoutAssignment;

import java.util.Scanner;

public class User {
//   private Cart cart = new Cart();
   private Card card = new Card();
   private Receipt receipt = new Receipt();
   private String userName;

    public User (){
        System.out.println("Welcome. What is your name please?");
        userName = input2();
        System.out.print("Welcome "+getUserName()+
                ". What will you like to purchase today?");
        this.userName = userName;
    }

    public String getUserName(){
        return userName;
    }

    private static String input2() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
