
/*
- A type of stream that enables parallel processing of elements
- Allowing multiple threads to process of the stream simultaneously
- this can singnifinacantly improve performance for large data sets.
- workload is distributed across multiple threads.

*/

import java.util.List;
import java.util.stream.Stream;

public class ParallelStream {

    public static void main(String[] args) {
        


        long starTime = System.currentTimeMillis();
        List<Integer> list = Stream.iterate(1, x -> x  + 1).limit(2000).toList();
        // stream 
        List<Long> factorialList = list.stream().map(ParallelStream::factorial).toList();
        long endTime = System.currentTimeMillis();

        System.out.println("Time taken with sequencial stream : "+ (endTime - starTime) + " ms");


        starTime = System.currentTimeMillis();
        // parallelstream
        factorialList = list.parallelStream().map(ParallelStream::factorial).toList();
        endTime = System.currentTimeMillis();

        System.out.println("Time taken with sequencial stream : "+ (endTime - starTime) + " ms");




    }
    

    private static long factorial(int n){

        long result = 1;

        for (int i = 2; i < n; i++) {
            
            result = result * i;
        }

        return result;
    }
}
