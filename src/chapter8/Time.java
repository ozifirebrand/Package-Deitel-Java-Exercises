package chapter8;

public class Time {
    private int hourInSeconds;
    private int minute;
    private int seconds;


    public void setTime(int hour, int minute, int seconds) {
        boolean hourIsOutOfRange = hour < 0 || hour > 24;
        boolean minuteIsOutOfRange = minute < 0 || minute > 59;
        boolean secondsIsOutOfRange = seconds < 0 || seconds > 60;
        if ( !hourIsOutOfRange ) {
            this.hourInSeconds = hour * 60 * 60;
        } else {
            throw new IllegalArgumentException("Hour out of range");
        }
        if ( !minuteIsOutOfRange ) {
            this.minute = minute * 60;
        } else {
            throw new IllegalArgumentException("Minute is out of range");
        }
        if ( !secondsIsOutOfRange ) {
            this.seconds = seconds;
        } else {
            throw new IllegalArgumentException("Seconds out of range");
        }
    }


    public String toUniversalString(){
        return String.format("%02d:%02d:%02d", hourInSeconds,minute,seconds);
    }

    public String toString(){
        return String.format("%d:%02d:%02d %s",((hourInSeconds == 0 || hourInSeconds == 12) ?12
                : hourInSeconds % 12), minute, seconds, (hourInSeconds <12 ? "AM" : "PM"));
    }
}