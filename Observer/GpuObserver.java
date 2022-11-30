package Observer;

// This declares the class 'GpuObserver' and uses the key word/statement 'implements' to 
// implement the interface 'Observer', in this case meaning that this subclass must implement 
// the same methods that are present in the super class.
public class GpuObserver implements Observer {

    // This declares the 3 variables that will trigger the method 'notifyObserver'
    // if their state changes.
    private double nvidiageforcertx3090Price;
    private double nvidiageforcertx4080Price;
    private double Nnvidiageforcertx4090Price;

    // The static keyword/statement is used enabling the execution of this code
    // without the need to create an object first. This will assign a unique ID to
    // each observer allowing not only for individual identification but is also
    // essential for the index observer removal function.
    private static int observerIDTracker = 0;

    // This declares the integer variable 'observerID'.
    protected int observerID;

    // This creates a new object 'observerManager' from the class 'Subject'. This
    // enables references to the 'ObserverManager' class/object allowing for the
    // calling of methods.
    protected Subject observerManager;

    // This is the constructor for the 'observerManager' object and fundamentally
    // works
    // as the primary method for adding additional observers to the array list.
    public GpuObserver(Subject observerManager) {

        // Here the 'this' keyword/statement is used to refer to the object
        // 'observerManager'. Here the value of the object 'observerManager' is assigned
        // to the object 'this.observerManager'. This stores the reference to this
        // object within 'GpuObserver' itself.
        this.observerManager = observerManager;

        // Here the 'this' keyword/statement is used to refer to the variable
        // 'observerID'. Here the value of 'this.observerID' is set to the value of the
        // integer 'observerIDTracker', incremented by 1.
        this.observerID = ++observerIDTracker;

        // This outputs the text 'Observer' followed the value of the variable
        // 'this.observerID' followed by the text ' Added' followed by a line break.
        System.out.println("Observer " + this.observerID + " Added\n");

        // This is the 'observerManager' object created above that enables referencing
        // to the 'ObserverManager class' enabling the calling of its methods.
        // This is the definition of the method, here the 'observerManager' object is
        // called, enabling the calling of the 'register' method, and the 'this'
        // keyword/statement is used but within the parentheses meaning the method is to
        // be applied to the entire object.
        observerManager.register(this);
    }

    // This declares the method 'update' and the keyword 'void' meaning this
    // method has no return value, whilst also declaring 3 'double'
    // variables 'nvidiageforcertx3090Price', 'nvidiageforcertx4080Price' and
    // 'Nnvidiageforcertx4090Price'.
    public void update(double nvidiageforcertx3090Price, double nvidiageforcertx4080Price,
            double Nnvidiageforcertx4090Price) {

        // This is the definition of the method, here the 'this' keyword/statement is
        // used to refer to the variable 'nvidiageforcertx3090Price' within the method.
        // This assigns the value of 'nvidiageforcertx3090Price' to the variable
        // 'this.nvidiageforcertx3090Price'.
        this.nvidiageforcertx3090Price = nvidiageforcertx3090Price;

        // This is the definition of the method, here the 'this' keyword/statement is
        // used to refer to the variable 'nvidiageforcertx4080Price' within the method.
        // This assigns the value of 'nvidiageforcertx4080Price' to the variable
        // 'this.nvidiageforcertx4080Price'.
        this.nvidiageforcertx4080Price = nvidiageforcertx4080Price;

        // This is the definition of the method, here the 'this' keyword/statement is
        // used to refer to the variable 'Nnvidiageforcertx4090Price' within the method.
        // This assigns the value of 'Nnvidiageforcertx4090Price' to the variable
        // 'this.Nnvidiageforcertx4090Price'.
        this.Nnvidiageforcertx4090Price = Nnvidiageforcertx4090Price;

        // This is an instruction to execute the method 'printThePrices'.
        printThePrices();

    }

    // This declares the method 'printThePrices' and the keyword 'void' meaning this
    // method has no return value.
    public void printThePrices() {

        // This outputs the text 'Observer '
        // followed by the value of the variable 'observerID'
        // followed by the text ' Update'
        // followed by a line break,
        // followed by the text 'NVIDIAGEFORCERTX3090P :',
        // followed by the value of the variable 'nvidiageforcertx3090Price'
        // followed by a line break,
        // followed by the text 'NVIDIAGEFORCERTX4080 :',
        // followed by the value of the variable 'nvidiageforcertx4080Price'
        // followed by a line break,
        // followed by the text 'NVIDIAGEFORCERTX4090 :',
        // followed by the value of the variable 'Nnvidiageforcertx4090Price'
        // followed by a line break.
        System.out.println("Observer " + observerID + " Update" + "\nNVIDIAGEFORCERTX3090: £"
                + nvidiageforcertx3090Price + "\nNVIDIAGEFORCERTX4080: £" + nvidiageforcertx4080Price
                + "\nNVIDIAGEFORCERTX4090: £" + Nnvidiageforcertx4090Price + "\n");
    }
}
