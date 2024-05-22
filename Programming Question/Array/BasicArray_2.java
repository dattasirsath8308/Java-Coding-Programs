import java.util.Arrays;


/*

1. Find the first Occurance
2. Find the Last Occurance
3. Count the number of element strictly greater than value x ; 
4. isArraySorted : Check if the given array sorted or not
5.  return smallest And LargestElement Element & also print second largest and second smallest elemnt in the array.


*/

public class BasicArray_2 {

    public static void main(String[] args) {
        

        int [] Arr = {11,20,10,40,10};
        int target = 10 ;

        // 1. first Occurance 
        int firstOccurance = findOccurance(Arr,target);   

        // -1 means condition is false . if condition is not false then first occurance.
        if(firstOccurance != -1)
        {
            System.out.println("First occurrence of " + target + " is at index: " + firstOccurance);
        } else {
            System.out.println(target + " not found in the array.");
        }
        

        System.out.println("-----------------------------------------");

        // 2. Last Occurance 
        lastOccurance(Arr,target);

        System.out.println("-----------------------------------------");
        // 3. numGTArray : Count the number of element strictly greater than value x ; 
        numGTArray(Arr,target);


        System.out.println("-----------------------------------------");
        // 4. isArraySorted : Check if the given array sorted or not
        int []Brr = {10,20,30, 40};
        boolean result =   isArraySorted(Brr);
        if(result)
        {
            System.out.println("Array is Sorted..");
        }else{
            System.out.println("Array is Not Sorted..");
        }


        System.out.println("-----------------------------------------");
        // 5. smallestAndLargestElement
        int[] ans= smallestAndLargestElement(Brr);
        System.out.println("Smaller is :"+ans[0] +" and Largest is :"+ans[1]);

    }

    // 1 
    public static int findOccurance(int []Arr, int search)
    {
        // int firstoccurance = 0 ;

        for (int i = 0; i < Arr.length; i++) {
            
            if(search == Arr[i])
            {
                return i;
            }
        }
        return -1;
    }

    // 2
    public static void lastOccurance(int []Arr , int search)
    {
        int lastoccurance = -1;

        for (int i = 0; i < Arr.length; i++) {
            
            if(search == Arr[i])
            {
                lastoccurance = i;
            }
        }
        
        System.out.println("Last occurrence of " + search + " is at index: " + lastoccurance);

    }

    // 3
    public static void numGTArray(int []Arr , int target)
    {
        int count = 0;

        for (int i = 0; i < Arr.length; i++) {
            
            if(target >= Arr[i])
            {
                count++;
            }
        }
        
        System.out.println("number of element strictly greater than " + count + " is  value: " + target);

    }



    // 4 
    public static boolean isArraySorted(int []Brr)
    {
        boolean isbool = true; 

        // 10
        for (int i = 1; i < Brr.length; i++) {
            System.out.println("Brr[i] "+Brr[i] +" |  Brr[i-1]"+Brr[i-1]);
            if(Brr[i] < Brr[i-1])
            {
                isbool = false;
                break;
            }
        
        }
        return isbool;
    }



    // 5. smallestAndLargestElement & SecondSmallest and Largest
     
    public static int[] smallestAndLargestElement(int []Brr)
    {
        Arrays.sort(Brr);
        int[] ans = {Brr[0], Brr[Brr.length-1] };

        int length = Brr.length;

        if(length > 2)
        {
            int SecondSmallest = Brr[1];
            int SecondLargest = Brr[length-2];
            System.out.println("The Second Smallest Number is :"+SecondSmallest +" Second Largest Number is :"+SecondLargest);
        }
        return ans; 
    }
}
