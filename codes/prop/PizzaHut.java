package prop;

public class PizzaHut {
    public static void main(String[] args) {
        Customer customer = new Customer();

        // Initialize using setters
        customer.setCustNo(1);
        customer.setCustName("Teju");
        customer.setCustAddr("Chennai,India");

        // Display using getters
        System.out.println("Customer Number: " + customer.getCustNo());
        System.out.println("Customer Name: " + customer.getCustName());
        System.out.println("Customer Address: " + customer.getCustAddr());

        // Using init method
        Customer anotherCustomer = new Customer();
        anotherCustomer.init();
        anotherCustomer.display();
    }
}
