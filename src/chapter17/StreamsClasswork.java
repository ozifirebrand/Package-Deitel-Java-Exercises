package chapter17;

import java.util.stream.IntStream;

public class StreamsClasswork {
    public static void main(String[] args) {
        System.out.println("Sum of numbers between 1 and 10 is "+ IntStream.range(1, 10).sum());
    }
}
