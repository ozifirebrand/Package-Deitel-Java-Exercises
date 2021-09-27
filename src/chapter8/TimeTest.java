package chapter8;

public class TimeTest {

    public static void displayTime(String header, Time time) {
        System.out.printf("%s%nUniversal time: %s%nStandard time: %s%n",
                header, time.toUniversalString(), time.toString());
    }

    public static void main(String[] args) {
        Time time = new Time();

        displayTime("After time has been declared", time);
        System.out.println();
        time.setTime(13, 27, 6);

        displayTime("After calling setTime", time);
        try {
            time.setTime(99, 99, 99);
        } catch (IllegalArgumentException exception) {
            System.out.printf("Exception: %s%n", exception.getMessage());
        }
    }
}