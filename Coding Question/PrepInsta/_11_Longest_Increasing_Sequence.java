
/* 

Input: arr[] = {3, 10, 2, 1, 20}
Output: 3
Explanation: The longest increasing subsequence is 3, 10, 20

Input: arr[] = {3, 2}
Output:1
Explanation: The longest increasing subsequences are {3} and {2}

Input: arr[] = {50, 3, 10, 7, 40, 80}
Output: 4
Explanation: The longest increasing subsequence is {3, 7, 40, 80} 



Let L(i) be the length of the LIS ending at index i such that arr[i] is the last element of the LIS. Then, L(i) can be recursively written as: 

L(i) = 1 + max(L(j) ) where 0 < j < i and arr[j] < arr[i]; or
L(i) = 1, if no such j exists.
Formally, the length of LIS ending at index i, is 1 greater than the maximum of lengths of all LIS ending at some index j such that arr[j] < arr[i] where j < i.




Follow the steps mentioned below to implement the above idea:

Create a recursive function.
For each recursive call, Iterate from the i = 1 to the current position and do the following: 
Find the possible length of the longest increasing subsequence ending at the current position if the previous sequence ended at i.
Update the maximum possible length accordingly.
Repeat this for all indices and find the answer 

*/


// A Naive Java Program for LIS Implementation
import java.io.*;
import java.util.*;

class _11_Longest_Increasing_Sequence {

	// Stores the LIS
	static int max_ref;

	// To make use of recursive calls, this function must
	// return two things: 1) Length of LIS ending with
	// element arr[n-1]. We use max_ending_here for this
	// purpose 2) Overall maximum as the LIS may end with an
	// element before arr[n-1] max_ref is used this purpose.
	// The value of LIS of full array of size n is stored in
	// *max_ref which is our final result
	static int _lis(int arr[], int n)
	{
		// Base case
		if (n == 1)
			return 1;

		// 'max_ending_here' is length of LIS ending with
		// arr[n-1]
		int res, max_ending_here = 1;

		// Recursively get all LIS ending with arr[0],
		// arr[1] ... arr[n-2]. If arr[i-1] is smaller
		// than arr[n-1], and max ending with arr[n-1] needs
		// to be updated, then update it
		for (int i = 1; i < n; i++) {
			res = _lis(arr, i);
			if (arr[i - 1] < arr[n - 1]
				&& res + 1 > max_ending_here)
				max_ending_here = res + 1;
		}

		// Compare max_ending_here with the overall max. And
		// update the overall max if needed
		if (max_ref < max_ending_here)
			max_ref = max_ending_here;

		// Return length of LIS ending with arr[n-1]
		return max_ending_here;
	}

	// The wrapper function for _lis()
	static int lis(int arr[], int n)
	{
		// The max variable holds the result
		max_ref = 1;

		// The function _lis() stores its result in max
		_lis(arr, n);

		// Returns max
		return max_ref;
	}

	// Driver program to test above functions
	public static void main(String args[])
	{
		int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 };
		int n = arr.length;

		// Function call
		System.out.println("Length of lis is "
						+ lis(arr, n));
	}
}
// This code is contributed by Rajat Mishra
