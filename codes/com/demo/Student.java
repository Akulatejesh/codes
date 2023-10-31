package com.demo;

import java.util.ArrayList;
import java.util.Iterator;

class Student {
    private ArrayList<String> names = new ArrayList<>();

    public void setNames(ArrayList<String> studentNames) {
        names = studentNames;
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

    public void removeName(String stuName) {
        names.remove(stuName);
    }
}


