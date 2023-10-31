package codes;

public class Menu {
    private String name;
    private double calories;
    private int cookingTime;
    private double pricePerPerson;
    private double numberOfWineBottles;

    // Constructor
    public Menu(String name, double calories, int cookingTime, double pricePerPerson, double numberOfWineBottles) {
        this.name = name;
        this.calories = calories;
        this.cookingTime = cookingTime;
        this.pricePerPerson = pricePerPerson;
        this.numberOfWineBottles = numberOfWineBottles;
    }

    // Getter and Setter methods for each attribute
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public void setCookingTime(int cookingTime) {
        this.cookingTime = cookingTime;
    }

    public double getPricePerPerson() {
        return pricePerPerson;
    }

    public void setPricePerPerson(double pricePerPerson) {
        this.pricePerPerson = pricePerPerson;
    }

    public double getNumberOfWineBottles() {
        return numberOfWineBottles;
    }

    public void setNumberOfWineBottles(double numberOfWineBottles) {
        this.numberOfWineBottles = numberOfWineBottles;
    }

    // Add the method for Exercise b here
    public void printMenuDetails() {
        System.out.println("Menu " + name + " contains " + calories + " calories, comes with " +
                numberOfWineBottles + " bottles and costs " + pricePerPerson);
    }

}

