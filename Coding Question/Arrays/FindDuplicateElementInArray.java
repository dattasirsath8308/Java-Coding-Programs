// java program to find duplicate elements in an array using hashset. 

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElementInArray {

    
    public static void main(String[] args) {
        
        int[] arr =  {10, 5, 10, 34, 24, 90, 24, 70, 100, 102, 100};


        Set<Integer> hs = new HashSet<>();


        for(int num : arr){

            if(!hs.add(num)){
                System.out.println("Duplicate Element :"+ num);
            }

        }

    }

}
