package com.demo;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class StringStart {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "fig", "grape","akula");

        char targetLetter = 'a';

        long count = strings.stream()
                .filter(s -> s.charAt(0) == targetLetter)
                .count();

        System.out.println("Strings starting with '" + targetLetter + "': " + count);
    }
}
