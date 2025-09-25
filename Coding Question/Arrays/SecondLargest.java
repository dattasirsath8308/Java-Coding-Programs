/*
 
7. Write a Java program to find the second largest element in an array.

Input : arr = { 1, 2, 5, 6, 10 }
Ouput : Second largest number : 6

 */


 public class SecondLargest {

    public static void main(String[] args) {
        
        int []arr = { 1, 2, 5, 6, 10 };

        SecondLargest(arr);

    }


    static void SecondLargest(int []arr){

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;


        for (int num : arr) {
            
            if(num > largest){
              secondLargest = largest;
              largest = num;  
            }else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }


        System.out.println("Largest No : "+largest);
        System.out.println("Second Largest No : "+secondLargest);


    }


}
