import java.util.Scanner;


/*

//  Pattern : Two Pointer 


Questions :
1. Sort an Array consisting  of only 0s and 1s.
Ex : arr = 0 1 0 1 1 0 1 0  -> Ans : 0 0 0 0 1 1 1 1

2. Given an array of integers 'a', move all the even integers at the begining of the array followed by the odd integers . The relative order of odd or even integets does not matter. Return any array that satisfies the condition. 
Ex : 1 2 3 4 5 6 7   -> ANs 2 4 6 1 3 5 7 or 6 2 4 1 3 7 5 (relative order doesnt matter )



3. GIven an array 'a' is sorting in non- decreasing order , return an array of the sqaure of each number sorted in non descreasing order.

*/

public class AdvancedArray_4 {
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter Array size :");
        int n = in.nextInt();

        int[] Arr = new int[n];

        System.out.println("Enter the " + n + " Element :");
        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = in.nextInt();
        }


        printArray(Arr);
        System.out.println("After Sorting zeros and ONes");
        
        //1st Way  
        // sortZerosAndOne(Arr);

        // 2nd way using single loop
        // sortZerosAndOne2(Arr);

        // 2 
        // sortArrayByParity(Arr);
        // printArray(Arr);
        

        // 3.1 
        // int[] ans =  sortSquareArray(Arr);
        // reverse(ans);
        // printArray(ans);

        //  3.2 Without reverse 
        int[] ans =  sortSquareArrayWithoutReverse(Arr);
        printArray(ans);

    }

    public static void printArray(int[] Arr) {
        for (int i = 0; i < Arr.length; i++) {
            System.out.print(Arr[i] + ", ");
        }
        System.out.println();
    }

    public static void swapArrayMethod(int[] Arr, int start, int end) {
        int temp = Arr[start];
        Arr[start] = Arr[end];
        Arr[end] = temp;
    }


    public static void reverse(int[] Arr) {
        int start = 0 , end = Arr.length-1; 
        
        while(start < end)
        {

            int temp = Arr[start];
            Arr[start] = Arr[end];
            Arr[end] = temp;
            start++;
            end--;
        }
    }


    // 1 : 1st way 
    public static void sortZerosAndOne(int[]arr)
    {
        int n = arr.length;
        int zeros = 0;

        for (int i = 0; i < n; i++) {
            if(arr[i] == 0)
            {
                zeros++;
            }
        }


        for (int i = 0; i < n; i++) {
            if(i < zeros )
            {
                arr[i] = 0;
            }else
            {
                arr[i] = 1;
            }
        }
    }


    // 2. Second way 

    public static void sortZerosAndOne2(int []Arr)
    {
        int n = Arr.length;
        int left = 0  , right = n-1;

        while(left < right)
        {

            if(Arr[left]== 1 && Arr[right] == 0)
            {
                swapArrayMethod(Arr, left, right);
                left++;
                right--;
            }

            if(Arr[left] == 0)
            {
                left++;
            }
            if(Arr[right] == 1)
            {
                right--;
            }
        }

    }


    // parity : even parity or odd parity
    public static void sortArrayByParity(int []Arr)
    {
        int n = Arr.length;
        int left = 0  , right = n-1;

        while(left < right)
        {

            if(Arr[left] % 2 == 1 && Arr[right] % 2 == 0)
            {
                swapArrayMethod(Arr, left, right);
                left++;
                right--;
            }

            if(Arr[left] % 2 == 0)
            {
                left++;
            }
            if(Arr[right] % 2 == 1)
            {
                right--;
            }
        }

    }


    //  4. 
    public static int[] sortSquareArray(int []Arr)
    {
        int n =  Arr.length;
        int left = 0  , right = n - 1 ;
        int k = 0 ;

        int []ans = new int[n];

        while(left <= right)
        {
            //  if left is > than right mean -10 > 9 = true bcoz of absulute
            if(Math.abs(Arr[left]) > Math.abs(Arr[right] ) )
            {
                // square
                ans[k++] = Arr[left] * Arr[left]  ;
                left++;
            }else
            {
                ans[k++] = Arr[right] * Arr[right]  ;
                right--;
            }
        }

        return  ans;


    }



    // 4.2 

    
    
    public static int[] sortSquareArrayWithoutReverse(int []Arr)
    {
        int n =  Arr.length;
        int left = 0  , right = n - 1 ;
        int k = n-1 ; //  using k-- We inserted value in last index from both side rigth & left  

        int []ans = new int[n];

        while(left <= right)
        {
            //  if left is > than right mean -10 > 9 = true bcoz of absulute
            if(Math.abs(Arr[left]) > Math.abs(Arr[right] ) )
            {
                // square
                ans[k--] = Arr[left] * Arr[left]  ;
                left++;
            }else
            {
                ans[k--] = Arr[right] * Arr[right]  ;
                right--;
            }
        }

        return  ans;

    }




}
