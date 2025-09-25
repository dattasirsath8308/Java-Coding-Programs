/*
    
Q. Third largest element in an array of distinct elements

Given an array of n integers, the task is to find the third largest element. All the elements in the array are distinct integers. 

Examples : 

Input: arr[] = {1, 14, 2, 16, 10, 20}
Output: 14
Explanation: Largest element is 20, second largest element is 16 and third largest element is 14

Input: arr[] = {19, -10, 20, 14, 2, 16, 10}
Output: 16
Explanation: Largest element is 20, second largest element is 19 and third largest element is 16 
 
*/

import java.util.Arrays;

public class ThirdLargestElement {

    public static void main(String[] args) {
        
        System.out.println("\n----  1st Way ------");


        int arr[] = {1, 14, 2, 16, 10, 20};

        firstWayToFindThirdLargest(arr);

        System.out.println("\n----  2nd Way ------");
        secondWayToFindThirdLargest(arr);


        System.out.println("\n----  3rd Way ------");
        thirdWayToFindThirdLargest(arr);


        System.out.println("\n----  4th Way ------");
        fourthWayToFindThirdLargest(arr);

    }


    static void firstWayToFindThirdLargest(int[] arr){

        int n = arr.length;

        Arrays.sort(arr);

        int ThirdLargestElement = arr[n - 3];

        System.out.println("Third Largest element is : "+ ThirdLargestElement);

    }



    static void secondWayToFindThirdLargest(int[] arr){

        int largest = Integer.MIN_VALUE;
        int secondLargest =  Integer.MIN_VALUE;
        int ThirdLargest =  Integer.MIN_VALUE;
        

        for (int i = 0; i < arr.length; i++) {
            
            if(arr[i] > largest){

                ThirdLargest = secondLargest;
                secondLargest = largest; 
                largest = arr[i];
            }else if(arr[i] > secondLargest){

                ThirdLargest = secondLargest;
                secondLargest = arr[i];
            }else if(arr[i] > ThirdLargest){
                ThirdLargest = arr[i];
            }
        }

        System.out.println("First Largest is : "+ largest);
        System.out.println("Second Largest is : "+ secondLargest);
        System.out.println("Third Largest is : "+ ThirdLargest);

    }


    static void thirdWayToFindThirdLargest(int[] arr){


        Integer first = Integer.MIN_VALUE, second = Integer.MIN_VALUE, third  = Integer.MIN_VALUE;
        
        int n =  arr.length;
        
        for (int i = 0; i < n; i++) {
            
            if(arr[i]> first){
                first = arr[i];
            }
        }


        for (int i = 0; i < n; i++) {
            
            if(arr[i] > second && arr[i] < first ){
                second = arr[i];
            }
        }


         for (int i = 0; i < n; i++) {
            
            if(arr[i]> third && arr[i] < second ){
                third = arr[i];
            }
        }

        System.out.println("First Largest is : "+ first);
        System.out.println("Second Largest is : "+ second);
        System.out.println("Third Largest is : "+ third);

    }



    
    static void fourthWayToFindThirdLargest(int[] arr){


        

    }



}
