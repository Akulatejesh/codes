package prop;

import java.util.Scanner;
import java.util.Date;

class Customer1 {
    private int custNo;
    private String custName;
    private String custAddr;
    private static int billNo = 1;

    public Customer1(String name, String address) {
        custNo = billNo++;
        custName = name;
        custAddr = address;
    }

    public static void printBillNo() {
        System.out.println("Bill No: " + (billNo - 1));
    }

    public void display() {
        System.out.println("Customer: " + custName);
        System.out.println("Address: " + custAddr);
    }
}

class CustomerReport {
    private Customer1[] custList;
    private int size;
    private static final int MAX_CUSTOMERS = 5;

    public CustomerReport() {
        custList = new Customer1[MAX_CUSTOMERS];
        size = 0;
    }

    public void addCustomer(Customer1 customer) {
        if (size < MAX_CUSTOMERS) {
            custList[size++] = customer;
        } else {
            System.out.println("Customer list is full.");
        }
    }

    public void printList() {
        Customer1.printBillNo();
        for (int i = 0; i < size; i++) {
            System.out.println();
            custList[i].display();
        }
    }
}
abstract class Pizza {
    protected String type;
    protected String[] toppings;
    protected String name;
    protected float timeForPreparation;
    protected int costOfPizza;
    protected String size;

    
    public Pizza(String type, String[] toppings, String name, float timeForPreparation, String size) {
        // Validation
        if (!type.equalsIgnoreCase("veg") && !type.equalsIgnoreCase("non-veg")) {
            System.out.println("Only Veg and Non-Veg type is allowed.");
            return;
        }

        if (!size.equalsIgnoreCase("small") && !size.equalsIgnoreCase("medium")) {
            System.out.println("Only small and medium size pizzas are available.");
            return;
        }

        this.type = type;
        this.toppings = toppings;
        this.name = name;
        this.timeForPreparation = timeForPreparation;
        this.size = size;
        this.costOfPizza = calculateCost();
    }

    //  calculating the total cost of the pizza
    public abstract int calculateCost();

    @Override
    public String toString() {
        StringBuilder toppingsStr = new StringBuilder();
        for (String topping : toppings) {
            toppingsStr.append(topping).append(", ");
        }
        String toppingsString = toppingsStr.toString().isEmpty() ? "No toppings" : toppingsStr.toString();

        return "Type: " + type + "\n" +
                "Toppings: " + toppingsString + "\n" +
                "Name: " + name + "\n" +
                "Time for Preparation: " + timeForPreparation + " minutes" + "\n" +
                "Size: " + size + "\n" +
                "Cost of Pizza: $" + costOfPizza;
    }
}

class ItalianPizza extends Pizza {
    public ItalianPizza(String type, String[] toppings, String name, float timeForPreparation, String size) {
        super(type, toppings, name, timeForPreparation, size);
    }

    
    @Override
    public int calculateCost() {
        if (type.equalsIgnoreCase("veg")) {
            if (size.equalsIgnoreCase("small")) {
                return 200;
            } else if (size.equalsIgnoreCase("medium")) {
                return 350;
            }
        } else if (type.equalsIgnoreCase("non-veg")) {
            if (size.equalsIgnoreCase("small")) {
                return 270;
            } else if (size.equalsIgnoreCase("medium")) {
                return 420;
            }
        }
        return 0;  
    }
}


interface Deliverable {
    int deliveryAreaLimit = 5;

    boolean delivery();
}


class Order implements Deliverable {
    private int orderNo;
    private Date orderDate;
    private int cost;
    private String custName;
    private String custAddress;
    private int approxDistance;

   
    public Order(int orderNo, Date orderDate, String custName, String custAddress, int approxDistance, int cost) {
        this.orderNo = orderNo;
        this.orderDate = orderDate;
        this.custName = custName;
        this.custAddress = custAddress;
        this.approxDistance = approxDistance;
        this.cost = cost;
    }

 
    @Override
    public boolean delivery() {
        if (approxDistance <= deliveryAreaLimit) {
            System.out.println("Home Delivery available for this distance.");
            return true;
        } else {
            System.out.println("Home Delivery not available for this distance.");
            return false;
        }
    }
}

