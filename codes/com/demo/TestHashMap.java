package com.demo;

import java.util.HashMap;

public class TestHashMap {
    public static void main(String[] args) {
        Student1 student = new Student1(); // Use Student1 class
        HashMap<String, String> studentNames = new HashMap<>();
        
        // Add student names to the studentNames HashMap
        studentNames.put("101", "Teju");
        studentNames.put("102", "Mahe");
        studentNames.put("103", "santhosh");
        studentNames.put("104", "shabarish");
        
        // Set the student names in the Student1 class
        student.setNames(studentNames);

        System.out.println("All Student Names:");
        student.printNamesKeySet(); // Print the names from the HashMap

        // Get the name for a specific roll number
        student.getName("101");

        // Print all student names using keySet
        student.printNamesKeySet(); // Print the names from the HashMap

        // Print the size of the HashMap
        student.printSize();

        // Remove a student by roll number
        student.remove("102");

        // Print the updated student names
        System.out.println("\nUpdated Student Names:");
        student.printNamesKeySet(); // Print the names from the HashMap
    }
}
