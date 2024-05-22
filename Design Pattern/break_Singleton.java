import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;

import javax.crypto.spec.DESKeySpec;
import javax.imageio.plugins.tiff.ExifGPSTagSet;

/*

- Singleton pattern will insure that only one instance of the class will be created by java virtual machine at any point of time. 
- It is used to provide global point of access to the object.Singleton patterns are used in logging, caches, thread pools,getting device driver objects etc.

// steps 

1. private constructors :  if it public then we can create multiple object (Constructor use to initialize of object)

2. Static Instance: - we create static instance varible for holds the instance of the class.
- Within the Singleton class, there is a static member variable that holds the single instance of the class.


3. public static method : this method allow to other classes to acccess the single instance of object. & according to condition object will create once & if we access to get object then we get same object everytime.

4. Lazy initialization :  in lazy initailizatio instance will be created when when we request for it or we can created  at class Loading (eager initialization). 
- Lazy initialization is more prefered to save the resource if the instance is not always needed.


up to above 4 step is good work its work not single thread & but if we want to use multiple then it will not work its will be create 2 object so in singleton we don't want to more than one object.

5. Make the Access method Synchronized :
In multi-threaded environment it may happen that two or more threads enter the method getInstance() at the same time when Singleton instance is not created, resulting into simultaneous creation of two objects.Such problems can be avoided by defining getInstance() method synchronized.

-  we can use method synchronized Or we can use synchronized Block for Perticular block



-----
3 Way to break Singleton Pattern 

1. Reflection API to break singleton pattern




*/

// Eager

class Eager
{
    private static Eager eobj = new Eager();

    public static Eager getEager()
    {
        return eobj;
    }
}



// Lazy 
class  Demo implements Serializable
{
    private static Demo d;  // intially default value static object is null ;

    private Demo()
    {
        if(d != null)
        {
            throw new RuntimeException("You are trying to break Singleton Exception ");
        }
    }

    public static Demo getDemo()
    {
        if(d == null)
        {
            synchronized(Demo.class)
            {
                if(d == null)
                {
                    d = new Demo();
                }
            }            
        }
        return d;
    }


    public Object readResolve()
    {
        return d;
    }


    // 2. Method Cloning
    
public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }


}

/*
public enum  Demo
{
    Obj ;
    
    public void test() {
        System.out.println("My name ");
    }
}

*/ 

public class break_Singleton  {

    public static void main(String[] args)  throws Exception{
    
        // //  Lazy
        
        // // Demo d1 = Demo.getDemo();
        // System.out.println(Demo.getDemo().hashCode());
        // Demo d2 = Demo.getDemo();
        // System.out.println(d2.hashCode());

        // // Eager
        // // System.out.println(Eager.getEager().hashCode());
        // // System.out.println(Eager.getEager().hashCode());



/*
- break Singleton Design pattern

1. Reflection API to break singleton pattern
Solution  : 1. if object is there ==> throw exception from inside constructor , 2. use enum

2. Deserialization 
Solution : implementing readResolve method

3. Override the Object clone method to prevent cloning
*/


    /*    
    //    1. Reflection API

        Demo demo1 = Demo.getDemo();
        System.out.println("Before Breaking Singleton Hashcode: "+demo1.hashCode());
        // Contructor clas from reflection api
        Constructor constructor = Demo.class.getDeclaredConstructor();
        constructor.setAccessible(true); //  in initally our constructor are private so we can't access it so we use setAccessible as true then we can access it.
        Demo demo2 = (Demo) constructor.newInstance();
        System.out.println("After Breaking Singleton Hashcode: "+demo2.hashCode());

    */

    //  2. Deserialization 

        Demo demo1 = Demo.getDemo();
        System.out.println("Before Serialization : "+ demo1.hashCode());

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.ob"));
        oos.writeObject(demo1);

        System.out.println("After Serialization : ");
        ObjectInputStream ooi = new ObjectInputStream(new FileInputStream("abc.ob"));
        Demo demo2 = (Demo)ooi.readObject(); 
        System.out.println(demo2.hashCode());




    }
}
