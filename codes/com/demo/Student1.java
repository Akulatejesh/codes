package com.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Student1 {
    private ArrayList<String> names = new ArrayList<>();
    private HashMap<String, String> empNames = new HashMap<>();

    public void setNames(ArrayList<String> studentNames) {
        names = studentNames;
    }

    public void setNames(HashMap<String, String> studentNames) {
        empNames = studentNames;
    }

    public void searchName(String name) {
        if (names.contains(name)) {
            System.out.println("Student found: " + name);
        } else {
            System.out.println("Student not found: " + name);
        }
    }

    public void searchName(int index) {
        if (index >= 0 && index < names.size()) {
            System.out.println("Student name at index " + index + ": " + names.get(index));
        } else {
            System.out.println("Invalid index");
        }
    }

    public void printNames() {
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void printNamesKeySet() {
        Set<String> keys = empNames.keySet();
        for (String key : keys) {
            System.out.println(empNames.get(key));
        }
    }

    public void printSize() {
        System.out.println("Size of HashMap: " + empNames.size());
    }

    public void remove(String key) {
        empNames.remove(key);
    }

    public void getName(String key) {
        String name = empNames.get(key);
        if (name != null) {
            System.out.println("Name for Roll No " + key + ": " + name);
        } else {
            System.out.println("Student not found for Roll No " + key);
        }
    }
}
