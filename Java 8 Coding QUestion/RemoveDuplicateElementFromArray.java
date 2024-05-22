import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
3. Remove Duplicates from an Array.

input : 1,2,3,1,4,5,6,2
output : 1,2,3,4,5,6


//  1. we can use Set 
*/

public class RemoveDuplicateElementFromArray {
    
    public static void main(String[] args) {
        
        RemoveDuplicateNormalusingSet();

        RemoveDuplicateNormal();

        RemoveDuplicateUsingJava8();

        
    }


// 1.  
    public static void RemoveDuplicateNormalusingSet()
    {
        int arr[] = { 1,2,3,1,4,5,6,2};

        Set set = new HashSet();
        for (int i = 1; i < arr.length -1 ; i++) {
            set.add(i);
        }
        System.out.println(set);

    }


    

    // 2.
    public static void RemoveDuplicateNormal()
    {
        int arr[] = { 1,2,3,1,4,5,6,2};

        int n = arr.length;

        int r =  removeDuplicates(arr,n);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] +" ");
        }

        System.out.println("\n===============\n");

    }

    // Function to remove duplicates from sorted array
    static int removeDuplicates(int arr[], int n) {
        // If array is empty or has only one element, no duplicates to remove
        if (n == 0 || n == 1)
            return n;

        // Initialize a variable to keep track of the unique elements
        int uniqueIndex = 0;

        // Iterate through the array to find unique elements
        for (int i = 0; i < n - 1; i++) {
            // If current element is different from the next element, add it to the unique elements
            if (arr[i] != arr[i + 1])
                arr[uniqueIndex++] = arr[i];
        }

        // Add the last element to the unique elements
        arr[uniqueIndex++] = arr[n - 1];

        // Return the new length of the array without duplicates
        return uniqueIndex;
    }


    

    // 3.
    static void RemoveDuplicateUsingJava8()
    {
        List<Integer> number = Arrays.asList(1,2,1,2,3,4,5,4);

         number.stream().distinct().forEach(System.out::println);

    }

}
