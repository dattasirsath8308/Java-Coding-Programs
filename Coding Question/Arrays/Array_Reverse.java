
/*

    Reverse an array arr[]. Reversing an array means rearranging the elements such that the first element becomes the last, the second element becomes second last and so on.

Input: arr[] = [1, 4, 3, 2, 6, 5]  
Output:  [5, 6, 2, 3, 4, 1]
Explanation: The first element 1 moves to last position, the second element 4 moves to second-last and so on.

Input: arr[] = [4, 5, 1, 2]
Output: [2, 1, 5, 4]
Explanation: The first element 4 moves to last position, the second element 5 moves to second last and so on.

 */

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Array_Reverse {

    public static void main(String[] args) {

        
        int arr[] = { 1, 4, 3, 2, 6, 5 };
        System.out.println("Before Reverse ");
        printArray(arr);
        
        System.out.println("\n1. First Way");
        System.out.println("After Reverse ");
        firstWayToReverseArray(arr);
        printArray(arr);
        
        System.out.println("\n2. Second Way");
        System.out.println("After Reverse ");
        secondWayToReverseArray(arr);
        printArray(arr);


        System.out.println("\n3. Third Way");
        System.out.println("After Reverse ");
        thirdWayToReverseArray(arr);
        printArray(arr);
        


        practiseReverseArrys();
        
        practiseReverseArrysUsingJava8();
        

        
    }


    public static void printArray(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

    }


    // 1.
    public static void firstWayToReverseArray(int[] arr) {

        int n = arr.length;

        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            temp[i] = arr[n - i - 1];
        }

        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }

    }


    // 2.
    public static void secondWayToReverseArray(int[] arr) {


        // Initialize left to the beginning
        // and right to the end
        int left = 0, right = arr.length - 1;

        // Iterate till left is less than right
        while (left < right) {
            
            // Swap the elements at left
            // and right position
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Increment the left pointer
            left++;

            // Decrement the right pointer
            right--;

        }
    }



    // 3.
    public static void thirdWayToReverseArray(int[] arr) {

    
        int n = arr.length;
        
        for (int i = 0; i < n /2 ; i++) {
            
            int temp =  arr[i];
            arr[i] = arr[n- i- 1];
            arr[n- i- 1] = temp;

        }


    }


    public static void practiseReverseArrys(){

        System.out.println("\n\nPractise");

        int arr[] = { 1, 4, 3, 2, 6, 5 };
        System.out.println("Before Reverse ");
        printArray(arr);
        int n =  arr.length;

        for(int i = 0 ; i < n / 2; i++){

            int temp = arr[i];
            System.out.println("temp :"+ temp);
      
            arr[i] = arr[n - i - 1];
            
            System.out.println("arr[i] :"+ arr[n - i - 1]);

            arr[n - i - 1] = temp;
            
            System.out.println("arr[n - i - 1] :"+ temp);

        }

        printArray(arr);

    }



    public static void practiseReverseArrysUsingJava8(){

        System.out.println("revese using java 8 ");

        int arr[] = { 1, 4, 3, 2, 6, 5 };
      
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

        Collections.reverse(list);

        int[] rev= list.stream().mapToInt(i -> i).toArray();

        System.out.println(Arrays.toString(rev));


        int n = arr.length;

        int[] reversedArray = IntStream.range(0, n)
        .map(i ->  arr[n - 1 - i])
        .toArray();


        System.out.println("\n Another Way \n"+ Arrays.toString(rev));



    }
}
