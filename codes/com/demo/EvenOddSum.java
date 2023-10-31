package com.demo;

import java.util.stream.IntStream;

public class EvenOddSum {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int evenSum = IntStream.of(nums)
                .filter(num -> num % 2 == 0)
                .sum();

        int oddSum = IntStream.of(nums)
                .filter(num -> num % 2 != 0)
                .sum();
       
        System.out.println("Sum of Even Numbers: " + evenSum);
        System.out.println("Sum of Odd Numbers: " + oddSum);
    }
}
