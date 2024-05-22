import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/*

2) How do you remove duplicate elements from a list using Java 8 streams?

Input : 1, 1, 2, 2, 3, 4, 4, 5, 6, 6, 6, 7
output : 1,2, 3,4, 5, 6, 7

*/


public class _2_RemoveDuplicateElement {
    public static void main(String[] args) {
        
        // 1. 
        removeDuplicatesUsingJava8();
        System.out.println("\n\n-------------");


        // 2.

        String[] words = {"apple", "banana", "apple", "orange", "banana", "grape", "pear"};
        Arrays.sort(words);
        int newString = removeDuplicateStringElement(words);
        System.out.println("Array String Without Duplicate : "+ Arrays.toString(Arrays.copyOf(words, newString)));
        System.out.println("\n\n------------------------");

        // 3.

        removeDuplicateStringElement();
        System.out.println("\n\n------------------------");

        // 4. 
        //  Here will be sorted 
        int[] numbers = {1, 1, 2, 2, 3, 4, 4, 5, 6, 6, 6, 7};
        int newLength = removeDuplicates(numbers);
        System.out.println("Array without duplicates: " + Arrays.toString(Arrays.copyOf(numbers, newLength)));
        



    }


    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int uniqueIndex = 1; // Start from the second element

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[uniqueIndex] = nums[i];
                uniqueIndex++;
            }
        }
        return uniqueIndex;
    }



    public static void removeDuplicatesUsingJava8()
    {
        List<Integer> number = Arrays.asList(1, 1, 2, 2, 3, 4, 4, 5, 6, 6, 6, 7);
        number.stream().distinct().forEach(System.out::println) ;
    }



    public static int removeDuplicateStringElement(String[] nums)
    {
        if (nums.length == 0) return 0;

        int uniqueIndex = 1; // Start from the second element

        for (int i = 1; i < nums.length; i++) {
            if (!nums[i].equals( nums[i - 1])) {
                nums[uniqueIndex] = nums[i];
                uniqueIndex++;
            }
        }
        return uniqueIndex;

    }


    
    static void removeDuplicateStringElement()
    {
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
        System.out.println("Before removed duplicate :"+listOfStrings);
        List<String> uniqueElement = listOfStrings.stream().distinct().collect(Collectors.toList());

        System.out.println("Removed Duplicate : "+uniqueElement);

    }

}



