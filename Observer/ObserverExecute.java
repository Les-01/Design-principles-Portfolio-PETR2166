package Observer;

// This declares the class 'ObserverExecute' it will contain the main method for executing the program.
public class ObserverExecute {

    // This is the entry point of the program and the main method itself.
    // Potentially every other aspect of the program may need to access it meaning
    // the access modifier must be public.
    // The static method enables the calling of the main method without the need to
    // create an object first, while void means the method has no return value.
    public static void main(String[] args) {

        // This will construct a new object 'observerManager' from the class
        // 'ObserverManager'. Here the value of 'ObserverManager' is assigned to the
        // object 'observerManager'. This stores the reference to the 'ObserverManager'
        // class/object within 'ObserverExecute' itself enabling the calling of all the
        // methods.
        ObserverManager observerManager = new ObserverManager();

        // This will construct a new object 'observer1' from the class 'GpuObserver',
        // which will have the parameters of the object 'observerManager' from the class
        // 'GpuObserver' applied to it.
        GpuObserver observer1 = new GpuObserver(observerManager);

        // This will construct a new object 'observer2' from the class 'GpuObserver',
        // which will have the parameters of the object 'observerManager' from the class
        // 'GpuObserver' applied to it.
        GpuObserver observer2 = new GpuObserver(observerManager);

        // This will construct a new object 'observer3' from the class 'GpuObserver',
        // which will have the parameters of the object 'observerManager' from the class
        // 'GpuObserver' applied to it.
        GpuObserver observer3 = new GpuObserver(observerManager);

        // This calls the 'observerManager' object enabling the calling of the
        // 'setNVIDIAGEFORCERTX3090Price' method.
        observerManager.setNVIDIAGEFORCERTX3090Price(1149.75);
        // This calls the 'observerManager' object enabling the calling of the
        // 'setNVIDIAGEFORCERTX4080Price' method.
        observerManager.setNVIDIAGEFORCERTX4080Price(1269.75);
        // This calls the 'observerManager' object enabling the calling of the
        // 'setNVIDIAGEFORCERTX4090Price' method.
        observerManager.setNVIDIAGEFORCERTX4090Price(1699.25);

        observerManager.unregister(observer2);
        // This calls the 'observerManager' object enabling the calling of the
        // 'unregister' method. Placing the object name 'observer3' within the
        // parentheses sets the parameter to identify and remove that specific entry

        // The set price methods are run again to show that observer 2 and observer 3
        // have been removed from the array list and are no longer receiving updates.

        // This calls the 'observerManager' object enabling the calling of the
        // 'setNVIDIAGEFORCERTX3090Price' method.
        observerManager.setNVIDIAGEFORCERTX3090Price(197.00);
        // This calls the 'observerManager' object enabling the calling of the
        // 'setNVIDIAGEFORCERTX4080Price' method.
        observerManager.setNVIDIAGEFORCERTX4080Price(657.60);
        // This calls the 'observerManager' object enabling the calling of the
        // 'setNVIDIAGEFORCERTX4090Price' method.
        observerManager.setNVIDIAGEFORCERTX4090Price(690.50);

    }
}