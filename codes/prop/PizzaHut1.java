package prop;

import java.util.Scanner;

public class PizzaHut1 {
    public static void main(String[] args) {
        Customer1 customer1 = new Customer1("Tejesh", "chennai,india");
        Customer1 customer2 = new Customer1("Bhargav", "Banglore,india");

        CustomerReport customerReport = new CustomerReport();
        customerReport.addCustomer(customer1);
        customerReport.addCustomer(customer2);

        customerReport.printList();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose pizza type (Italian or Mexican) or enter 'exit' to quit:");
            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.print("Enter pizza name: ");
            String name = scanner.nextLine();
            System.out.print("Enter time for preparation (in minutes): ");
            float prepTime = scanner.nextFloat();
            scanner.nextLine(); // Consume the newline

            String[] toppings = new String[1]; // Assume one topping for simplicity
            System.out.print("Enter pizza topping: ");
            toppings[0] = scanner.nextLine();

            Pizza pizza=null;;

            if (choice.equalsIgnoreCase("Italian")) {
                pizza = new ItalianPizza("veg", toppings, name, prepTime);
            } else if (choice.equalsIgnoreCase("Mexican")) {
                pizza = new MexicanPizza("non-veg", toppings, name, prepTime);
            } else {
                System.out.println("Invalid choice. Please choose either Italian or Mexican.");
                continue;
            }

            System.out.println(pizza);
        }
    }
}
