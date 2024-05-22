import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;

/*
9) How do you merge two unsorted arrays into single sorted array using Java 8 streams?

input : 
        arr1 : {4, 2, 7, 1};
        arr2 : {8, 3, 9, 5}
output : [1, 2, 3, 4, 5, 7, 8, 9]



*/

public class _9_2UnsortedToSortedArray {

    public static void main(String[] args) {
     
        MergeArray();


        System.out.println("\n--------------\n");

        MergeArrayUsingJava8();

    }
    


    static void MergeArray()
    {
        int[] arr1 = {4, 2, 7, 1};
        int[] arr2 = {8, 3, 9, 5};

        int[] MergeArr = new int[arr1.length + arr2.length];

        System.arraycopy(arr1, 0, MergeArr, 0, arr1.length);
        System.arraycopy(arr2, 0, MergeArr, arr1.length, arr2.length);

        Arrays.sort(MergeArr);

        for (int i : MergeArr) {
            System.out.print(i +", ");
        }
    }

    static void MergeArrayUsingJava8()
    {
        int[] a = new int[] {4, 2, 7, 1};
         
        int[] b = new int[] {8, 3, 9, 5};
         
        int[] c = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();
         
        System.out.println(Arrays.toString(c));

    }

}
