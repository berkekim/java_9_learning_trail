package java9.learning.trail.all.listings;

import java.util.stream.IntStream;

public class Listing_01 {

    public static void main(String[] args) {

        int sum = IntStream.rangeClosed(1, 10)
                .sum();

        System.out.println("Sum: " + sum);

    }

}
