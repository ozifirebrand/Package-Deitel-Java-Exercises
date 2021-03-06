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
    private static int input() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void displayMenuItems() {
        displayPhoneBook();
        displayMessage();
        displayChat();
        displayCallRegister();
        navigateMenuItems();
    }


    public static void navigateMenuItems(){
        int input = input();
        while (true){
        if ( input ==0 ){displayMenuItems(); break;}
        else {
            switch (input) {
                case 1 -> {
                    displayPhonebookMenu();
                    navigatePhoneBookMenu();}
                case 2 -> {
                    displayMessagesMenu();
                    navigateMessagesMenu();
                }
                case 3 -> displayChat();
                case 4 -> {
                    displayCallRegisterMenu();
                    navigateCallRegisterMenu();
                }
            }
        }
        }
    }


    private static void displayPhoneBook() {
        System.out.println("1. Phone book");
    }

    public static void displayPhonebookMenu() {
        search();
        showServiceNos();
        addName();
        erase();
        edit();
        assignTone();
        sendBCard();
        showOptions();
        displaySpeedDials();
        implementVoiceTags();
        navigatePhoneBookMenu();
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
        System.out.println("6. Assign tone");
    }

    private static void sendBCard() {
        System.out.println("7. Send B'card");
    }

    private static void showOptions() { System.out.println("8. Options"); }

    public static void navigatePhoneBookMenu(){
        int input = input();
        boolean inputIsNotAvailable= input>0 && input< 8;
        if ( input ==0 ){displayMenuItems();}

        else if(inputIsNotAvailable){
            navigatePhoneBookMenu();
        }else {
            if ( input == 8 ) {
                displayOptionsMenu();
            }
        }
    }

    private static void displayOptionsMenu() {
        displayTypeOfView();
        displayMemoryStatus();}

    private static void displayTypeOfView() {
        System.out.println("1. Type of View");
    }

    private static void displayMemoryStatus() {
        System.out.println("2. Memory status");
    }

    private static void displaySpeedDials() {
        System.out.println("9. Speed dials");
    }

    private static void implementVoiceTags() {
        System.out.println("10. Voice tags");
    }

    private static void displayMessage() {
       System.out.println("2. Messages");

    }

    private static void navigateMessagesMenu() {
        int input = input();
        if(input ==0 ){displayMenuItems();}
        else {
            if ( input != 7 ) {
                navigateMessagesMenu();}
            else {
                displayMessageSettings();
                navigateMessageSettingsMenu();
            }
        }
    }

    private static void displayMessagesMenu() {
        displayMessage();
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

    private static void writeMessages() {
        System.out.println("1. Write messages");
    }

    private static void createInbox() {
        System.out.println("2. Inbox");
    }

    private static void createOutbox() {
        System.out.println("3. Outbox");
    }

    private static void displayPicturesMessages() {
        System.out.println("4. Picture messages");
    }

    private static void displayTemplates() {
        System.out.println("5. Templates");
    }

    private static void displaySmileys() {
        System.out.println("6. Smileys");
    }

    private static void displayMessageSettings() {
        System.out.println("7. Message settings");
    }

    private static void displayInfoService() {
        System.out.println("8. Info service");
    }

    private static void displayVoiceMailboxNumber() {
        System.out.println("9. Voice mailbox number");
    }

    private static void displayServiceCommandEditor() {
        System.out.println("10. Service command editor");
    }

    public static void displayMessageSettingsMenu() {
        set();
        displayCommon();}

    private static void navigateMessageSettingsMenu(){
        int input = input();
        boolean isInvalidInput = input >2 || input <1 ;
        if(input == 0){displayMessagesMenu();}
        else
            if ( isInvalidInput ) {
                navigateMessageSettingsMenu();
            }
        else {
                switch (input) {
                    case 1 -> displaySetMenu();
                    case 2 -> displayCommonMenu();}
        }
    }


    private static void set() {
        System.out.println("1. Set");
    }

    private static void displaySetMenu() {
        set();
        displayMessageCentreNumber();
        displayMessageSentAs();
        displayMessageValidity();
        int input = input();
        if ( input> 0 ){displaySetMenu();}else {displayMessagesMenu();}
    }

    private static void displayMessageCentreNumber() {
        System.out.println("1. Message centre number");
    }

    private static void displayMessageSentAs() {
        System.out.println("2. Message sent as");
    }

    private static void displayMessageValidity() {
        System.out.println("3. Message validity");
    }

    private static void displayCommon() {
        System.out.println("2. Common");
    }

    private static void displayCommonMenu() {
        displayCommon();
        displayDeliveryReports();
        replyViaSameCentre();
        displayCharacterSupport();
        int input = input();
        if ( input> 0 ){displayCommonMenu();}else {displayMessagesMenu();}
    }

    private static void displayDeliveryReports() {
        System.out.println("1. Delivery reports");
    }

    private static void replyViaSameCentre() {
        System.out.println("2. Reply via same centre");
    }

    private static void displayCharacterSupport() {
        System.out.println("3. Character support");
    }


    private static void displayChat() {
        System.out.println("3. Chat");
    }


    private static void displayCallRegister() {
        System.out.println("4. Call register");
    }

    public static void navigateCallRegisterMenu() {
        int input = input();
        boolean isGreaterThanZero = input>0;
        boolean isInvalidInput = input < 5 || input > 7;
        if ( isInvalidInput && isGreaterThanZero) {
            navigateCallRegisterMenu();
        } else if ( input==0 ){
            displayMenuItems();
        }else {
            switch (input) {
                case 5 -> showCallDurationMenu();
                case 6 -> showCallCostsMenu();
                case 7 -> displayCallCostSettingsMenu(); }
        }
    }

    private static void displayCallRegisterMenu() {
        displayCallRegister();
        displayMissedCalls();
        displayReceivedCalls();
        displayDialledNumbers();
        eraseRecentCallLists();
        showCallDuration();
        showCallCosts();
        displayCallCostSettings();
        prepaidCredit();
        navigateCallRegisterMenu();
    }


    private static void displayMissedCalls() {
        System.out.println("1. Missed calls");
    }

    private static void displayReceivedCalls() {
        System.out.println("2. Received calls");
    }

    private static void displayDialledNumbers() {
        System.out.println("3. Dialled numbers");
    }

    private static void eraseRecentCallLists() {System.out.println("4. Erase recent call lists"); }

    private static void showCallDuration() {
        System.out.println("5. Call duration");
    }

    private static void showCallDurationMenu() {
        showCallDuration();
        displayLastCallDuration();
        displayAllCallDuration();
        displayReceivedCallsDuration();
        displayDialledCallsDuration();
        clearTimers();
        int input = input();
        if ( input> 0 ){showCallDurationMenu();}else {displayCallRegisterMenu();}
    }

    private static void displayLastCallDuration() {
        System.out.println("1. Last call duration");
    }

    private static void displayAllCallDuration() {
        System.out.println("2. All calls duration");
    }

    private static void displayReceivedCallsDuration() {
        System.out.println("3. Received calls duration");
    }

    private static void displayDialledCallsDuration() {
        System.out.println("4. Dialled calls duration");
    }

    private static void clearTimers() {
        System.out.println("5. Clear timers");
    }


    private static void showCallCosts() {
        System.out.println("6. Call costs");
    }


    private static void showCallCostsMenu() {
        showCallCosts();
        displayLastCallCost();
        displayAllCallsCost();
        clearCounters();
        int input = input();
        if ( input> 0 ){showCallCostsMenu();}else {displayCallRegister();}
    }

    private static void displayLastCallCost() { System.out.println("1. Last call cost"); }

    private static void displayAllCallsCost() { System.out.println("2. All calls cost");}

    private static void clearCounters() { System.out.println("3. Clear counters"); }

    private static void displayCallCostSettings() { System.out.println("7. Call cost settings"); }

    private static void displayCallCostSettingsMenu() {
        displayCallCostLimit();
        showCostsIn();
        int input = input();
        if ( input> 0 ){displayCallCostSettingsMenu();}else {displayCallRegister();}
    }

    private static void displayCallCostLimit() { System.out.println("1. Call cost limit"); }

    private static void showCostsIn() { System.out.println("2. Show costs in"); }

    private static void prepaidCredit() { System.out.println("8. Prepaid credit"); }

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