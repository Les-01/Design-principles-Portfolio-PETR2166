package Decorator;

// This declares the Abstract class 'CoffeeDecorator'. Abstract classes cannot be instantiated 
// but can be extended by another class creating a subclass. Here the 'CoffeeDecorator' class 
// uses the key word/statement 'implemments' to implement the interface 'Coffee'. In this case 
// meaning that this subclass must implement the same methods that are present in the super class.
// This is an aggregation relationship or a "Has-A" relationship.
abstract class CoffeeDecorator implements Coffee {

    // This sets the access modifier to protected then creates a new object
    // 'coffeeCup' from the class 'Coffee'. The Protected access level means access
    // to the created object is only enabled for the class, the package and the
    // subclasses.
    protected Coffee coffeeCup;

    // This is the constructor that will create the object 'newCoffee'.
    public CoffeeDecorator(Coffee newCoffee) {
        // This declares that the object 'coffeeCup' is equal to the object 'newCoffee'.
        coffeeCup = newCoffee;
    }

    // This declares the method 'getDescription' and the string variable data type.
    public String getDescription() {
        // This is the definition of the method, it calls the 'getDescription' method
        // from the object 'coffeeCup' and returns the value.
        return coffeeCup.getDescription();
    }

    // This declares the method 'getCost' and the double variable data type.
    public double getCost() {
        // This is the definition of the method, it calls the 'getCost' method from the
        // object 'coffeeCup' and returns the value.
        return coffeeCup.getCost();

    }
}