package java9.learning.trail.all.listings;

import java.util.stream.IntStream;

public class Listing_02 {

    public static void main(String[] args) {

        int result = IntStream.rangeClosed(1, 10)         // 1, 2, 3, 4, ..., 10
                .filter(x -> x % 2 == 0)                  // 2, 4, 6, 8, 10
                .map(x -> x * 3)                          // 6, 12, 18, 24, 30
                .sum();                                   // 90

        System.out.println("Sum: " + result);

    }

}
