import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
 forEach method to iterate over collections and Streams in Java. In this guide, we will learn how to use forEach() and forEachOrdered() methods to loop a particular collection and stream.

*/


public class _6_foreach {
    public static void main(String[] args) {
        

        Map_forEach();

        List_forEach();

        stream_forEach();


        forEachOrdered() ;


    }
    

    public static void Map_forEach()
    {
        Map<Integer, String> hmap = new HashMap<Integer, String>();
        hmap.put(1, "Monkey");
        hmap.put(2, "Dog"); 
        hmap.put(3, "Cat");  
        hmap.put(4, "Lion");   
        hmap.put(5, "Tiger");   
        hmap.put(6, "Bear");

        //  forEach to iterate and display each key and value pair of HashMap.    
        hmap.forEach((key,value)->System.out.println(key+" - "+value));
        
        // forEach to iterate a Map and display the value of a particular  key     
        hmap.forEach((key,value) ->
        {
            if(key == 3)
                {
                    System.out.println("Value of Key 3 is : "+value);
                }
        }
        );
          
        // forEach to iterate a Map and display the key associated with a particular value 
        hmap.forEach((key,value) -> {

            if("Bear".equals(value))
            {
                System.out.println("Key of Bear is :"+key);
            }
        });
    }

    public static void   List_forEach()
    {   
        List<String> fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Pear"); 
        fruits.add("Mango");
        //lambda expression in forEach Method 
        fruits.forEach(str->System.out.println(str));
    }


    public static void  stream_forEach()
    {   
        List<String> fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Pear"); 
        fruits.add("Mango");

        System.out.println("list of  fruits : ");
        fruits.stream()
        .filter(str -> str.startsWith("M"))
        .forEach(System.out::println);
    }



    public static void forEachOrdered() {

        List<String> names = new ArrayList<String>();
        names.add("Maggie"); 
        names.add("Michonne");
        names.add("Rick");
        names.add("Merle");
        names.add("Governor"); 
        //forEach - the output would be in any order
        System.out.println("Print using forEach");
        names.stream() 
       .filter(f->f.startsWith("M"))
       .parallel() 
       .forEach(n->System.out.println(n)); 

    //    forEachOrdered - the output would always be in this order:  Maggie, Michonne, Merle
        
        System.out.println("Print using forEachOrdered"); 
        names.stream()  
        .filter(f->f.startsWith("M"))  
        .parallel() 
        .forEachOrdered(n->System.out.println(n));

    }





}
