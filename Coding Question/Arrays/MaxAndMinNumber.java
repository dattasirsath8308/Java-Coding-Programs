
/*
5. Write a Java program to find the maximum and minimum value of an array.

Input : arr = { 1, 2, 5, 6, 10 }
Ouput : minimum number : 1 and maximum number : 10


 */

import java.util.HashSet;

public class MaxAndMinNumber {

    public static void main(String[] args) {

        int[] arr = { 11, 2, 2, 5, 6, 10, 10 };

        System.out.println("------- Max & Min Numbers ----------");
        maxAndMin(arr);

        System.out.println("------- Duplicate Numbers ----------");
        findDuplicateNumber(arr);

        System.out.println("------- Duplicate Numbers using Hashset ----------");
        findDuplicateNumberUsingHashSet(arr);

    }

    static void maxAndMin(int[] arr) {

        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (min > arr[i]) {
                min = arr[i];
            }

            if (max < arr[i]) {
                max = arr[i];
            }
        }

        System.out.println("Max : " + max);
        System.out.println("Min : " + min);

    }

    static void findDuplicateNumber(int[] arr) {

        int duplicate = 0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    duplicate = arr[i];
                    System.out.println("Duplicate No : " + duplicate);
                }

            }
        }
    }

    static void findDuplicateNumberUsingHashSet(int[] arr) {

        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> dupplicate = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {

            if (!hs.add(arr[i])) {

                dupplicate.add(arr[i]);
            }

        }

        for (Integer integer : dupplicate) {
            System.out.println("Duplicate No are : " + integer);
        }

    }

}
