package chapter10.shoppingCart;

import java.util.Scanner;

public class User {
    String username;
    Card card = new Card();

    public User(){
        System.out.println(getUsername());
    }
    private void askUserForName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome. Your name please.");
        username = scanner.nextLine();
    }

    public String getUsername(){
        askUserForName();
        return username;
    }
}
