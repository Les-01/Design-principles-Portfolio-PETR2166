package Decorator;

// This declares the class 'Sweetener' and uses the key word/statement 'extends' to 
// extend the class 'CoffeeDecorator', meaning that this is a subclass that inherits
// all of the properties and methods from the super class 'CoffeeDecorator'.
public class Sweetener extends CoffeeDecorator {

    // This is the constructor that will create the object 'newCoffee'.
    public Sweetener(Coffee newCoffee) {
        // This uses the 'super' keyword/statement to initialise the constructor by
        // calling the super class CoffeeDecorator.
        super(newCoffee);
        // This outputs the text 'Added Sweetener'
        System.out.println("Added Sweetener   £" + price);
    }

    private double price = 0.25;

    // This declares the method 'getDescription' and the string variable data type.
    public String getDescription() {
        // This is the definition of the method, it calls the 'getDescription' method
        // from the object 'coffeeCup' and adds the string value '", Sweetener"'
        // to the accumulating value, then returns the value.
        return coffeeCup.getDescription() + ", Sweetener";
    }

    // This declares the method 'getCost' and the double variable data type.
    public double getCost() {
        // This is the definition of the method, it calls the 'getCost' method
        // from the object 'coffeeCup' and adds the double value '0.25' to the
        // accumulating value, then returns the value.
        return coffeeCup.getCost() + price;
    }
}