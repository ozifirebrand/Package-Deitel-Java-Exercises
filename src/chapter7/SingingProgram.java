package chapter7;

public class SingingProgram {

    String song;

    public void music(int songId, String songLyrics){
        for (int songNumber = 1; songNumber <= songId; songNumber++){
            for (int secondSong = 1; secondSong <= songId; secondSong ++)
                System.out.print(songLyrics);
            song = songLyrics;
            System.out.println();
        }
    }

    public  String lyrics(){
        return song;
    }
}
