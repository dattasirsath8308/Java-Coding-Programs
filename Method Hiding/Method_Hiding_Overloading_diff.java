
/* 
Difference Between Method Overriding and Method Hiding in Java
- In method overriding both the method parent class and child class are non-static.
- In method Hiding both the method parent class and child class are static.
- In method Overriding method resolution is done on the basis of the Object type.
- In method Hiding method resolution is done on the basis of reference type.
- The version of the overridden instance method that gets invoked is the one in the subclass.
- The version of the hidden static method that gets invoked depends on whether it is invoked from the superclass or the subclass. 
- In method overriding, we have the ability to use the “super” keyword to explicitly access superclass methods (super keyword is non-static reference variable we cant use it in static method as we know static methods can only access static members of the class ). Therefore, method overriding does not involve method hiding since the “super” keyword allows us to access and invoke superclass methods when needed.

*/



// Java program to demonstrate
// Difference between method overriding and Method hiding

// Base Class
class Complex {
	public static void f1()
	{
		System.out.println(
			"f1 method of the Complex class is executed.");
	}

	public void f2()
	{
		System.out.println(
			"f2 method of the Complex class is executed.");
	}
}

// class child extend Demo class
class Sample extends Complex {
	public static void f1()
	{
		System.out.println(
			"f1 of the Sample class is executed.");
	}
	public void f2()
	{
		System.out.println(
			"f2 method of the Sample class is executed.");
	}
}
public class Method_Hiding_Overloading_diff {

	public static void main(String args[])
	{
		Complex d1 = new Complex();
		
		// d2 is the reference variable of class Demo that
		// points to object of class Sample
		Complex d2 = new Sample();
		
		// But here method will be called using type of
		// reference
		d1.f1();
		d2.f1();

		// ***** Function overriding in java *****//
		// method refer to the object in the method
		// overriding.
		d1.f2();
		d2.f2();
	}
}
