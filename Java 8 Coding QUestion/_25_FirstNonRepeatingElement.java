

/* 
 
input : geeksforgeeks
output : f
 
 */

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class _25_FirstNonRepeatingElement {

    public static void main(String[] args) {
    
        NonRepeatingStringElement();

        NonRepeatingIntegerElement();
        
    }


    public static void NonRepeatingStringElement()
    {
        String str = "geeksforgeeks";

        Map<Character, Long> m = str.chars()
        .mapToObj(ch -> (char)ch)
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


        for (char c : str.toCharArray()) {
            if(m.get(c) == 1)
            {
                System.out.println(c);
                break;
            }
        }
    }



    public static void NonRepeatingIntegerElement()
    {

        int []Arr = {1,2,3,2,1,2,4,5,6,4 } ;


         Map<Integer, Long> collect = Arrays.stream(Arr)
        .boxed()
        .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));


        for (int i : Arr) {
            if(collect.get(i) == 1)
            {
                System.out.println(i);
                break;
            }
        }

    }
    
}
