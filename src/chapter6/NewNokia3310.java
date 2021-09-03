package chapter6;

import java.util.Scanner;

public class NewNokia3310 {
    /*User inputs the first number that prompts console to display menu
    First menu page is displayed
    When user inputs a number, the screen displays the item and its items

     */

    public static void displayMenu(){
        System.out.println("""
                1. Phonebook
                2. Messages
                3. Chat
                4. Call register""");
    }

    public static int input(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void navigateMenu(){
        int input = input();
        switch (input)
        { case 1: System.out.println("""
                    1. Search
                    2. Service
                    3. Add name
                    4. Erase
                    5. Edit""");
            break;
            case 2: System.out.println("""
                    1. Write messages
                    2. Inbox
                    3. Outbox
                    4. Picture messages
                    5. Templates""");
            break;
            case 3:
                System.out.println();
                break;
            case 4: System.out.println("""
                    1. Missed calls
                    2. Received calls
                    3. Dialled numbers
                    4. Erase recent call lists
                    5. Show call duration""");

        }
    }
}
