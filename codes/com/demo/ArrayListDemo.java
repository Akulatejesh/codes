package com.demo;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        Student student = new Student();
        ArrayList<String> studentNames = new ArrayList<>();

        // Add some random student names to the ArrayList
        studentNames.add("Tejesh");
        studentNames.add("Bhargav");
        studentNames.add("Bob");
        studentNames.add("Raghu");
        studentNames.add("Jailer");

        // Set the student names in the Student class
        student.setNames(studentNames);

        System.out.println("All Student Names:");
        student.printNames();

        // Search for a student by name
        student.searchName("Bhargav");

        // Print student name at a specific index
        student.searchName(2);

        // Remove a student name
        student.removeName("Raghu");

        System.out.println("\nUpdated Student Names:");
        student.printNames();
    }
}
