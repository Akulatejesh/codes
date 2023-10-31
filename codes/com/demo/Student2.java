package com.demo;
import java.util.ArrayList;
import java.util.Collections;

class Student2 implements Comparable<Student2> {
    private int rollNo;
    private String name;

    public Student2(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Roll No: " + rollNo + ", Name: " + name;
    }

    @Override
    public int compareTo(Student2 other) {
        return this.name.compareTo(other.name);
    }
}


