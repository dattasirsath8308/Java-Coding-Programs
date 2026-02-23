// 4. Remove all duplicate elements from given array
// Ex: Input = {5,2,6,8,6,7,5,2,8}
// Output = {2,5,6,7,8}

import java.util.Arrays;

public class removeDuplicateElement {

    public static void main(String[] args) {

        int[] input = { 5, 2, 6, 8, 6, 7, 5, 2, 8 };

        System.out.println("before sort & remove duplicate elements : ");
        for (int i : input) {
            System.out.print(i + " ");
        }

        System.out.println("\n1. using Java 8 :\n");
        removeDuplicateUsingJava8(input);

        System.out.println("\n2. using inbuild method :");
        removeDuplicateUsingSortedMethod(input);

        System.out.println("\n\n3. without using inbuild method :");
        removeDuplicateWithoutInbuild(input);

    }

    // 1. Java 8
    public static void removeDuplicateUsingJava8(int[] arr) {

        int[] sortedArray = Arrays.stream(arr)
                .distinct()
                .sorted()
                .toArray();

        // for (int sortedArray2 : sortedArray) {
        // System.out.print(sortedArray2 +" ");
        // }

        System.out.println(Arrays.toString(sortedArray));

    }

    // 2. Using sorted method
    public static void removeDuplicateUsingSortedMethod(int[] arr) {

        // sort
        Arrays.sort(arr);

        System.out.println("\nAfter sorting : ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        // remove duplicate

        System.out.println("\nRemoved duplicate element  : ");
         for(int i = 0; i < arr.length; i++){
            
            if(i == 0 || arr[i] != arr[i - 1]){
                System.out.print(arr[i] + " ");
            }
        }
    }


    // 3. Without using inbuild method
    public static void removeDuplicateWithoutInbuild(int []arr){

        int n = arr.length;

        // 1. sort the array
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n- i - 1; j++) {

                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j + 1]; 
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("After Sorting");
        for (int i : arr) {
            System.out.print(i +" ");
        }


        System.out.println("\nremoved Duplicate");
        for (int i = 0 ;i < n ; i++) {

            if(i == 0 || arr[i] != arr[i -1]){
                System.out.print(arr[i]+" ");
            }
        }

    }
}
