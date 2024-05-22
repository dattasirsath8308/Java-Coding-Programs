
import java.lang.reflect.WildcardType;
import java.util.Scanner;

/* 
Pattern : Prefix Sum


2. Given an array of integers of size n . Answer q queries where you need to print the sum of values in a given range of indices from 2 to r(both included). [Note : The values of l and r in queries follow l-based indexing. (1 based intexing means our array index start from 1 and start 0.) ] 


*/ 

public class  RangeArrayUsingPrefixSum {

    public static int []makePrefixSumArray(int[] Arr)
    {
        for (int i = 1; i < Arr.length; i++) {
            Arr[i] +=  Arr[i-1];
        }

        return Arr;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter Array size :");
        int n = in.nextInt();

        int[] Arr = new int[n+1];

        System.out.println("Enter the " + n + " Element :");
        for (int i = 1; i <= n; i++) {
            Arr[i] = in.nextInt();
        }

        System.out.println("Input Array ");
        printArray(Arr);
        System.out.println("---------------");
        int[] pref = makePrefixSumArray(Arr);
      
        // System.out.println("sum of Array "+ pref);
        // printArray(pref);

        System.out.println("Enter number of queries :");
        int q = in.nextInt();

        while(q-- > 0)
        {
            System.out.println("Enter Range : Length(l)  and Range(r) ");
            int l = in.nextInt();
            int r = in.nextInt();
            
            int ans = pref[r] - pref[l-1];

            System.out.println("Sum of Range is :"+ans);
            // q--;
        }
        
    }

    public static void printArray(int[] Arr) {
        for (int i = 0; i < Arr.length; i++) {
            System.out.print(Arr[i] + ", ");
        }
        System.out.println();
    }





    // public static int []makePrefixSumArray(int[] Arr)
    // {
    //     int n = Arr.length;
    //     int[] pref = new int[n];
    //     pref[0] = Arr[0];

    //     for (int i = 1; i < pref.length; i++) {
    //         pref[i] = pref[i-1] + Arr[i];
    //     }

    //     return pref;
    // }


}
