package stream;

/*
What is Stream API  ?
- We use stream API for the process collections of data in functional and declarative manner & stream improve the readability and maintainability. 
- The Stream API is a way is used to process the data in Java.
- Stream is sequence of elements which supports the functional & declarative programming.
- if  we  want  to  process  a  group  of  objects  from  the  collection  then  we  should   go  for  streams.
- Stream is not data structure. stream means bunch of operation applied on source data. Source can be Collections or Array.
- Stream will not change original data structure of the source It just process the data which give by the source.

How to use Streams ?
- Source, Intermediate Operation & Terminal operation.


	- Stream Pipeline:
	A typical stream pipeline has 3 parts:
		1. Source → Collection, array, or I/O channel.
		- Source : This is the starting point of the stream — where the data comes from.
		Example: List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

		2. Intermediate Operations → Transform data. (Return a Stream)
		- Intermediate Operation : These are transformations applied on the stream. They return another Stream, allowing multiple operations to be chained together.
		Example: filter(), map(), sorted().

		3. Terminal Operation → Produce the result.
		- Terminal Operation : These end the stream pipeline and produce a result (like a value, collection, or output).
		Example: collect(), forEach(), count(), reduce().


*/

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String[] args) {
        
        
        // filtering

        List<Integer> numIntegers = Arrays.asList(1,2,3,4,5);

        List<Integer> list2 = numIntegers.stream().filter(i -> i % 2 == 0).toList();
        list2.forEach(System.out::println);


        // # Creating Stream

        // 1. From Collections
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Stream<Integer> stream = list.stream();


        //2. From Arrays
        int[] arr = {1,2,3};
        IntStream stream2 = Arrays.stream(arr);

        // 3. Using Stream.of()
        Stream<String> stream3  = Stream.of("a","b","c");

        // 4. Infinite stream
        Stream<Integer> stream4 = Stream.generate(() -> 1);
        List<Integer> stream5 = Stream.iterate(10, x -> x + 1).limit(20).toList();
        System.out.println("iterate() method :\n "+stream5);

    }
    
}
