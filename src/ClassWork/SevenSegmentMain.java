package ClassWork;

public class SevenSegmentMain {
    public static void main(String[] args) {
        int [] [] segmentDisplay = new int[5][4];
        SevenSegmentDisplay sevenSegment = new SevenSegmentDisplay();
        sevenSegment.arrayss(segmentDisplay);
        sevenSegment.printArrays(segmentDisplay);
    }
}
