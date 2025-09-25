
/* 
 Find the missing number. Given an array of non-duplicating numbers from 1 to n where one number is missing, write an efficient Java program to find it.


Input: arr = [1, 2, 4, 5, 6]
n = 6
Output: 3



 */

public class MissingNumber {

    public static void main(String[] args) {
        

        int []Arr = {1,2,4,5,6};

        MissingNumber(Arr);

        

    }



    static void MissingNumber(int []Arr){


        int n = Arr.length + 1;
        int expectedSum = n * (n + 1) / 2; 
        int actualSum = 0;

        // for (int i = 0; i < Arr.length; i++) {
            
        //     actualSum = actualSum + Arr[i]; 
        // }

        for (int i : Arr) {
            actualSum += i;
        }
        
        int missingNo = expectedSum - actualSum ;
        

        System.out.println("Expected Sum  :"+ expectedSum);
        System.out.println("Sum  :"+ actualSum);
        System.out.println("Missing No is :"+ missingNo);
        

    }

}
