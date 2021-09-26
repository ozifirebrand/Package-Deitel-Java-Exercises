package ClassWork;

public class Music {
    private String name;
    private static int trackNumber ;
    private int lengthInSeconds;
    private static int count =0 ;
    public Music(String name, int lengthInSeconds){
        this.name = name;
        this.lengthInSeconds = lengthInSeconds;
        trackNumber = count;
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLengthInSeconds() {
        return lengthInSeconds;
    }

    public void setLengthInSeconds(int lengthInSeconds) {
        this.lengthInSeconds = lengthInSeconds;
    }
}
