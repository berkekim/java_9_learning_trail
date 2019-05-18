package java9.learning.trail.all.listings;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Listing_07 {

    public static void main(String[] args) {

        String[] values = {"Red", "orange", "Yellow", "green", "Blue", "indigo", "Violet"};

        System.out.printf("Original Strings: %s%n", Arrays.asList(values));

        System.out.printf("Strings in uppercase: %s%n", Arrays.stream(values).map(String::toUpperCase).collect(Collectors.toList()));

        System.out.printf("Strings less than n sorted ascending: %s%n",
                Arrays.stream(values)
                        .filter(s -> s.compareToIgnoreCase("n") < 0)
                        .sorted(String.CASE_INSENSITIVE_ORDER).collect(Collectors.toList()));

        System.out.printf("Strings less than n sorted descending: %s%n",
                Arrays.stream(values)
                        .filter(s -> s.compareToIgnoreCase("n") < 0)
                        .sorted(String.CASE_INSENSITIVE_ORDER.reversed())
                        .collect(Collectors.toList()));

    }

}
