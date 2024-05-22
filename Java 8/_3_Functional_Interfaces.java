import java.util.function.IntBinaryOperator;

/*
- Java Functional Interfaces

1. The interface which have only single abstract method is called functional interface. (predefine or own user Define ).
(SAM Interfaces : Single Abstract Method interfaces )
2. To use lambda expression in Java, you need to either create your own functional interface or use the pre defined functional interface provided by Java. 
3.We have to use  @FunctionalInterface annotation,on the above Interface. this annotation is introduced in Java 8.
4. rules of defining a functional interface : The functional interface should have Only one abstract method. Along with the one abstract method, they can have any number of default and static methods.
    


Functional interface example: using anonymous inner class vs using lambda expression

- We have been using functional interfaces even prior to java8, they were used by creating anonymous inner classes using these interfaces. 
- You must have seen functional interfaces such as Runnable, ActionListener, Comparator etc. They all have single abstract method. 
- Lets see an example of ActionListener to see how it was used with Anonymous inner class and how it can be implemented using lambda expression.



*/

// 1: Creating your own functional interface
interface MyInterface {
    public int Addtion(int a, int b);
}

public class _3_Functional_Interfaces {

    public static void main(String[] args) {

        System.out.println("Own Functional Interface");
        MyInterface mobj = (a, b) -> a + b;
        System.out.println("Sum is :" +mobj.Addtion(10, 20));

        System.out.println("\n----------------------------------\n");

        System.out.println("pre-define Functional Interface");
        // 2: Using predefined functional interface
        IntBinaryOperator sum = (a, b) -> a + b;
        System.out.println("Sum is :" + sum.applyAsInt(50, 50));



        MyInterface m = (a, b) -> a * b ;
        System.out.println("Multiplication is : "+m.Addtion(5, 5));

    }
}
