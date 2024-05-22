import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
5. Reverse the Array USing Stream .

input : 1,2,3,4
output : 4,3,2,1


- Reverse Array in Java Using Collections.reverse() 
- Reverse an Array in Java Using Arrays.copyOf()





*/

public class ReverseArray {

    public static void main(String[] args) {

        ReverseArrayNormal();

        ReverseArrayRecursion();


        ReverseArrayUsingJava8();

        ReverseArraList();

    }

    public static void ReverseArrayNormal() {
        int[] Arr = { 1, 2, 3 };

        int start = 0;
        int end = Arr.length -1;

        while (start < end) {
            int temp = Arr[start];
            Arr[start] = Arr[end];
            Arr[end] = temp;

            start++;
            end--;

        }

        System.out.println("Reversed Arrays is : ");
        printArray(Arr);
    
    }

    public static void printArray(int[] Arr) {
        for (int i = 0; i < Arr.length; i++) {
            System.out.print(Arr[i] + ", ");
        }
    }


    static void ReverseArrayRecursion()
    {
        int[] Arr = { 1, 2, 3 };

        int end = Arr.length ;
        int []reverseArray = new int [end];

        for (int i = 0; i < end ; i++) {
            reverseArray[i] = Arr[end - 1 - i ];
        }

        for (int i : reverseArray) {
            System.out.print(i +", ");
        }
    }



    //  Reveese  array 
    static void ReverseArrayUsingJava8()
    {
        // List<Integer> number = Arrays.asList(1,2,3,4,5);
        int[] Arr = { 1, 2, 3 };
                
        
        int[]  reverse = Arrays.stream(Arr)
                .boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();


                System.out.println("\nReverse is : ");
                for (int i : reverse) {
                    System.out.print(i+", ");
                }
    }



     static  void ReverseArraList(){

        List<Integer> number = Arrays.asList(1,2,3,4,5);

        List<Integer> Revesenumber = number.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());

        System.out.println("\n ---- \n Reverse ArrayList");
        for (Integer integer : Revesenumber) {
            System.out.print(integer +", ");
        }

    }
}


/*
Explanation
We use the Stream API introduced in Java 8 to perform the reversal.

Arrays.stream(originalArray) creates a stream of integers from the original array.

.boxed() converts the stream of integers into a stream of Integer objects.

.sorted(Collections.reverseOrder()) sorts the stream in reverse order, effectively reversing the elements.

.mapToInt(Integer::intValue) converts the stream of Integer objects back to a stream of primitive integers.

.toArray() collects the stream elements into an integer array, resulting in the reversed array.
 */