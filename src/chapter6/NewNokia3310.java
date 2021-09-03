package chapter6;

import java.util.Scanner;

public class NewNokia3310 {
    /*User inputs the first number after the menu displays the menu
    When user inputs a number, the screen displays the item and its items

    public static void displayMenu(){
        System.out.println("""
                1. Phonebook
                2. Messages
                3. Chat
                4. Call register""");
    }

    public static void navigateMenuItems(){
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
*/
    public static int input(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void displayMenuItems(){
        displayPhoneBook();
        displayMessagesMenu();
    }

    public static void displayPhoneBook() {
        System.out.println("1. Phone book");
    }

    public static void displayPhonebookMenu() {
        search();
        showServiceNos();
        addName();
        erase();
        edit();
        sendBCard();
        showOptions();
        displaySpeedDials();
        implementVoiceTags();
        assignTone();
    }
    private static void search() {
        System.out.println("1. Search");}

    private static void showServiceNos() {
        System.out.println("2. Service Nos");}

    private static void addName() {
        System.out.println("3. Add name");}

    private static void erase() {
        System.out.println("4. Erase");}

    private static void edit() {
        System.out.println("5. Edit");}

    private static void assignTone() {
        System.out.println("6. Assign tone");}

    private static void sendBCard() {
        System.out.println("7. Send B'card");}

    private static void showOptions() {
        System.out.println("8. Options");
    }

    public static void displayOptionsMenu() {
        displayTypeOfView();
        displayMemoryStatus();
    }

    private static void displayTypeOfView() {
        System.out.println("1. Type of View");}

    private static void displayMemoryStatus() {
        System.out.println("2. Memory status");}

    private static void displaySpeedDials() {
        System.out.println("9. Speed dials");}

    private static void implementVoiceTags() {
        System.out.println("10. Voice tags");}


    public static void displayCallRegisterMenu(){
    }

    public static void displayChatMenu(){
    }
    public static void displayMessagesMenu(){
        writeMessages();
        createInbox();
        createOutbox();
        displayPicturesMessages();
        displayTemplates();
        displaySmileys();
        displayMessageSettings();
        displayInfoService();
        displayVoiceMailboxNumber();
        displayServiceCommandEditor();
    }

    private static void displayServiceCommandEditor() {
        System.out.println("10. Service command editor");
    }

    private static void displayVoiceMailboxNumber() {
        System.out.println("9. Voice mailbox number");
    }

    private static void displayInfoService() {
        System.out.println("8. Info service");
    }

    private static void displayMessageSettings() {
        System.out.println("7. Message settings");
    }

    private static void displaySmileys() {
        System.out.println("6. Smileys");
    }

    private static void displayTemplates() {
        System.out.println("5. Templates");
    }

    private static void displayPicturesMessages() {
        System.out.println("4. Picture messages");
    }

    private static void createOutbox() {
        System.out.println("3. Outbox");
    }

    private static void createInbox() {
        System.out.println("2. Inbox");
    }

    private static void writeMessages() {
        System.out.println("1. Write messages");
    }

    private static void back() {
    }


}
/*The display methods call the construct methods.
    The major function of the display methods is to carry out the
    commands in the construct methods which carry the main print
    commands
     */

/*In my new method, I am going to create a method for every menu item
These methods have calls in them for other tasks
A method is created to take input and to navigate back to main
Other methods are meant to call each menu item and carry out specific instructions
If user enters zero, the program returns to the previous method
 */