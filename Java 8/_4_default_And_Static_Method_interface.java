
/* 

Prior to java 8, interface in java can only have abstract methods. All the methods of interfaces are public & abstract by default. Java 8 allows the interfaces to have default and static methods. The reason we have default methods in interfaces is to allow the developers to add new methods to the interfaces without affecting the classes that implements these interfaces.


Why default method?
-  For example, if several classes such as A, B, C and D implements an interface XYZInterface then if we add a new method to the XYZInterface, we have to change the code in all the classes(A, B, C and D) that implements this interface.  if There 1000 classe then its not possible.
- This is why in java 8, we have a new concept “default methods”. 
- These methods can be added to any existing interface and we do not need to implement these methods in the implementation classes mandatorily, thus we can add these default methods to existing interfaces without breaking the code.

- default method  existing interfaces in such a way so that they are backward compatible. Backward compatibility is adding new features without breaking the old code.

- default method can override  adn default Method hava a body.


2. Static methods
- Static methods in interfaces are similar to the default methods except that we cannot override these methods in the classes that implements these interfaces.


*/




interface MyInterface
{

    // default method : This is a default method so we need not to implement this method in the implementation classes  
    default void defaultMethod()
    {
        System.out.println("Newly Added Default Method..");
    }


    // Abstract MEthod not a have body implementing class have to reposible to provide body to interface.
    //  Already existing public and abstract method We must need to implement this method in implementation classes.
    public void existingMethod(String str);


    // This is a static method. Static method in interface is similar to default method except that we cannot override them in the implementation classes. Similar to default methods, we need to implement these methods in implementation classes so we can safely add them to the existing interfaces.
     
    static void staticMethod(){
    	System.out.println("Newly added static method");
    }


}

public class _4_default_And_Static_Method_interface  implements MyInterface {
    

    // implementing abstract method (concrete method of interface )
    public void existingMethod(String str)
    {
        System.out.println("Name is : "+str);
    }


    public static void main(String[] args) {

    
        _4_default_And_Static_Method_interface obj = new _4_default_And_Static_Method_interface();
        
        System.out.println("Below is static we can call it using interece reference (Name) :");
        MyInterface.staticMethod();

        obj.defaultMethod();
        obj.existingMethod("Datta Bhau");

    }
}
