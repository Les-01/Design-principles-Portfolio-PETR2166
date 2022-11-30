package Decorator;

// This declares the class 'CaramelSyrup' and uses the key word/statement 'extends' to 
// extend the class 'CoffeeDecorator', meaning that this is a subclass that inherits
// all of the properties and methods from the super class 'CoffeeDecorator'.
public class CaramelSyrup extends CoffeeDecorator {

    // This is the constructor that will create the object 'newCoffee'.
    public CaramelSyrup(Coffee newCoffee) {
        // This uses the 'super' keyword/statement to initialise the constructor by
        // calling the super class CoffeeDecorator.
        super(newCoffee);
        // This outputs the text 'Added Caramel Syrup'
        System.out.println("Added Caramel Syrup   £" + price);
    }

    private double price = 1.15;

    // This declares the method 'getDescription' and the string variable data type.
    public String getDescription() {
        // This is the definition of the method, it calls the 'getDescription' method
        // from the object 'coffeeCup' and adds the string value '", Caramel Syrup"' to
        // the accumulating value, then returns the value.
        return coffeeCup.getDescription() + ", Caramel Syrup";
    }

    // This declares the method 'getCost' and the double variable data type.
    public double getCost() {
        // This is the definition of the method, it calls the 'getCost' method
        // from the object 'coffeeCup' and adds the double value '1.00' to the
        // accumulating value, then returns the value.
        return coffeeCup.getCost() + price;
    }
}