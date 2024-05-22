import java.util.Arrays;

/* 

This method is introduced to support the parallel sorting of array elements.
Algorithm of parallel sorting:
1. The given array is divided into the sub arrays and the sub arrays are further divided into the their sub arrays, this happens until the sub array reaches a minimum granularity.
2. The sub arrays are sorted individually by multiple threads. The parallel sort uses Fork/Join Framework for sorting sub arrays parallelly.
3. The sorted sub arrays are merged.

Advantage of Parallel Sort Over Simple Sort:
The parallelSort() method uses the concept of multithreading which makes it much faster compared to the normal sort when there are lot of elements.*/


public class _8_ArraysParallelSort {

    public static void main(String[] args) {
        
        primitiveSorting();

        System.out.println("\n----------------------------");

        SortingStartandEnd();


    }


     private static void primitiveSorting()
    {

        int numbers[] = {22, 89, 1, 32, 19, 5};
        //Parallel Sort method for sorting int array
        Arrays.parallelSort(numbers);
        //converting the array to stream and displaying using forEach
        Arrays.stream(numbers).forEach(n->System.out.print(n+" "));

    }


    private static void SortingStartandEnd()
    {

            int numbers[] = {22, 89, 1, 32, 19, 5};
         
            // Specifying the start and end index. The start index is 1 here and the end index is 5. which means the the elements  starting from index 1 till index 5 would be sorted.

            Arrays.stream(numbers).forEach(n->System.out.print(n+" "));

            System.out.println("\nAfter Sorting :");
            Arrays.parallelSort(numbers, 2, 6);
         
            //converting the array to stream and displaying using forEach
            Arrays.stream(numbers).forEach(n->System.out.print(n+" "));
    }

        
    
}
