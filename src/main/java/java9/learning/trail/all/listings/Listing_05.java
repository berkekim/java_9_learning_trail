package java9.learning.trail.all.listings;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Listing_05 {

    public static void main(String[] args) {

        int[] values = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7};

        System.out.printf("Original values: %s%n",
                IntStream.of(values)
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining(" ")));

        System.out.printf("Count: %d%n", IntStream.of(values).count());

        System.out.printf("Min: %d%n", IntStream.of(values).min().orElse(-1));

        System.out.printf("Max: %d%n", IntStream.of(values).max().orElse(-1));

        System.out.printf("Sum: %d%n", IntStream.of(values).sum());

        System.out.printf("Average: %.2f%n", IntStream.of(values).average().orElse(0.0));

        System.out.printf("Summary Statistics: %s%n", IntStream.of(values).summaryStatistics().toString());

        System.out.printf("Sum via reduce method: %d%n", IntStream.of(values).reduce(0, (x, y) -> x + y));

        System.out.printf("Product via reduce method: %d%n", IntStream.of(values).reduce((x, y) -> x * y).orElse(-1));

        System.out.printf("Sum of squares via map and sum: %d%n", IntStream.of(values).map(x -> x * x).sum());

        System.out.printf("Values displayed in sorted order: %s%n", IntStream.of(values).sorted().mapToObj(String::valueOf).collect(Collectors.joining(" ")));


    }
}
