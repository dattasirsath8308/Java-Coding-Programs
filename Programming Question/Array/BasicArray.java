// package Array;

/*

1. print the sum of element of array. 
2. print the Maximum element in array.
3. print the Minimum element in array.
4. search the given element x in the array. If present then return the index else return -1 



*/

public class BasicArray {
    public static void main(String[] args) {

        int[] arr = { 40, 2, 30 };

        // 1. Sum
        sumOfArray(arr);

        // 2. Maximum Element in Array
        maxElementArray(arr);

        // 3. Minimum Element in Array
        minElementArray(arr);


        // 4. element Searching 
        // Q : search the given element x in the array. If present then return the index else return -1 

        int result = searchElement(arr);
        System.out.println("Element found at index position : "+ result);
    }

    public static void sumOfArray(int[] arr) {
        int sum = 0;
        for (int index = 0; index < arr.length; index++) {

            sum += arr[index];
        }

        System.out.println(sum);

    }

    public static void maxElementArray(int[] arr) {
        int Max = 0;
        for (int index = 0; index < arr.length; index++) {

            if (Max < arr[index]) {
                Max = arr[index];
            }
            // Max += arr[index];
        }
        System.out.println(Max);
    }

    public static void minElementArray(int[] arr) {
        int Min = arr[0];
        for (int index = 0; index < arr.length; index++) {

            if (Min > arr[index]) {
                Min = arr[index];
            }
            // Max += arr[index];
        }
        System.out.println(Min);
    }





    public static int searchElement(int[] arr) {
        int search = 30 ;
        for (int index = 0; index < arr.length; index++) {

            if (search ==  arr[index]) {
                return index;
            }
        }
        return -1;
    }

}
