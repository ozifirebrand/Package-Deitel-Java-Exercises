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
    }

    private static void pickMenuItem(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        int input = scanner.nextInt();
        menuItem(input);
    }
    private static void menuItem(int number) {
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