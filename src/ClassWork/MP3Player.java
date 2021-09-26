package ClassWork;

public class MP3Player {
    private boolean isOn ;
    private boolean isPlayingMusic ;


    public void turnOnAndOff() {
        isOn = !isOn;
    }

    public boolean isOn() {
        return isOn;
    }

    public void playMusic() {
        isPlayingMusic = !isPlayingMusic;
    }

    public boolean musicIsPlaying() {
        return isPlayingMusic;
    }
}
