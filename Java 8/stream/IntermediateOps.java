// package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
- Intermediate operation use tranform a stream into another stream
- they are lazy , meaning they don't execute until a terminal operation is invoked.

*/

public class IntermediateOps {

    public static void main(String[] args) {
        

        // 1. filter (Predicate Interface)
        
        List<String> list = Arrays.asList("Akshit","Dabya", "Ashok","Murgan");
        Stream<String> filterredList= list.stream().filter(i -> i.startsWith("A"));
        //  No filtering at this points cause of terminal opertation
        long count = list.stream().filter(x -> x.startsWith("A")).count();
        System.out.println(count);
        

        // 2. map (Function Interface)
        List<String> uppercaseList = list.stream().map(word -> word.toUpperCase()).toList();
        List<String> lowercaseList = list.stream().map(String::toLowerCase)
        .filter(x -> x.startsWith("a") )
        .toList();
        System.out.println(uppercaseList);
        System.out.println(lowercaseList);


        // 3. sorted
        System.out.println("\nsorted() : ");
        Stream<String> sortedStream = list.stream().sorted();
        Stream<String> sortedStream2 = list.stream().sorted((a, b) -> a.length() - b.length());
        sortedStream2.forEach(System.out::println);


        // 4. distinct
        System.out.println("\n distinct() : ");
        long distinctStream = list.stream().filter(x -> x.startsWith("A")).distinct().count();
        System.out.println("A distict count : "+distinctStream);


        // 5. limit
        System.out.println("\n limit() : ");
        List<Integer> limiStream = Stream.iterate(1, x -> x + 1).limit(20).toList();
        System.out.println(limiStream);


        // 6. skip()
        System.out.println("\n skip() : ");
        List<Integer> skipStream = Stream.iterate(1, x -> x + 1).limit(20).skip(10).toList();
        System.out.println(skipStream);



        // 7. flatMap
        // Handle stream of collections, lists or array where each element is itself a collection
        // Flatten nested structures (e.g list within lists) so that they can be processes as a single sequence of elements
        // transform and flatten elements at the same time.

        System.out.println("\n flatMap : ");
        List<List<String>> listOfList = Arrays.asList(
            Arrays.asList("apple", "banana"),
            Arrays.asList("orange", "kiwi"),
            Arrays.asList("pear", "grape")
        );


        System.out.println(listOfList.get(1).get(1));

        List<String> s  = listOfList.stream().flatMap(x -> x.stream()).map(String::toUpperCase).toList();
        System.out.println(s);


        List<String> sentence  = Arrays.asList(
            "Hello world",
            "Java stream are powerful",
            "flatmap is useful"
        );

        // sentence.stream().flatMap(sentence -> Arrays.stream(sentence.split(" "))).map(String::toUpperCase).toList());

        String sent  = sentence.stream().flatMap(b -> Arrays.stream(b.split(" "))).map(String::toUpperCase).toString();

        System.out.println(sent);

    }
}
