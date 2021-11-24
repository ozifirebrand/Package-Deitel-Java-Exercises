package chapter17;

import java.security.SecureRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamsClasswork {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        System.out.printf("Sum of numbers between 1 and 10 is %s%n", IntStream.range(1, 11).sum());
        System.out.printf("Sum of all even numbers between 2 and 20 is %s%n",IntStream.rangeClosed(1, 10)
                .map((int x) ->{return x *2;}).sum());
        System.out.printf("Sum of triples of the even ints from 2 through 10 is %d%n", IntStream.
                rangeClosed(1, 10).filter(x->x%2 ==0).map(x->x * 3).sum());
        System.out.println("Random numbers on separate lines");
        random.ints(10, 1, 7).forEach(System.out::println);

        String numbers = random.ints(10,1, 7).
                mapToObj(String::valueOf).collect(Collectors.joining(" "));
        System.out.printf("Random numbers on one line %s%n", numbers);

        int [] values = {3, 10, 8, 4, 1, 2, 9, 7, 5,6};
        System.out.print("Original values: ");
        System.out.println(
                IntStream.of(values).mapToObj(String :: valueOf).
                        collect(Collectors.joining(" "))
        );

        System.out.printf("%nCount: %d%n",IntStream.of(values).count());
        System.out.printf("Min: %d%n", IntStream.of(values).min().getAsInt());
        System.out.printf("Max: %d%n", IntStream.of(values).max().getAsInt());
        System.out.printf("Average: %.2f%n", IntStream.of(values).average().getAsDouble());
        System.out.printf("Sum via reduce method: %d%n", IntStream.of(values).
                reduce(0, (x,y)->x+y));
        System.out.printf("Sum of squares via reduce method: %d%n", IntStream.of(values)
                .reduce(0, (x,y)->x+y*y));
    }
}
