package com.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class StringSorter {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("banana", "apple", "date", "cherry", "fish");

        // Sort in ascending order
        Collections.sort(strings);
        System.out.println("Ascending Sorted List: " + strings);

        // Sort in descending order
        Collections.sort(strings, Collections.reverseOrder());
        System.out.println("Descending Sorted List: " + strings);
    }
}

