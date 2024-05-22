import java.util.Arrays;
import java.util.function.BiFunction;

import javax.swing.plaf.basic.BasicScrollPaneUI.ViewportChangeHandler;

/* 
Method reference
1. Method reference is a shorthand notation of a lambda expression to call a method. 
For example:
If your lambda expression is like this:

str -> System.out.println(str)    or Replace is :    System.out::println

2. The :: operator is used in method reference to separate the class or object from the method name.

Four types of method references
1. Method reference to an instance method of an object – object::instanceMethod
2. Method reference to a static method of a class – Class::staticMethod
3. Method reference to an instance method of an arbitrary object of a particular type – Class::instanceMethod
4. Method reference to a constructor – Class::new


Extra : 
BiFunction Interface methods – apply() and addThen()
It represents a function which takes in two arguments and produces a result. Hence this functional interface which takes in 3 parameters namely:-

T: denotes the type of the first argument to the function
U: denotes the type of the second argument to the function
R: denotes the return type of the function

*/



// 1. Method reference to an instance method of an object
@FunctionalInterface
interface MyInterface
{
    public void Display();
}

// 2. Method reference to a static method of a class
class MultiplicationClass
{
    public static int multiply(int a, int b)
    {
        return a*b;
    }
}

// 3. Method reference to an instance method of an arbitrary object of a particular type – Class::instanceMethod

@FunctionalInterface 
interface MyInterface2{  
    Hello display(String say);  
}  


// 4. Method reference to a constructor – Class::new
class Hello{  
    public Hello(String say){  
        System.out.print(say);  
    }  
}  

public class _2_Method_References
{

    // INstance 
    public void myMethod()
    {
        System.out.println("This is Instance Method.");
    }

    public static void main(String[] args) {
        
        _2_Method_References obj = new _2_Method_References();
        
        System.out.println("1. Method reference to an instance method of an object.");
        MyInterface mref = obj::myMethod;
        mref.Display();


        System.out.println("-------------------------------\n");

        System.out.println("BiFunction Interface \n");
         // BiFunction to add 2 numbers
         BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
 
         // Implement add using apply()
         System.out.println("Sum = " + add.apply(2, 3));
  
         // BiFunction to multiply 2 numbers
         BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b;
  
         // Implement add using apply()
         System.out.println("Product = " + multiply.apply(2, 3));

        System.out.println("\n-------------------------------\n");

        System.out.println("2. Method reference to a static method of a class .");

        BiFunction<Integer,Integer,Integer> bobj = MultiplicationClass::multiply;
        int result = bobj.apply(10, 10);
        System.out.println("Mutliplication of static Method class :"+result);

        System.out.println("\n-------------------------------\n");


        // 3. Method reference to an instance method of an arbitrary object of a particular type
        System.out.println("3. Method reference to an instance method of an arbitrary object of a particular type");

        String []str = {"Zendu","Jai","Bramhkalam","Gulab","Chameli","Kamal"};

        Arrays.sort(str, String::compareToIgnoreCase);

        System.out.println("UnSorted to Sorted : ");
        for (String string : str) {
            System.out.println(string);
        }


        System.out.println("\n-------------------------------\n");


        MyInterface2 obj2 = Hello::new;
        obj2.display("Kasa Ahes Mitraaa....");



    }    
}
