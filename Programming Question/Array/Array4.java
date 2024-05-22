import java.lang.annotation.Retention;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

/* 

- Swapping Number with & without Third varible
- Reverse an Array consisting of integer value.00000
   
1. Swapping Two values (2 Method)
2. Reversing  an Array
3. Rotate an array by k steps (along with space optimization approach)
4. Check if a number is present in the array or not and answer queries corresponding to it.



*/

public class Array4 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        // swapNumber(10,20);
        // swapWithoutThird(10,20);

        int[] Arr = { 10, 20, 30, 40, 50 };
        // reverseArray(Arr);
        // swappingArray(Arr);
        // printArray(Arr);

        // 5
        // System.out.println("Before Rotating Array :");
        // printArray(Arr);
        // System.out.println("\nEnter k where k is no rotatio :");
        // int k = in.nextInt();
        // int []ans = rotateArray(Arr,k);
        // System.out.println("After Rotating Array :");
        // printArray(ans);

        // 6. Rotate in place
        // System.out.println("Before Rotating Array :");
        // printArray(Arr);
        // System.out.println("\nEnter k where k is no rotatio :");
        // int k = in.nextInt();
        // rotateArrayInPlace(Arr,k);
        // System.out.println("After Rotating Array :");
        // printArray(Arr);

        // Q : Given Q queries, check if the given number is present in the array or not
        // [Note : value of all the element in the array is less than 10 the power 5].

        System.out.println("Enter Array size :");
        int n = in.nextInt();

        int[] Brr = new int[n];

        System.out.println("Enter the " + n + " Element :");
        for (int i = 0; i < Brr.length; i++) {
            Brr[i] = in.nextInt();
        }

        int[] freq = makeFreqArray(Brr);

        System.out.println("Enter the No of Queries :");
        int q = in.nextInt();

        while (q > 0) {
            System.out.println("Enter the to be searched..");
            int x = in.nextInt();

            if (freq[x] > 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");

            }
            q--;
        }

    }

    public static void swapNumber(int a, int b) {
        System.out.println("Before Swapping a :" + a + " b :" + b);
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After Swapping a :" + a + " b :" + b);
    }

    public static void swapWithoutThird(int a, int b) {
        System.out.println("\nSwapping Without Third Varible \n");
        System.out.println("Before Swapping a :" + a + " b :" + b);
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After Swapping a :" + a + " b :" + b);
    }

    public static void printArray(int[] Arr) {
        for (int i = 0; i < Arr.length; i++) {
            System.out.print(Arr[i] + ", ");
        }
    }

    public static void reverseArray(int[] Arr) {
        int indexofSecondArr = 0;
        System.out.print("Reverse Array : ");

        // int i = n -1 , j = 0;
        // while(i >= 0 ) j[i++] = arr[i--]
        for (int i = Arr.length - 1; i >= 0; i--) {
            Arr[indexofSecondArr++] = Arr[i];
            System.out.print(Arr[i] + ", ");
        }
    }

    public static void swapArrayMethod(int[] Arr, int i, int j) {
        int temp = Arr[i];
        Arr[i] = Arr[j];
        Arr[j] = temp;
    }

    public static void swappingArray(int[] Arr) {
        System.out.println("Swapping Array :");
        int i = 0, j = Arr.length - 1;

        while (i < j) {
            swapArrayMethod(Arr, i, j);
            // int temp = Arr[i];
            // Arr[i] =Arr[j];
            // Arr[j] = temp;

            i++;
            j--;
        }

    }

    public static int[] rotateArray(int[] Arr, int k) {
        int n = Arr.length;
        k = k % n;
        System.out.println("k value " + k);

        int[] ans = new int[n];
        int j = 0;

        // for loop for -> k to n
        for (int i = n - k; i < n; i++) {
            ans[j++] = Arr[i];
        }

        // for loop for -> 0 to k (if k = 5 n= 7 = 2 means loop execured only for index
        // 0 1 )
        for (int i = 0; i < n - k; i++) {
            ans[j++] = Arr[i];
        }

        return ans;
    }

    public static void swapReverseArray(int[] Arr, int start, int end) {
        int i = start, j = end;

        while (i < j) {
            // swapArrayMethod(Arr,i,j);
            int temp = Arr[i];
            Arr[i] = Arr[j];
            Arr[j] = temp;

            i++;
            j--;
        }
    }

    public static void rotateArrayInPlace(int[] Arr, int k) {
        int n = Arr.length;
        k = k % n;

        // part 1
        swapReverseArray(Arr, 0, n - k - 1);

        // part 2
        swapReverseArray(Arr, n - k, n - 1);

        // Ans : where reverse of revser is strate.
        swapReverseArray(Arr, 0, n - 1);
    }




    // Frequence Array 
    public static  int [] makeFreqArray(int[] Arr)
    {   
        int [] freq = new int[100005];

        for (int i = 0; i < Arr.length; i++) {
                freq[Arr[i]]++;
        }

        return freq;
    }

}
