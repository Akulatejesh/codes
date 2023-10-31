package com.demo;
import java.util.Scanner;

public class EmployeeSalaryCalculator {
	 public static void main(String[] args) {
	        
	        Employee[] employees = new Employee[5];

	        
	        Scanner scanner = new Scanner(System.in);
	        for (int i = 0; i < employees.length; i++) {
	            System.out.println("Enter employee details: ");
	            System.out.print("Name: ");
	            
	            
	            String name = scanner.nextLine();
	           
	          
	            System.out.print("Age: ");
	            
	            int age = scanner.nextInt();
	            scanner.nextLine();
	            
	            System.out.print("Basic salary: ");
	           
	            double basic = scanner.nextDouble();
	            scanner.nextLine();
	            
	            System.out.print("HRA: ");
	            
	            double hra = scanner.nextDouble();
	            scanner.nextLine();
	            
	            System.out.print("DA: ");
	            
	            double da = scanner.nextDouble();
	            scanner.nextLine();
	            
	            System.out.print("Special allowance: ");
	            
	            double specialAllowance = scanner.nextDouble();
	            scanner.nextLine();

	            //  employee object and initializes the user input
	            employees[i] = new Employee(age, name, basic, hra, da, specialAllowance);
	        }

	        // Calculate the salary of each employee
	        for (Employee employee : employees) {
	            if (employee.specialAllowance == 0) {
	                employee.calculateSalary(employee.basic, employee.hra, employee.da);
	            } else {
	                employee.calculateSalary();
	            }
	        }

	        // Display the employee details
	        for (Employee employee : employees) {
	            employee.display();
	        }

	        
	    }
}
