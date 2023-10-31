package com.demo;

import java.util.stream.IntStream;

public class SecondSmallestAndLargest {
    public static void main(String[] args) {
        int nums[] = {9, 4, 6, 5, 7, 4};

        int[] sortedDistinctArray = IntStream.of(nums)
                .distinct()
                .sorted()
                .toArray();

        int secondSmallest = sortedDistinctArray[1]; // Second element is the second smallest
        int secondLargest = sortedDistinctArray[sortedDistinctArray.length - 2]; // Second-to-last element is the second largest

        System.out.println("Second Smallest: " + secondSmallest);
        System.out.println("Second Largest: " + secondLargest);
    }
}
