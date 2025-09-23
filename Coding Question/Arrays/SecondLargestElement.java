/*
- Second Largest Element in an Array
 Q. Given an array of positive integers arr[] of size n, the task is to find second largest distinct element in the array.

Note: If the second largest element does not exist, return -1.

Input: arr[] = [12, 35, 1, 10, 34, 1]
Output: 34
Explanation: The largest element of the array is 35 and the second largest element is 34.

Input: arr[] = [10, 5, 10]
Output: 5
Explanation: The largest element of the array is 10 and the second largest element is 5.

Input: arr[] = [10, 10, 10]
Output: -1
Explanation: The largest element of the array is 10 there is no second largest element.
 */

import java.util.Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        

        int[] arr1 = {12, 35, 1, 10, 34, 1};

        
        System.out.println("1st Way without inbuild method");
        firstWayToFindSecondLargest(arr1);


        
        System.out.println("\n2nd Way with inbuild method");
        int[] arr2 = { 12, 35, 1, 10, 34, 1 };

        int sl = secondWayToFindSecondLargest(arr2);

        System.out.println("Second Largest No is  : "+sl);



        System.out.println("\n3rd Way with inbuild method");
        int[] arr3 = {12, 35, 1, 10, 34, 1};;

        thirdWayToFindSecondLargest(arr3);



    }


    // 1. Without inbuild method
    public static void firstWayToFindSecondLargest(int[] arr1){


        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE; 


        for (int i = 0; i < arr1.length; i++) {
            
            if(largest < arr1[i] ){
                secondLargest = largest;
                largest = arr1[i];
            }else if(largest > arr1[i] && arr1[i] > secondLargest )
            {
                secondLargest = arr1[i];
            }
        }


        System.out.println("Largest No : "+largest);
        System.out.println("Second Largest No : "+secondLargest);
    }


    // 2.
     // 1. Without inbuild method
    public static int secondWayToFindSecondLargest(int[] arr2){

        
        int n = arr2.length;

        Arrays.sort(arr2);

        System.out.println("Sorted Array: " + Arrays.toString(arr2));

        System.out.println("second No : "+arr2[n - 2]);

        for (int i = n-2; i >= 0 ; i--) {
            
            if(arr2[i] != arr2[n -1]){
                return arr2[i];
            }
        }

        return -1;
    }

     public static void thirdWayToFindSecondLargest(int[] arr1){


        int largest = arr1[0];
        int secondLargestlargest = arr1[0];
        

        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] > largest){
                largest = arr1[i];
            }
        }



        for (int i = 0; i < arr1.length; i++) {
            
            if(arr1[i] > secondLargestlargest && arr1[i] != largest){
                secondLargestlargest = arr1[i];
            }
        }

        System.out.println("Second Largest is : "+ secondLargestlargest);

     }

    
}
