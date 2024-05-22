
/*
- When a child class defines a static method with the same signature as a static method in the parent class, then the child’s method hides the one in the parent class. 

- If a subclass defines a static method with the same signature as a static method in the superclass, then the method in the subclass hides the one in the superclass. 
- This mechanism happens because the static method is resolved at the compile time. Static method bind during the compile time using the type of reference not a type of object.


*/


class A
{
    public static void v1()
    {
        System.out.println("Static Method of v1 of Class A");
    }
}


class B extends A
{
    
    public static void v1()
    {
        System.out.println("Static Method of v1 of Class B");
    }

}




public class Method_Hiding1 {
    
    public static void main(String[] args) {
        
        A a = new A();
        a.v1();

        // ab is reference variable of class A that points to object of class B
        // A ab = new B();
        A ab = new B();
        
        ab.v1();


    }
}
