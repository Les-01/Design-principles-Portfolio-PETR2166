package Observer;

//This imports the java utility array list package allowing for the implementation of resizable arrays.
import java.util.ArrayList;

// This declares the class 'ObserverManager' and uses the key word/statement 'implements' to 
// implement the interface 'Subject', in this case meaning that this subclass must implement 
// the same methods that are present in the super class.
public class ObserverManager implements Subject {

    // This sets the access modifier to private then declares an array list called
    // 'observers' created to store the registered 'Observer' of the subject. The
    // private access level means access to the created object is only enabled for
    // the class.
    private ArrayList<Observer> observers;

    // This declares the 3 variables that will trigger the method 'notifyObserver'
    // if their state changes.
    private double nvidiageforcertx3090Price;
    private double nvidiageforcertx4080Price;
    private double nvidiageforcertx4090Price;

    // This declares the class 'ObserverManager'.
    public ObserverManager() {

        // This is the constructor that will create the array list 'Observer'.
        observers = new ArrayList<Observer>();

    }

    // This '@Override' annotation instructs Java to overide the method in the super
    // class with this method in its place.
    @Override
    // This declares the method 'register' and the keyword 'void' meaning this
    // method has no return value. Here the method creates a new object
    // 'newObserver' from the class 'Observer'.
    public void register(Observer newObserver) {

        // This is the definition of the method, here the array list 'observers' is
        // called and the 'add' method is used to add the object 'newObserver' to it.
        observers.add(newObserver);

    }

    // This '@Override' annotation instructs Java to overide the method in the super
    // class with this method in its place.
    @Override
    // This declares the method 'unregister' and the keyword 'void' meaning this
    // method has no return value. Here the method creates a new object
    // 'deleteObserver' from the class 'Observer'.
    public void unregister(Observer deleteObserver) {

        // This declares the integer variable 'observerIndex' then assigns the index
        // value of the observer to be deleted to it.
        int observerIndex = observers.indexOf(deleteObserver);

        // This outputs the text 'Observer ' followed by the value of the variable
        // 'observerIndex' with one added to it, followed by the text ' deleted' and a
        // line break. The addition to the observer index is to correct the mismatch
        // with the variable 'observerIndex' assigning the first entry to the value of 0
        // whilst user interface result would be expexted to be 1.
        System.out.println("Observer " + (observerIndex + 1) + " Unregistered\n");

        // This is the definition of the method, here the array list 'observers' is
        // called and the 'remove' method is used to remove an observer from the list
        // using the value of the 'observerIndex' variable.
        observers.remove(observerIndex);

    }

    // This '@Override' annotation instructs Java to overide the method in the super
    // class with this method in its place.
    @Override
    // This declares the method 'notifyObserver' and the keyword 'void' meaning this
    // method has no return value.
    public void notifyObserver() {

        // This is is a 'for' loop, this creates a new object 'observer' from the class
        // 'Observer' which is then applied to each element in the array list
        // 'observers'.
        for (Observer observer : observers) {

            // This is the definition of the method, and the properties of the object
            // 'observer'. Here the 'update' method is applied to the object 'observer'
            // along with the declaration of the variables to update.
            observer.update(nvidiageforcertx3090Price, nvidiageforcertx4080Price, nvidiageforcertx4090Price);

        }
    }

    // This declares the method 'setNVIDIAGEFORCERTX3090Price' and the keyword
    // 'void' meaning this
    // method has no return value. Here the method creates the double variable
    // 'newNVIDIAGEFORCERTX3090Price'
    public void setNVIDIAGEFORCERTX3090Price(double newNVIDIAGEFORCERTX3090Price) {

        // This is the definition of the method, here the 'this' keyword/statement is
        // used to refer to the variable 'newNVIDIAGEFORCERTX3090Price' within the
        // method. This assigns
        // the value of 'newNVIDIAGEFORCERTX3090Price' to the variable
        // 'this.nvidiageforcertx3090Price'.
        this.nvidiageforcertx3090Price = newNVIDIAGEFORCERTX3090Price;
        // This calls the 'notifyObserver' method, notifying the observers of the price
        // change.
        notifyObserver();

    }

    // This declares the method 'setNVIDIAGEFORCERTX4080Price' and the keyword
    // 'void' meaning this
    // method has no return value. Here the method creates the double variable
    // 'newNVIDIAGEFORCERTX4080Price'
    public void setNVIDIAGEFORCERTX4080Price(double newNVIDIAGEFORCERTX4080Price) {

        // This is the definition of the method, here the 'this' keyword/statement is
        // used to refer to the variable 'newNVIDIAGEFORCERTX4080Price' within the
        // method. This assigns
        // the value of 'newNVIDIAGEFORCERTX4080Price' to the variable
        // 'this.nvidiageforcertx4080Price'.
        this.nvidiageforcertx4080Price = newNVIDIAGEFORCERTX4080Price;
        // This calls the 'notifyObserver' method, notifying the observers of the price
        // change.
        notifyObserver();

    }

    // This declares the method 'setNVIDIAGEFORCERTX4090Price' and the keyword
    // 'void' meaning this
    // method has no return value. Here the method creates the double variable
    // 'newNVIDIAGEFORCERTX4090Price'
    public void setNVIDIAGEFORCERTX4090Price(double newNVIDIAGEFORCERTX4090Price) {

        // This is the definition of the method, here the 'this' keyword/statement is
        // used to refer to the variable 'newNVIDIAGEFORCERTX4090Price' within the
        // method. This assigns
        // the value of 'newNVIDIAGEFORCERTX4090Price' to the variable
        // 'this.nvidiageforcertx4090Price'.
        this.nvidiageforcertx4090Price = newNVIDIAGEFORCERTX4090Price;
        // This calls the 'notifyObserver' method, notifying the observers of the price
        // change.
        notifyObserver();

    }

}
