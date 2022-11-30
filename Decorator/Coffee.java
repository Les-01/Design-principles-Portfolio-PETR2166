package Decorator;

// This declares the interface 'Coffee'. Interface classes cannot be instantiated but 
// can be implemented by other classes or extended by other interfaces.
public interface Coffee {

    // This declares the method 'getDescription' and the string variable data type
    // but does not define the method.
    public String getDescription();

    // This declares the method 'getCost' and the double variable data type but does
    // not define the method.
    public double getCost();
}