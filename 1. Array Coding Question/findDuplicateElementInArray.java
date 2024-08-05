/*  
Question : find the duplicate element from unsorted Arrays 
input : 10,20,30,40,50,50,60,40
output :  40,50

*/

import java.util.Arrays;

public class findDuplicateElementInArray {

    public static void main(String[] args) {
        

        int []arr = {10,20,30,40,50,50,60,40}; // 40,50   : Duplicates

        Arrays.sort(arr);
        int length = arr.length;

        System.out.println("Duplicates Element are : ");
        for (int i = 1; i < length-1; i++) {
            
            if(arr[i] == arr[i - 1])
            {
                System.out.println(arr[i]);
            }

        }


    }
    
}
