// package Practise;

/*

2. Abstract Factory Pattern:
   - The Abstract Factory Pattern is also a creational pattern, but it provides an interface for creating families of related or dependent objects without specifying their concrete classes.
   - It's an extension of the Factory Pattern and works around the concept of families of objects rather than just individual objects.
   - It defines an abstract factory interface that declares methods for creating the various objects. Each concrete implementation of this interface represents a different factory that produces objects of a particular family.
   - Abstract Factory Pattern is used when you need to create families of related or dependent objects, ensuring that the created objects are compatible.
   - It often involves multiple Factory Patterns working together, with each factory responsible for creating a different kind of object within a family.

Here's a simple analogy to differentiate the two:
- Factory Pattern: Think of a pizza restaurant where you have a single chef (factory) responsible for making different types of pizzas based on the customer's order.
- Abstract Factory Pattern: Now, consider a scenario where you have a pizza restaurant chain. Each branch of the chain has its own chef (factory) but follows a specific style of making pizzas (e.g., Italian, American). The Abstract Factory Pattern helps you manage these different styles of pizza-making across different branches of the chain.


                Bike interface
        Mounting Bike       Sport Bike


                AbstractFactoryClass
            MountingFactory     SportFactory
        
        
        Bikefactory    ( static Method for Bike(abstractfactory)
*/


interface Bike
{
    String name();
    int price();
}

class SportBike implements Bike
{
    public String name()
    {
        return "Sport Bike";
    }

    public int price()
    {
        return 80000;
    }
}


class MoutantBike implements Bike
{
    public String name()
    {
        return "Mountant Bike";
    }

    public int price()
    {
        return 60000;
    }
}


abstract class AbstractFactoryBike
{
    public abstract Bike createBike();
}


class SportBikeFactory extends AbstractFactoryBike
{
    public Bike createBike()
    {
        return new SportBike();
    }
}



class MountantBikeFactory extends AbstractFactoryBike
{
    public Bike createBike()
    {
        return new MoutantBike();
    }
}


class Bikefactory
{
    public static Bike getBike(AbstractFactoryBike abstractFactoryBike)
    {
        return abstractFactoryBike.createBike();
    } 
}

public class AbstactFactory {
    public static void main(String[] args) {
        

        Bike b1 =  Bikefactory.getBike(new SportBikeFactory());
        System.out.println("Bike type :  "+b1.name() +" , Price is :"+b1.price() );
        System.out.println(b1.hashCode());

        Bike b2 =  Bikefactory.getBike(new MountantBikeFactory());
        System.out.println("Bike type :  "+b2.name() +" , Price is :"+b2.price() );
        System.out.println(b2.hashCode());
    

    }

    
}
