
/*
4. Builder Design Pattern
	- The Builder Design Pattern is a creational pattern used in software design to construct a complex object step by step. 
	- It allows the construction of a product in a step-by-step fashion, where the construction process can vary based on the type of product being built. 
	- The pattern separates the construction of a complex object from its representation, allowing the same construction process to create different representations.	

	- while creating object when object contain may attributes there are many problm exists :
	1. We have to pass many argument to create object.
	2. some parameters might be optional.
	3. factory class taked all responsibility for creating object. If the object is heavy then all then all complexity is the part of factory class.

So, in builder pattern be create object step by step and finally return final object with desired values of attributes.

	- When to use Builder Design Pattern?
	    The Builder design pattern is used when you need to create complex objects with a large number of optional components or configuration parameters. This pattern is particularly useful when an object needs to be constructed step by step, some of the scenarios where the Builder design pattern is beneficial are:
	1. Complex Object Construction
	2. Avoiding constructors with multiple parameters.
	3. Immutable Objects
	4. Common Interface for Multiple Representations
	
	- When not to use Builder Design Pattern?
	1. Simple Object Construction
	2. Performance Concerns.
	3. Immutable Objects with Final Fields.
	4. Tight Coupling with Product	

*/

class Bike {
    private final String name;
    private final int price;

    private Bike(BikeBuilder bikeBuilder) {
        this.name = bikeBuilder.name;
        this.price = bikeBuilder.price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return this.name + "  " + this.price;
    }

    // Inner Static

    static class BikeBuilder {
        private String name;
        private int price;


        public BikeBuilder()
        {

        }

        // static Method
        public static BikeBuilder getBikeBuilder()
        {
            return new BikeBuilder();
        }

        public String getName() {
            return name;
        }

        public int getPrice() {
            return price;
        }

        // Method chaining
        public BikeBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public BikeBuilder setPrice(int price) {
            this.price = price;
            return this;
        }

        public Bike build()
        {
            Bike b = new Bike(this);
            return b;
        }


    }

}

public class Builder {

    public static void main(String[] args) {


        Bike b1 = new Bike
        .BikeBuilder()
        .setName("Ducati")
        .setPrice(350000)
        .build();
        System.out.println(b1);
        

        Bike b2 = new Bike
        .BikeBuilder()
        .getBikeBuilder()
        .setName("Pulsar")
        .setPrice(0)
        .build();
        System.out.println(b2);
        


    }
}
