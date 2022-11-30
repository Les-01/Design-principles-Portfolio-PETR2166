package Decorator;

// This declares the class 'CoffeeMaker'.
public class CoffeeMaker {

        // This is the entry point of the program and the main method itself.
        // Potentially every other aspect of the program may need to access it meaning
        // the access modifier must be public.
        // The static method enables the calling of the main method without the need to
        // create an object first, while void means the method has no return value.
        public static void main(String[] args) {

                // Here the Decorator Design Pattern creates an entire Coffee by creating a new
                // object 'latte' from the class 'Coffee' and setting it as equal to
                // the following chain of events.
                // First the Espresso object is sent to the SteamedMilk constructor, then to
                // the CaramelSyrup constructor, and finally to the HazelnutSyrup constructor
                // effectively creating a Coffee with Steamed Milk, Caramel Syrup and Hazelnut
                // Syrup.
                // Realistically however creating the object 'latte' which is wrapped in
                // the decorator classes 'SteamedMilk', 'CaramelSyrup' and 'HazelnutSyrup'.
                Coffee latte = new HazelnutSyrup(
                                new ChocolateMilk(new Sweetener(new CaramelSyrup(new SteamedMilk(new Espresso())))));

                // This outputs the text 'Ingredients: ' then calls the 'getDescription' method
                // from the object 'latte' and returns and outputs the accumulated value.
                System.out.println("Ingredients: " + latte.getDescription());

                // This outputs the text 'Price: £' then calls the 'getCost' method
                // from the object 'latte' and returns and outputs the accumulated value.
                System.out.println("Price: £" + latte.getCost());

                ///////////// THE CODE BELOW IS USED IN THE BOUNDARY TEST PROCESS //////////////

                // The boundary test contains every decorator class available maxing out the
                // range of potential decorator wrapping to test for errors

                Coffee boundaryTestCoffee = new HazelnutSyrup(new VanillaSyrup(
                                new GingerbreadSyrup(new BrownSugar(new WhiteSugar(new AlmondMilk(new ChocolateMilk(
                                                new Sweetener(new CaramelSyrup(new SteamedMilk(new Espresso()))))))))));

                System.out.println("Boundary Test Result");
                System.out.println("Ingredients: " + boundaryTestCoffee.getDescription());
                System.out.println("Price: £" + boundaryTestCoffee.getCost());

        }
}