package com.demo;

import java.util.Date;

public class Reception {
    public static void main(String[] args) {
        // Accept input from the user to create a Bill
        int billNo = 1; // You can accept this from the user
        String custName = "Akula Tejesh"; // You can accept this from the user
        Date date = new Date(); // You can use SimpleDateFormat to parse a user-entered date

        Bill bill = new Bill(billNo, custName, date);

        // Simulate pizza ordering for the customer
        Pizza pizza1 = new Pizza("Margherita", 10);
        Pizza pizza2 = new Pizza("Corn", 12);

        bill.addPizza(pizza1);
        bill.addPizza(pizza2);

        // Display the bill information
        System.out.println("Bill Number: " + bill.getBillNo());
        System.out.println("Customer Name: " + bill.getCustName());
        System.out.println("Date: " + bill.getDate());
        System.out.println("Total Amount: $" + bill.getTotal());

        System.out.println("Pizzas Ordered:");
        for (Pizza pizza : bill.getPizzas()) {
            System.out.println(pizza.getName() + " - $" + pizza.getPrice());
        }
    }
}
