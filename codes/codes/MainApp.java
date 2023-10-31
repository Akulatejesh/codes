package codes;

public class MainApp {
    public static void main(String[] args) {
        // Create 5 Menu objects  in Exercise c
        Menu menu1 = new Menu("Stamppot boerenkool", 564.65, 45, 20.5, 0.5);
        Menu menu2 = new Menu("Metworst", 345, 12, 10.99, 0);
        Menu menu3 = new Menu("Hutspot", 560.4, 65, 30.9, 1);
        Menu menu4 = new Menu("Biefstuk", 780, 46, 50.34, 2);
        Menu menu5 = new Menu("Kibbeling", 450.4, 23, 20.78, 1);

        // Create an array and store the Menu objects
        Menu[] menus = {menu1, menu2, menu3, menu4, menu5};

        // Exercise d: Use a loop to print the details of all the objects
        for (Menu menu : menus) {
            menu.printMenuDetails();
        }

        // Exercise e: Use a loop to print the name and cooking time of dishes that take less than 30 minutes
        for (Menu menu : menus) {
            if (menu.getCookingTime() < 30) {
                System.out.println(menu.getName() + " cooks in " + menu.getCookingTime());
            }
        }

        // Exercise f: Calculate and print the total price of all objects
        double totalPrice = 0.0;
        for (Menu menu : menus) {
            totalPrice += menu.getPricePerPerson();
        }
        System.out.println("The total price is: " + totalPrice);

        // Calculate and print the discounted price if the total price is more than 65
        if (totalPrice > 65) {
            double discountedPrice = totalPrice * 0.9; // Apply a 10% discount
            System.out.println("The total price is: " + totalPrice);
            System.out.println("The discounted price is: " + discountedPrice);
        }
    }
}


