package ClassWork.kata;

public class SevenSegmentMain {
    public static void main(String[]args) {
        SevSegDisplay display = new SevSegDisplay();
        display.clear();
        display.setScreen("11100101");

        display.getScreen();
        display.display();

        display.clear();
        display.setScreen("00111101");
        display.getScreen();
        display.display();
    }
}
