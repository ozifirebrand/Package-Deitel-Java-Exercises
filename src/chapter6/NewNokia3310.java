package chapter6;

import java.util.Scanner;

public class NewNokia3310 {
    /*User inputs the first number that prompts console to display menu
    First menu page is displayed
    When user inputs a number, the screen displays the item and its items

     */
//
//    public static void displayMenu(){
//        System.out.println("""
//                1. Phonebook
//                2. Messages
//                3. Chat
//                4. Call register""");
//    }
//
//    public static void navigateMenuItems(){
//        int input = input();
//        switch (input)
//        { case 1: System.out.println("""
//                    1. Search
//                    2. Service
//                    3. Add name
//                    4. Erase
//                    5. Edit""");
//            break;
//            case 2: System.out.println("""
//                    1. Write messages
//                    2. Inbox
//                    3. Outbox
//                    4. Picture messages
//                    5. Templates""");
//            break;
//            case 3:
//                System.out.println();
//                break;
//            case 4: System.out.println("""
//                    1. Missed calls
//                    2. Received calls
//                    3. Dialled numbers
//                    4. Erase recent call lists
//                    5. Show call duration""");
//        }
//    }

    public static int input(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void displayMenuItems(){
        int input = input();
        constructMenuItems(input);

    }

    private static void constructMenuItems(int input) {
        switch (input){
            case 1: constructPhoneBookItems();
//            case 2: constructMessagesItems();
//            case 3: constructChatItems();
//            case 4: constructCallRegisterItems();
        }
    }

    /*The display methods call the construct methods.
    The major function of the display methods is to carry out the
    commands in the construct methods which carry the main print
    commands
     */
    private static void constructPhoneBookItems() {
        int input = input();
        displayPhonebookMenu();
    }

    public static void menuItems(){

    }

    public static void phoneBookMenu(){
        System.out.println("1. Phone book");
        navigateMenu();
        displayPhonebookMenu();
        back();
    }

    private static void back() {
        return;
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
        System.out.println("1. Search");
    }

    private static void showServiceNos() {
        System.out.println("2. Service Nos");
    }

    private static void addName() {
        System.out.println("3. Add name");
    }

    private static void erase() {
        System.out.println("4. Erase");
    }

    private static void edit() {
        System.out.println("5. Edit");
    }

    private static void assignTone() {
        System.out.println("6. Assign tone");}

    private static void sendBCard() {
        System.out.println("7. Send B'card");}

    private static void showOptions() {
        System.out.println("8. Options");}

    private static void displaySpeedDials() {
        System.out.println("9. Speed dials");}

    private static void implementVoiceTags() {
        System.out.println("10. Voice tags");}


    public static void displayCallRegisterMenu(){

    }

    public static void displayChatMenu(){

    }
    public static void displayMessagesMenu(){

    }

    private static void navigateMenu() {
        int input = input();
//        if ( input == 0 ){
//            displayMenu();
//        }
        input();
    }
}
/*In my new method, I am going to create a method for every menu item
These methods have calls in them for other tasks
A method is created to take input and to navigate back to main
Other methods are meant to call each menu item and carry out specific instructions
If user enters zero, the program returns to the previous method
 */