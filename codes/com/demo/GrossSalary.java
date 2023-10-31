package com.demo;
import java.util.Scanner;
public class GrossSalary {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the salary of the employee: ");
        double salary = scanner.nextDouble();

       
        double hra;
        double da;
        if (salary  >1 && salary <= 4000 ) {
            hra = salary * 0.1;
            da = salary * 0.5;
        } else if ( salary  >4000 && salary <= 8000) {
            hra = salary * 0.2;
            da = salary * 0.6;
        } else if (salary  >8000 && salary <= 12000) {
            hra = salary * 0.25;
            da = salary * 0.7;
        } else {
            hra = salary * 0.3;
            da = salary * 0.8;
        }

     
        double grossSalary = salary + hra + da;
        
        System.out.println("The gross salary of the employee is: " + grossSalary);

        
    }

}
