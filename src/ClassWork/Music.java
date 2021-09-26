package ClassWork;

public class Music {
    private String name;
    private static int trackNumber = 0 ;
    private int lengthInSeconds;

    public Music(){
        name = null;
        trackNumber += 1;
        lengthInSeconds = 0;
    }

    public int getTrackNumber(){
        return trackNumber;
    }

    }
