package com.demo;

import java.util.ArrayList;
import java.util.Collections;

public class StudentSortDemo {

	public static void main(String[] args) {
		ArrayList<Student2> students = new ArrayList<>();

        students.add(new Student2(101, "Tejesh"));
        students.add(new Student2(102, "Swathi"));
        students.add(new Student2(103, "Jyothi"));
        students.add(new Student2(104, "Ravi"));
        students.add(new Student2(105, "Prasad"));

        System.out.println("Unsorted Students:");
        for (Student2 student : students) {
            System.out.println(student);
        }

        Collections.sort(students);

        System.out.println("\nSorted Students:");
        for (Student2 student : students) {
            System.out.println(student);
        }
    }

	}


