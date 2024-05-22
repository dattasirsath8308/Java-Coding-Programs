import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/* 
Stream API 
 
- All the classes and interfaces of this API is in the java.util.stream package. 
- By using streams we can perform various aggregate operations on the data returned from collections, arrays, Input/Output operations. 


How to work with Stream in Java
As we have seen in the below example, the working of stream can be explained in three stages:
1. Create a stream
2. Perform intermediate operations on the initial stream to transform it into another stream and so on on further intermediate operations. In the above example, the filter() operation is intermediate operation, there can be more than one intermediate operations.
3. Perform terminal operation on the final stream to get the result. In the above example, the count() operation is terminal operation.


Java Stream Features
1. Stream does not store the elements. it simply performs the aggregate operations(such as filter() and count() that we have seen in the below example) to get the desired stream of data.

2. The aggregate operations that we perform on the collection, array or any other data source do not change the data of the source, they simply return a new stream. For example the code we have seen above is filtering the strings with length less than 6 using the stream operations but it didn’t change the elements of the list.

3. All the stream operations are lazy in nature which means they are not executed until they are needed. For example, if we want to display only the first 2 elements of a list using stream, the stream operation would stop at the end of second iteration after displaying the second element of list.



*/


public class _5_Stream {
    public static void main(String[] args) {
        

        System.out.println("Without Stream : ");
        WithoutStream();


        System.out.println("\n----------------------\n");
        System.out.println("\nWith Stream : ");
        WithStream();


        System.out.println("\n----------------------\n");
        // 1: Iterating and displaying selected integers
        DiplayTable(2);

        System.out.println("\n----------------------\n");
        // 2: Concatenating two streams
        Concatenation();
    }



    // 1. Without Stream
    public static void WithoutStream()
    {
        List<String> names = new ArrayList<String>();
        names.add("Ajeet");
        names.add("Negan");
        names.add("Aditya");
        names.add("Steve");
        int count = 0;
        
        for (String str : names) {
            if (str.length() <= 5) 
                count++; 
        }
        System.out.println("There are "+count+" strings with length less than 6");
    }  
    
    
    // 2. With Stream
    public static void WithStream()
    {
        List<String> names = new ArrayList<String>();
        names.add("Ajeet");
        names.add("Negan");
        names.add("Aditya");
        names.add("Steve");
        
        //Using Stream and Lambda expression

        long count = names.stream().filter(str -> str.length() < 6).count();
        System.out.println("There are "+count+" strings with length less than 6");
    }  

    /*
    Explaination :
    Q : What is the difference between these codes?
    - The output of both the examples are same, however there is a major difference between these examples if you consider the performance of the code.
    - In the first example, we are iterating the whole list to find the strings with length less than 6. There is no parallelism in this code.
    - In the second example, the stream() method returns a stream of all the names, the filter() method returns another stream of names with length less than 6, the count() method reduces this stream to the result.
    - All these operations are happening parallelly which means we are able to parallelize the code with the help of streams. 
    - Parallel execution of operations using stream is faster than sequential execution without using streams.
    
    */



    // 1: Iterating and displaying selected integers
    public static void DiplayTable(int number)
    {
        int maxSize = 10 ;
        Stream.iterate(1, count -> count+1)
        .filter(No -> No % number == 0)
        .limit(maxSize)
        .forEach(System.out::println);
    }

     // 1: Iterating and displaying selected integers
     public static void Concatenation()
     {

         //list 1
         List<String> alphabets = Arrays.asList("A","B","C");
         //list 2
         List<String> names = Arrays.asList("Sansa","Jon","Arya");

         //creating two streams from the two lists and concatenating them into one
         Stream<String> result = Stream.concat(alphabets.stream(), names.stream());

         result.forEach(str -> System.out.print(str+" "));

    }



static void table()
{

    int Max = 10 ;
    int No = 2 ;

    Stream.iterate(1, i-> i+1).filter(j -> j % No == 0).limit(Max).forEach(System.out::print);



}

}


