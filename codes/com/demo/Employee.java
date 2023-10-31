package com.demo;

public class Employee {
	int age;
    String name;
    double salary;
    double basic;
    double hra;
    double da;
    double specialAllowance;

    public Employee(int age, String name, double basic, double hra, double da, double specialAllowance) {
        this.age = age;
        this.name = name;
        this.basic = basic;
        this.hra = hra;
        this.da = da;
        this.specialAllowance = specialAllowance;
    }

    public void calculateSalary() {
        salary = basic + hra + da + specialAllowance;
    }

    public void calculateSalary(double basic, double hra, double da) {
        salary = basic + hra + da;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Employee object is garbage collected");
    }
}
