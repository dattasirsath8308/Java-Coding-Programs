import java.util.Arrays;
import java.util.Scanner;

// Subject Target Sum

/* 
Questions :
1. Find the total number of pairs in the array whose sum is equal to the given value x .

2. Count the number of triplets whose sum is equal to given value x ;

3. Find the unique number in a given where all the element are being repeated twice with one value being unique.[Note : Only positive element in array]
Ex : 1 2 3  4 2 1 3  Where unique no is 4 .

4. Find the Second Largest Element is Array.

5. Given an array 'a' consisting of integer. return the first value that is repeating in this . If no value is being repeated , return -1.
*/

public class Array3_ {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array :");
        int n = sc.nextInt();

        int[] Arr = new int[n];

        System.out.println("Enter " + n + " element");
        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = sc.nextInt();
        }

        System.out.println("Enter Target Element for sum ");
        int target = sc.nextInt();

        pairSum(Arr,target);
        System.out.println("----------------------------------------");

        // tripletPairSum(Arr, target);

        // System.out.println("----------------------------------------");
        // int result = uniqueElemnt(Arr);
        // System.out.println("The Unique Element is : "+result);


        // System.out.println("----------------------------------------");
        //  secondLargetElemnt(Arr);

        System.out.println("----------------------------------------");
        // int secondMax =  secondMax(Arr);
        // System.out.println("Second Maximum Element is :"+secondMax);


        // int firstRepeatingNumber = firstRepeatingNumber(Arr);
        // System.out.println("First Repeating NUmber :"+firstRepeatingNumber);
    }


    // 1
    public static void pairSum(int[] Arr, int target) {
        int count = 0;
        // i for first element of Array
        for (int i = 0; i < Arr.length; i++) {
            // j for second element of Array
            for (int j = i + 1; j < Arr.length; j++) {
                int sum = Arr[i] + Arr[j];
                if (sum == target) {
                    count++;
                }
            }
        }
        System.out.println("Number of sum time is :" + count);
    }



    public void pairsum(int[]  Arr , int target)
    {
        int count = 0 ; 


        for (int i = 0; i < Arr.length; i++) {
            
            for (int j = i+ 1; j < Arr.length; j++) {
                
                for (int j2 = j + 1 ; j2 < Arr.length; j2++) {

                    int sum = Arr[i] + Arr[j] +Arr[j2] ;
                     
                    if(target == sum)
                    {
                        count++;
                    }
                }
            }
        }


    }

    // 2
    public static void tripletPairSum(int[] Arr, int target) {
        int count = 0;
        // i for first element of Array
        for (int i = 0; i < Arr.length; i++) {
            // j for second element of Array
            for (int j = i + 1; j < Arr.length; j++) {
                // k for Third element of Array
                for (int k = j + 1; k < Arr.length; k++) {
                    int sum = Arr[i] + Arr[j] + Arr[k];
                    if (sum == target) {
                        count++;
                    }
                }
            }
        }
        System.out.println("Number of sum time is (Using triplet) :" + count);
    }


    // 3
    public static int uniqueElemnt(int []Arr)
    {
        for (int i = 0; i < Arr.length; i++) {
            for (int j = i + 1; j < Arr.length; j++) {
                if(Arr[i] == Arr[j])
                {
                    Arr[i] = -1;
                    Arr[j] = -1;
                }
            }
        }

        int ans = -1; // -1 from above if() condition
        for (int i = 0; i < Arr.length; i++) {
            if(Arr[i] > 0)
            {
                ans = Arr[i];
            }
        }

        return ans;
    }


    
    
// 4
    public static void secondLargetElemnt(int []Arr)
    {
        Arrays.sort(Arr);

        int n = Arr.length;
        System.out.println("The Second Largest Element is :"+Arr[n-2]);
    }


    public static int findMax(int []Arr)
    {
        int Max = Integer.MIN_VALUE;

        for (int j = 0; j < Arr.length; j++) {
            
            if(Max < Arr[j])
            {
                Max = Arr[j];
            }
        }

        return Max;
    }

    // 5
    public static int secondMax(int []Arr)
    {
        int Max = findMax(Arr);


        for (int i = 0; i < Arr.length; i++) {
            //  Here we set Largest element to as Minimum.(Mark as as -infinity) 
            if(Max == Arr[i])
            {
                Arr[i] = Integer.MIN_VALUE;
            }
        }

        int secondMax = findMax(Arr);

        return secondMax;
    }


    public static int firstRepeatingNumber(int []Arr)
    {
        for (int i = 0; i < Arr.length; i++) {
            for (int j = i + 1; j < Arr.length; j++) {
                if(Arr[i] == Arr[j])
                {
                    return Arr[i] ;
                }
            }
        }
        return -1;
    }








}
