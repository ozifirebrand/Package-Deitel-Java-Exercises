package ClassWork;

public class MP3Player {
    private boolean isOn = false;
    private boolean playingMusic;


    public void turnOnAndOff() {
        isOn = !isOn;
    }

    public boolean isOn() {
        return isOn;
    }

    public void playMusic() {
    }

    public boolean musicIsPlaying() {
        return playingMusic;
    }
}
