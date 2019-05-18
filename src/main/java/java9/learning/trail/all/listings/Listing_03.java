package java9.learning.trail.all.listings;

import java.util.stream.IntStream;

public class Listing_03 {

    public static void main(String[] args) {

        int result = IntStream.rangeClosed(1, 10)
                .filter(x -> {
                    System.out.printf("%nfilter: %d%n", x);
                    return x % 2 == 0;
                })
                .map(x -> {
                    System.out.println("map: " + x);
                    return x * 3;
                })
                .sum();

        System.out.println("\nSum: " + result);

    }

}
