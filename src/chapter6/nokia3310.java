package chapter6;

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
        System.out.println("Enter no");
        int number = scanner.nextInt();
        pickMenuSubItems(number);
    }

    private static void pickMenuSubItems(int number){
        switch (number){
            case 1 : pickPhoneBookItem();break;
            case 2 : pickMessagesItem();break;
            case 3 : displayChat();break;
            case 4 :pickCallRegisterItems();break;
        }
    }

    private static void pickCallRegisterItems() {
        displayCallRegisterItems();
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        switch (number){
            case 1:
                System.out.println("Missed calls"); break;
            case 2:
                System.out.println("Received calls"); break;
            case 3:
                System.out.println("Dialled calls"); break;
            case 4:
                System.out.println("Erase recent call lists"); break;
            case 5:
                System.out.println("Show call duration");
                pickCallDuration(); break;
            case 6:
                System.out.println("Show call costs"); break;
            case 7:
                System.out.println("Prepaid credit"); break;
        }
    }

    private static void displayCallRegisterItems() {
        System.out.println("""
                1. Missed calls
                2. Received calls
                3. Dialled numbers
                4. Erase recent call lists
                5. Show call duration
                6. Show call costs
                7. Call cost settings
                8. Prepaid credit""");
    }

    public static void pickCallDuration(){
        displayCallDuration();
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
    }

    private static void displayCallDuration() {
        System.out.println("""
                1. Last call duration
                2. All calls' duration
                3. Received calls' duration
                4. Dialled calls' duration
                5. Clear timers""");
    }

    private static void displayChat() {
        System.out.println("Chat");
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
     case 1: System.out.println("Phone book");
     break;
     case 2: System.out.println("Messages");
     break;
     case 3: System.out.println("Chats");
     break;
     case 4: System.out.println("Call register");
     break;
     case 5: System.out.println("Tones");
     break;
     case 6: System.out.println("Settings");break;
     case 7:System.out.println("Call divert");break;
     case 8:System.out.println("Games");break;
     case 9:System.out.println("Calculator");break;
     case 10: System.out.println("Reminders");break;
     case 11: System.out.println("Clock");break;
     case 12: System.out.println("Profiles");break;
     case 13: System.out.println("SIM Services");break;
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