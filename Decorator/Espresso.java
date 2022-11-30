package Decorator;

// This declares the class 'Espresso' and uses the key word/statement 'implemments' to 
// implement the interface 'Coffee', in this case meaning that this subclass must implement 
// the same methods that are present in the super class.
public class Espresso implements Coffee {

    // This '@Override' annotation instructs Java to overide the method in the super
    // class with this method in its place.
    @Override
    // This declares the method 'getDescription' and the string variable data type.
    public String getDescription() {
        // This is the definition of the method, assigning the value 'Espresso Rich
        // RoastBeans' to
        // the string variable which will be returned.
        return "Espresso Rich Roast Beans";
    }

    public double ePrice = 2.50;

    // This '@Override' annotation instructs Java to overide the method in the super
    // class with this method in its place.
    @Override
    // This declares the method 'getCost' and the double variable data type.
    public double getCost() {
        // This is the definition of the method assigning the value '2.50' to the double
        // variable which will be returned.
        return 2.50;
    }
}