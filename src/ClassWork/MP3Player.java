package ClassWork;

public class MP3Player {
    private boolean isOn ;
    private boolean isPlayingMusic ;
    private int volume = 0;

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

    public void turnVolumeUp() {
        if ( volume < 100 ){
        volume +=5;}
    }

    public int viewVolumeLevel() {
        return volume;
    }
}
