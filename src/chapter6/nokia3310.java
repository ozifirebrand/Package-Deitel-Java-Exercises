package chapter6;

//import com.sun.jdi.event.ThreadStartEvent;

/*The phone is perpetually on
When the menu key is pressed, the screen displays Phone book,
    Messages, Chats, Call register, Tones, Settings, Call diver,
    Games, Calculator, Reminders, Clock,Profiles, SIM Services.

The menu is a switch case static method on its own carrying
all the displayed methods.

 */
import java.util.Scanner;
public class nokia3310 {
    public static void main(String[] args) {
        displayMenu();
        pickMenuItem();
        displayMenuSubItems();
    }

    private static  void displayMenuSubItems(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        int number = scanner.nextInt();
        pickMenuSubItems(number);
    }
    private static void pickMenuSubItems(int number){
        switch (number){
            case 1 -> pickPhoneBookItem();
            case 2 -> pickMessagesItem();
        }
    }

    private static void pickMessagesItem() {
        displayMessagesItems();
    }

    private static void displayMessagesItems() {
        System.out.println("""
                1. Write messages
                2. Inbox
                3. Outbox
                4. Picture messages
                5. Templates
                6. Smileys
                7. Message settings
                8. Info service
                9. Voice mailbox number
                10. Service command editor""");
    }

    private static void pickPhoneBookItem() {
        displayPhoneBookItems();
    }

    private static void displayPhoneBookItems() {
        System.out.println("""
                1. Search
                2. Service Nos.
                3. Add name
                4. Erase
                5. Edit
                6. Assign tone
                7. Send b'card
                8. Options
                9. Speed dials
                10. Voice tags""");
    }

    private static void pickMenuItem(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        int input = scanner.nextInt();
        displayMenuItems(input);
    }
    private static void displayMenuItems(int number) {
 switch (number){
     case 1-> System.out.println("Phone book");
     case 2-> System.out.println("Messages");
     case 3-> System.out.println("Chats");
     case 4-> System.out.println("Call register");
     case 5-> System.out.println("Tones");
     case 6-> System.out.println("Settings");
     case 7-> System.out.println("Call divert");
     case 8-> System.out.println("Games");
     case 9-> System.out.println("Calculator");
     case 10-> System.out.println("Reminders");
     case 11-> System.out.println("Clock");
     case 12-> System.out.println("Profiles");
     case 13-> System.out.println("SIM Services");
      }
    }

    private static void displayMenu() {
        System.out.println("""
               1. Phone book
               2. Messages
               3. Chats
               4. Call register
               5. Tones
               6. Settings
               7. Call diver
               8. Games
               9. Calculator
               10. Reminders
               11. Clock
               12. Profiles
               13. SIM Services""");
    }
}