package ClassWork;

public class MP3Player {
    private boolean isOn = false;

    public void turnOnAndOff() {
        isOn = !isOn;
    }

    public boolean isOn() {
        return isOn;
    }
}
