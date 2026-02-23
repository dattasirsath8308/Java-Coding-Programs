/* 
1.  Find the second highest number from a list
- 5, 9, 2, 11, 4, 11


2. Count occurrences of each word in a string
String input = "apple mango apple orange mango apple";


3. Remove duplicate elements from a list
    Arrays.asList(1,2,2,3,4,4,5);


4. Find first non-repeated character in a string
- aabbcddee


*/

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Practise {


    public static void main(String[] args) {
        
     
       secondHighest();


       // 2. Count occurrences of each word in a string

        count_OccurrencesWord();

        // Remove duplicate elements from a list
   
        System.out.println(" \n ------------- ");
        removeDuplicateElement();
   
        System.out.println(" \n ------------- ");
        firstNonRepeatingCharcter();

    }
    


    // 1. second highest
    public static void secondHighest(){


       List<Integer> arrList  = Arrays.asList(5, 9, 2, 11, 4, 11);


       int secondHighest = arrList.stream()
       .distinct()
       .sorted(Comparator.reverseOrder())
       .skip(1)
       .findFirst()
       .orElseThrow();

       System.out.println("Second Highest No : "+ secondHighest);


    }



    // 2. Count occurrences of each word in a string

    public static void count_OccurrencesWord(){

        String input = "apple mango apple orange mango apple";


        Map<String, Long> result = Arrays.stream(input.split(" "))
        .collect(Collectors.groupingBy(s -> s, Collectors.counting()));        

        System.out.println(result);


    }


    // Remove duplicate elements from a list

    public static void removeDuplicateElement(){

        List<Integer> list = Arrays.asList(1,2,2,3,4,4,5);

        List<Integer> result =list.stream()
        .distinct()
        .collect(Collectors.toList());
        

        System.out.println(result);

    }


    // Find first non-repeated character in a string

    public static void firstNonRepeatingCharcter(){

        String text = "aabbcddee";


       Character nonrepeatingChars = text.chars()
        .mapToObj(ch -> (char)ch)
        .collect(Collectors.groupingBy(c->c, LinkedHashMap::new, Collectors.counting()))
        .entrySet().stream()
        .filter(entry -> entry.getValue() == 1)
        .map(Map.Entry::getKey)
        .findFirst()
        .orElseThrow();


        System.out.println("first non-repeated character : "+ nonrepeatingChars);
    }
}
