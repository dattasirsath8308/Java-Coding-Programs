import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.crypto.AEADBadTagException;

public class StreamPractiseQuestions {

    public static void main(String[] args) {
        


        // 1. Find the sum of all element in list using stream
        List<Integer> nums = Arrays.asList(1,22,3,4);
        // We use the stream() method to convert the list into a stream.
        // Then, we use the mapToInt() method to convert each element of the stream into an integer 
        
        // int sum = nums.stream().mapToInt(Integer::intValue).sum();
        // System.out.println(sum);
        

        System.out.println("------------------\n");

        
        // 2. write a program to find maximum element in stream.
        int max = nums.stream().max(Comparator.naturalOrder()).get();
                        // stream().max(comapare:Integer).get();

        System.out.println("Max Element is :");
        System.out.println(max);

        System.out.println("------------------\n");


        
        // 3. Count the number of string that start with specific character using stream.
        List<String> fruits = Arrays.asList("cherry","banana","coconut","apple");  
        System.out.println("No of element start with c:");
        long count = fruits.stream().filter(e -> e.startsWith("c")).count();
        System.out.println(count);


        System.out.println("------------------\n");

        // 4. convert list string to Uppercase
        System.out.println("The Uppercase of list string is :");
        fruits.stream().map(String::toUpperCase).forEach(System.out::println);

        System.out.println("------------------\n");


        // 5. Given a list of integers, write a program to filter out the even number using stream 
        // Count the number of element in a list that satisfy a specific condition using streams.

        System.out.println("Event Number is :");
        List<Integer> numbers = Arrays.asList(10,11,12,13,14,15);
        numbers.stream().filter(e-> e % 2 == 0).forEach(System.out::println);

        long count1 = numbers.stream().filter(e-> e % 2 == 0).count();
        System.out.println("Number of Even No :"+count1);


        System.out.println("------------------\n");


        // 6. Write a program find the average of a list of floating-point numbers using streams.
        System.out.println("Average is : ");
        List<Double> floatNums = Arrays.asList(1.1,1.2,1.3,1.4);
        double ave =  floatNums.stream().mapToDouble(Double::doubleValue).average().getAsDouble();
        System.out.println(ave);

        System.out.println("------------------\n");


        // 7. Given a List of strings ,write a program to concatenate all the strings using streams.
        List<String> fruitsConcate = Arrays.asList("cherry","banana","coconut","apple");  
        System.out.println("String after Concatenation :");
        String concatedString = fruitsConcate.stream().collect(Collectors.joining(","));
        System.out.println(concatedString);


        System.out.println("------------------\n");


        // 8. Write a program to remove duplicate elements from a List using Streams.
        System.out.println("Duplicate Removed");
        List<Integer> numbers1 = Arrays.asList(10,11,12,11,14,12);
        numbers1.stream().distinct().forEach(System.out::println);


        // 9. Given a List of Object, write a program to sort the object based on specific attribute using streams.
        // List<Person> p = Arrays.asList(

        //     new Person("Datta",23),
        //     new Person("Nagesh",22),
        //     new Person("Mac",21),
        //     new Person("SHree",18)
        // );

        // Collections.sort(p,Comparator.comparing(p::getAge));
        // System.out.println(p);


        System.out.println("------------------\n");

        // 10. Write a program to check if all elements in a List satisfy a given condition using streams.
        System.out.println("Check all are Even");
        List<Integer> Evennumbers = Arrays.asList(10,12,14);
        boolean isEven = Evennumbers.stream().allMatch(e -> e % 2 == 0);
        System.out.println(isEven);

        

    }
    
}
