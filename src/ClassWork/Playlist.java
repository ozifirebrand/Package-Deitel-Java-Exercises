package ClassWork;

import java.util.ArrayList;

public class Playlist {
    private ArrayList<Music> musics;
    private String name;
    private int index=0;

    public Playlist() {
        name = null;
        musics = null;
    }


    public void playNextMusic() {
        index++;
    }

    public int showNextMusic(){
        return index;
    }

}
