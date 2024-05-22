import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* 
- The filter() is an intermediate operation that reads the data from a stream and returns a new stream after transforming the data based on the given condition.



*/



public class _5_Stream_filter {

    public static void main(String[] args) {
        


        asList();

        System.out.println("\n Filter and Collect Method of Stream...");
        filterAndcollect();


        System.out.println("\n 2: Stream filter() with multiple conditions");
        filterWithMultiple();


        System.out.println("\n 3: Stream filter() and map() method in Java");
        filterandMap();



        odd();


    }


    public static void asList() 
    {

        List<String> names = Arrays.asList("Melisandre","Sansa","Jon","Daenerys","Joffery");
            
        //Creating the stream of all names
        Stream<String> allNames = names.stream();
            
        //Creating another stream by filtering long names using filter()
        Stream<String> longNames = allNames.filter(str -> str.length() > 6);
            
        //displaying the long names
        longNames.forEach(str->System.out.print(str+" "));

      }



    //   1: Stream filter() and collect()
    public static void filterAndcollect() 
    {

      List<String> names = Arrays.asList("Melisandre","Sansa","Jon","Daenerys","Joffery");

        // List<String> longnames = names.stream()    // converting the list to stream
        //         .filter(str -> str.length() > 2)   // filter the stream to create a new stream
        //         .collect(Collectors.toList());  // collect the final stream and convert it to a List

        List<String> longnames = names.stream().filter(str -> str.length() > 3).collect(Collectors.toList());

        // List<String> str =  names.stream().filter(s ->  s.length() > 4 ).collect(Collectors.toList())

        longnames.forEach(System.out::println); 

    }


    // 2: Stream filter() with multiple conditions
    public static void filterWithMultiple() 
    {

      List<String> names = Arrays.asList("Melisandre","Sansa","Jon","Daenerys","Joffery");

        
        List<String> longnames = names.stream().filter(str -> str.length() > 3 && str.length() < 8).collect(Collectors.toList());


        longnames.forEach(System.out::println); 

    }



    // 3: Stream filter() and map() method in Java
    public static void filterandMap() 
    {

      List<Integer> num = Arrays.asList(1,2,3,4,5,6);

        
        List<Integer> squares = num.stream().map(n -> n * n) .collect(Collectors.toList());

        System.out.println(squares);

    }





    // void met()
    // {
    //   List<String> names = Arrays.asList("Melisandre","Sansa","Jon","Daenerys","Joffery");

    //   names.stream().filter(e-> e.length() > 3).collect(Collectors.toList());


    // }




      public static void odd ()
      {

        List<Integer> list =  Arrays.asList(10,12,13,14,15);

        list.stream().filter(e-> e % 2 == 0).collect(Collectors.toList()).forEach(System.out::println);

        



      }


}
