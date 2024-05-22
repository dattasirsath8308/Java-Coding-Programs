/*

Here is a simple Java program that rearranges the elements of an array in the pattern: first element, last element, second element, second last element, and so on:


Input :
Original array: [1, 2, 3, 4, 5, 6, 7]

Output : 
Rearranged array: [1, 7, 2, 6, 3, 5, 4]

*/


import java.util.Arrays;

public class ArrayRearrangement {

    public static int[] rearrangeArray(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];

        int left = 0;
        int right = n - 1;
        int index = 0;

        while (left <= right) {
            if (left == right) {
                result[index++] = arr[left];
            } else {
                result[index++] = arr[left];
                result[index++] = arr[right];
            }
            left++;
            right--;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int[] rearrangedArr = rearrangeArray(arr);
        
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Rearranged array: " + Arrays.toString(rearrangedArr));
    }
}
