import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
20) Reverse an integer array
input : 5, 1, 7, 3, 9, 6
output : [6, 9, 3, 7, 1, 5]

*/

public class _20_ReverseArray {
    
    public static void main(String[] args) {
        
        ReverseArray();

        System.out.println("\n-------\n");

        ReverseArrayUsingJava8();
    }

    static void ReverseArray()
    {
        int []arr = {10,20,30,40,50};
        System.out.println("Array : ");
        for (int i : arr) {
            System.out.print(i+" ");
        }

        System.out.println("\n Revese Array : ");
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i]+" ");
        }
    }

    static void ReverseArrayUsingJava8()
    {
        int []arr = {10,20,30,40,50};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();


        List<Integer> RevString = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        // int [] ReverseArray = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();

        System.out.println(RevString);
    }
}
