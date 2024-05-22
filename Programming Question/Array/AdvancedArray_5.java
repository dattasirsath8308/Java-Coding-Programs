import java.util.Scanner;

/* 
Pattern : Prefix Sum

Question : 

1. Given an integer array 'a', return the prefix sum/running sum in the same array without creating a new array .


2. Given an array of integers of size n . Answer q queries where you need to print the sum of values in a given range of indices from 2 to r(both included). [Note : The values of l and r in queries follow l-based indexing. (1 based intexing means our array index start from 1 and start 0.) ] 


3. Check if we can partition the array into two subarrays with equal sum .More formally, check that the prefix sum of a part of the array is equal to the suffix sum of rest of the array .

*/ 

public class AdvancedArray_5 {

    
    public static int findArraySum(int []Arr)
    {
        int totalSum = 0;
        for (int i = 0; i < Arr.length; i++) {
            totalSum += Arr[i];
        }
        return totalSum;
    }

    public static boolean equalSumPartition(int []Arr)
    {
        int totalSum = findArraySum(Arr);


        int prefSum = 0;
        
        for (int i = 0; i < Arr.length; i++) {
            prefSum += Arr[i];
            System.out.println("Prefix sum  "+i+" th index :"+prefSum);

            int suffixSum = totalSum - prefSum;

            System.out.println("Suffix sum  "+suffixSum+" = total Sum :"+totalSum +" - prefix Sum :"+prefSum );


            if(suffixSum == prefSum)
            {
                return true;
            }
        }
        
        return false;
    }


    public static int []makeSuffixSumArray(int[] Arr)
    {
        int n = Arr.length;
        int[] suf = new int[n];
        suf[0] = Arr[n];

        for (int i = suf.length; i > 0 ; i--) {
            suf[i] = suf[i-1] + Arr[i];
        }

        return suf;
    }

    public static void printSuffixArray(int[] Arr) {
        for (int i = Arr.length -1; i >= 0; i--) {
            System.out.print(Arr[i] + ", ");
        }
        System.out.println();
    }


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter Array size :");
        int n = in.nextInt();

        int[] Arr = new int[n];

        System.out.println("Enter the " + n + " Element :");
        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = in.nextInt();
        }

        System.out.println("Input Array ");
        printArray(Arr);
        System.out.println("---------------");
        int[] pref = makePrefixSumArray(Arr);
        System.out.println("Prefix sum of Array ");
        printArray(pref);
      
        
        // int pref = makePrefixRangeSumArray(Arr,1,2);
        int[] suf = makePrefixSumArray(Arr);
        System.out.println("Suffix sum of Array ");
        printSuffixArray(suf);


        //
        // System.out.println("Equal Partition is Possible : "+equalSumPartition(Arr)); 
       
        
    }

    public static void printArray(int[] Arr) {
        for (int i = 0; i < Arr.length; i++) {
            System.out.print(Arr[i] + ", ");
        }
        System.out.println();
    }



    public static int []makePrefixSumArray(int[] Arr)
    {
        int n = Arr.length;
        int[] pref = new int[n];
        pref[0] = Arr[0];

        for (int i = 1; i < pref.length; i++) {
            pref[i] = pref[i-1] + Arr[i];
        }

        return pref;
    }



    public static int makePrefixRangeSumArray(int[] Arr, int start ,int end)
    {
        int n = Arr.length;
        int[] pref = new int[n];
        pref[0] = Arr[0];
        int sum = 0 ;
        System.out.println("start is :"+ start +" end is :"+end);

        for (int i = 0; i >= start && i <=end ; i++) {
         
            sum +=  Arr[i];
        }
        System.out.println("sum is "+sum);

        return sum;
    }




}
