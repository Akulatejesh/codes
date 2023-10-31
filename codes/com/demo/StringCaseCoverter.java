package com.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringCaseCoverter {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Akula", "Tejesh", "Java", "Streams");

        List<String> uppercaseStrings = strings.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        List<String> lowercaseStrings = strings.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        System.out.println("Original List: " + strings);
        System.out.println("Uppercase List: " + uppercaseStrings);
        System.out.println("Lowercase List: " + lowercaseStrings);
    }
}

