package Observer;

// This declares the interface 'Subject'. Interface classes cannot be instantiated but 
// can be implemented by other classes or extended by other interfaces.
public interface Subject {

    // This declares the method 'register' and the keyword 'void' meaning this
    // method has no return value.
    public void register(Observer o);

    // This declares the method 'unregister' and the keyword 'void' meaning this
    // method has no return value.
    public void unregister(Observer o);

    // This declares the method 'notifyObserver' and the keyword 'void' meaning this
    // method has no return value.
    public void notifyObserver();

}