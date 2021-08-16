package chapter6;

//import com.sun.jdi.event.ThreadStartEvent;

/*The phone is perpetually on
When the menu key is pressed, the screen displays Phone book,
    Messages, Chats, Call register, Tones, Settings, Call diver,
    Games, Calculator, Reminders, Clock,Profiles, SIM Services.

The menu is a switch case static method on its own carrying
all the displayed methods.

Most methods have switch cases that are nested with other
switch cases

 */
import java.util.Scanner;
public class nokia3310 {
//    public String displayMenu() {
//
//    }
//
//    public String menuMethod(int number){
//
//        return message;
//    }



    public String phoneBook(int number){
        String message = switch (number) {
            case 1 -> "Search";
            case 2 -> "Service Nos";
            case 3 -> "Add name";
            case 4 -> "Erase";
            case 5 -> "Edit";
            case 6 -> "Assign tone";
            case 7 -> "Send b'card";
            case 8 -> "Options";
            case 9 -> "Speed dials";
            case 10 -> "Voice tags";
            default -> "";
        };
        return message;
    }


    public String options(int number){
        String message =switch (number){
            case 1 -> "Type of view";
            case 2 ->  "Memory status";
            default -> "";
        };
        return message;
    }


    public String messages(int number){
        String message = switch (number) {
            case 1 -> "Write messages";
            case 2 -> "Inbox";
            case 3 -> "Outbox";
            case 4 -> "Picture messages";
            case 5 -> "Templates";
            case 6 -> "Smileys";
            case 7 -> "Message settings";
            default -> "";
        };
        return message;
    }

    public void chat(){

    }

    public String callRegister(int number){
        String message = switch (number) {
            case 1 -> "Missed calls";
            case 2 -> "Received calls";
            case 3 -> "Dialled numbers";
            case 4 -> "Erase recent call lists";
            case 5 -> "Show call duration";
            case 6 -> "Show call costs";
            case 7 -> "Call cost settings";
            case 8 -> "Prepaid credit";
            default -> "";
        };
        return message;
    }

    public String tones(int number){
        String message = switch (number) {
            case 1 -> "Ringing tone";
            case 2 -> "Ringing volume";
            case 3 -> "Incoming call alert";
            case 4 -> "Composer";
            case 5 -> "Message alert tone";
            case 6 -> "Keypad tones";
            case 7 -> "Warning and game tones";
            case 8 -> "Vibrating alert";
            case 9 -> "Screen saver";
            default -> "";
        };
        return message;
    }

    public String settings(int number){
        String message = switch (number) {
            case 1 -> "Call settings";
            case 2 -> "Phone settings";
            case 3 -> "Security settings";
            case 4 -> "Restore factory settings";
            default -> "";
        };
        return message;
    }

    public void callDivert(){

    }

    public void games(){

    }

    public void calculator(){

    }

    public void reminders(){

    }
//    public String options(int number){
//        String message =switch (number){
//            case 1 -> "Type of view";
//            case 2 -> "Memory status";
//            default ->"";
//        };
//        return message;
//    }

    public static String  clock(int number){
        String message= switch (number) {
            case 1 -> "Alarm clock";
            case 2 -> "Clock settings";
            case 3 -> "Date settings";
            case 4 -> "Stopwatch";
            case 5 -> "Countdown timer";
            case 6 -> "Auto update of date and time";
            default ->"";
        };
        return message;
    }

    public void profiles(){

    }

    public void simServices(){

    }


}

//
//    int numberInOptions;
//
//    int messageNumber;
//    String messageSettings;

//switch (messageNumber){
//                case 1: messageSettings = "Set";
//                break;
//                case 2: messageSettings = "Common";
//                break;
//                case 3: messageSettings = "Chat";
//                break;
//                case 4: messageSettings = "Call register";
//                break;
//            }
//        public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter year and score separated by space.");
//        int year = scanner.nextInt();
//        int marks = scanner.nextInt();
//        switch(year) {
//            case 1:
//                System.out.print("First year students are not e...");
//                        break;
//            case 2:
//                System.out.print("Second year students are not e...");
//                break;
//            case 3:
//                switch(marks){
//                    case 1:
//                        System.out.print("Your mark cant earn a scholarship");
//                        break;
//                    case 60:
//                        System.out.print("Your mark cant earn a scholarship");
//                        break;
//                    case 70:
//                        System.out.print("you cant earn nada");
//                        break;
//                    case 80:
//                        System.out.print("Take your scholarship and getaaaat!!");
//                        break;
//                }
//        }
//  case 1 -> phoneBookDetail = "Search";
//          case 2 -> phoneBookDetail = "Service Nos";
//          case 3 -> phoneBookDetail = "Add name";
//          case 4 -> phoneBookDetail = "Erase";
//          case 5 -> phoneBookDetail = "Edit";
//          case 6 -> phoneBookDetail = "Assign tone";
//          case 7 -> phoneBookDetail = "Send b'card";
//          case 8 -> phoneBookDetail = "Options";
//          case 9 -> phoneBookDetail = "Speed dials";
//          case 10 -> phoneBookDetail = "Voice tags";
//
//System.out.println("""
//                1. Phone Book
//                2. Messages
//                3. Chats
//                4. Call
//                5. Tones
//                6. Settings
//                7. Call divert
//                8. Games
//                9. Calculator
//                10. Reminders
//                11. Clock
//                12. Profiles
//                13. SIM Services.""");
//        }
