package com.demo;
import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter a 4-digit number: ");
        int number = sc.nextInt();

       
        if (number < 1000 || number > 9999) {
            System.out.println("Please enter  valid 4-digit number.");
        } else {
            int originalNumber = number;
            int reversedNumber = 0;

           
            while (number != 0) {
                int digit = number % 10;
                reversedNumber = reversedNumber * 10 + digit;
                number /= 10;
            }

            
            if (originalNumber == reversedNumber) {
                System.out.println(" a palindrome.");
            } else {
                System.out.println(" not a palindrome.");
            }
        }

        
    }
}
