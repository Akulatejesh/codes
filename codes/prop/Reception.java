package prop;

import java.util.Scanner;
import java.util.Date;
public class Reception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Create an Italian Pizza:");
        System.out.print("Enter pizza type (Veg or Non-Veg): ");
        String type = scanner.nextLine();
        System.out.print("Enter pizza name: ");
        String name = scanner.nextLine();
        System.out.print("Enter time for preparation (in minutes): ");
        float prepTime = scanner.nextFloat();
        scanner.nextLine();
        System.out.print("Enter pizza size (Small or Medium): ");
        String size = scanner.nextLine();
        System.out.print("Enter pizza toppings (separated by commas): ");
        String toppingsString = scanner.nextLine();
        String[] toppings = toppingsString.split(", ");
        Pizza pizza = new ItalianPizza(type, toppings, name, prepTime, size);

        System.out.println("\nPizza Details:");
        System.out.println(pizza);

        System.out.println("\nCreate an order:");
        System.out.print("Enter order number: ");
        int orderNo = scanner.nextInt();
        scanner.nextLine(); // Consume the newline
        System.out.print("Enter order date: ");
        String orderDateString = scanner.nextLine();
        System.out.print("Enter customer name: ");
        String custName = scanner.nextLine();
        System.out.print("Enter customer address: ");
        String custAddress = scanner.nextLine();
        System.out.print("Enter approximate delivery distance (in km): ");
        int approxDistance = scanner.nextInt();

        // Calculate the order cost
        int orderCost = pizza.costOfPizza;

        Date orderDate = new Date();
        Order order = new Order(orderNo, orderDate, custName, custAddress, approxDistance, orderCost);

        System.out.println("\nOrder Details:");
        System.out.println("Order Number: " + orderNo);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Customer Name: " + custName);
        System.out.println("Customer Address: " + custAddress);
        System.out.println("Approximate Delivery Distance: " + approxDistance + " km");
        System.out.println("Order Cost: $" + orderCost);

        System.out.println("\nDelivery Status:");
        order.delivery();
    }
}
