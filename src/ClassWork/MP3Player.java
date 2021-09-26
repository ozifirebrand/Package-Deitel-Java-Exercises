package ClassWork;

import java.util.ArrayList;

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
        if ( isOn = true ) {
            isPlayingMusic = !isPlayingMusic;
        }
    }

    public boolean musicIsPlaying() {
        return isPlayingMusic;
    }

    public void turnVolumeUp() {
        if ( isOn= true ) {
            if ( volume < 100 ) {
                volume += 5;
            }
        }
    }

    public int viewVolumeLevel() {
        return volume;
    }

    public void turnVolumeDown() {
        if ( volume > 0 )
        volume -= 5;
    }

}
