package java9.learning.trail.all.listings;

import java.security.SecureRandom;
import java.util.stream.Collectors;

public class Listing_04 {

    public static void main(String[] args) {

        SecureRandom sc = new SecureRandom();

        sc.ints(10, 1, 7)
                .forEach(System.out::println);

        String numbers = sc.ints(10, 1, 7)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" "));

        System.out.printf("Numbers: %s%n", numbers);
        
    }

}
