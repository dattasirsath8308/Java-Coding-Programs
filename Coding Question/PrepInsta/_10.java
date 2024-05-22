

/*
Question 10 : Array Subarray
Problem Statement  :

You are given an array, You have to choose a contiguous subarray of length ‘k’, and find the minimum of that segment, return the maximum of those minimums.
Sample input 0 :
1 → Length of segment x =1
5 → size of space n = 5
1 → space = [ 1,2,3,1,2]
2
3
1
2

Sample output :
3
Explanation :
The subarrays of size x = 1 are [1],[2],[3],[1], and [2],Because each subarray only contains 1 element, each value is minimal with respect to the subarray it is in. The maximum of these values is 3. Therefore, the answer is 3



*/


import java.util.*;

public class _10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Length of segment : ");
        int x = sc.nextInt();
        System.out.println("size of space n : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        
        System.out.println(" Enter the Elements : ");

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i <= n - x; i++) {
            min = Integer.MAX_VALUE;
            for (int j = i; j < (i + x); j++)
                min = Math.min(min, arr[j]);
            max = Math.max(min, max);
        }
        System.out.println(max);
    }
}