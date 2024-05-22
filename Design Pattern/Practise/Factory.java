
/*
1. Factory Pattern:
   - The Factory Pattern is a creational pattern that provides an interface for creating objects but delegates the responsibility of which class to instantiate to its subclasses.
   - It encapsulates the object creation logic in a separate method (or class) rather than creating objects directly using the `new` keyword.
   - It promotes loose coupling by allowing the client code to interact with the factory interface rather than the concrete classes directly.
   - The Factory Pattern is typically used when you have a single factory class producing different types of objects based on a given input.

   Here's a simple analogy to differentiate the two:
- Factory Pattern: Think of a pizza restaurant where you have a single chef (factory) responsible for making different types of pizzas based on the customer's order.
- Abstract Factory Pattern: Now, consider a scenario where you have a pizza restaurant chain. Each branch of the chain has its own chef (factory) but follows a specific style of making pizzas (e.g., Italian, American). The Abstract Factory Pattern helps you manage these different styles of pizza-making across different branches of the chain.



   */

interface Propery {
    int Estate();

}

class Father implements Propery {
    @Override
    public int Estate() {
        System.out.println("Father Estate");
        return 50000;
    }
}

class GrandSon implements Propery {
    @Override
    public int Estate() {
        System.out.println("Grandson Estate");
        return 1000;
    }
}

class ProperyFactory {
    public static Propery getPropery(String ownerType) {
        if (ownerType.trim().equalsIgnoreCase("Father")) {
            return new Father();
        } else if (ownerType.trim().equalsIgnoreCase("Grandson")) {
            return new GrandSon();
        } else {
            return null;
        }
    }

}

public class Factory {

    public static void main(String[] args) {

        Propery father = ProperyFactory.getPropery("Father");
        int amount1 = father.Estate();
        System.out.println("Propery of  Father is :" + amount1);

        Propery Grandson = ProperyFactory.getPropery("Grandson");
        int amount2 = Grandson.Estate();
        System.out.println("Propery of  Grandson is :" + amount2);

    }
}
