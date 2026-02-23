import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Java_8 {
 
    public static void main(String[] args) {
        

        // 2 nd large 

        secondHighest();

        // count_concurrent_char

        count_concurrent_char();

    }
    

    public static void secondHighest(){

        
        List<Integer> numList  = Arrays.asList(10, 20, 50, 40, 30);


        Integer num = numList.stream()
        .sorted(Comparator.reverseOrder())
        .skip(1)
        .findFirst()
        .orElseThrow();


        System.out.println(num);
    }



    public static void count_concurrent_char(){

        String input = "java rocks";

        Map<Character, Long> result = input.replaceAll(" ", "")
        .chars()
        .mapToObj(c -> (char)c)
        .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
    

        System.out.println(result);
    }


}
