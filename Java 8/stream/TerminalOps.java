import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TerminalOps {

    public static void main(String[] args) {
        

        List<Integer> list = Arrays.asList(1,2,3);

        // 1. collect
        list.stream().skip(1).collect(Collectors.toList());


        // 2. forEach
        list.forEach(x -> System.out.println(x));
        
        
        // 3. reduces : combine elemets to product a single result.
        Optional<Integer> optionalValue = list.stream().reduce((x,y) -> x + y);
        Optional<Integer> optionalValue2 = list.stream().reduce(Integer::sum);
        
        System.out.println(optionalValue.get());
        System.out.println(optionalValue2.get());

        // 4. count 

        // 5. anyMatch , allMatch, noneMatch

        boolean b = list.stream().anyMatch(x -> x % 2 == 0);
        System.out.println(b);


        boolean c = list.stream().allMatch(x -> x > 0);
        System.out.println(c);


        boolean d = list.stream().noneMatch(x -> x < 0);
        System.out.println(d);


        // 6. findFirst, findAny 
        Optional<Integer> findFirst = list.stream().findFirst();
        System.out.println(findFirst.get());
        

        
        Optional<Integer> findAny = list.stream().findAny();
        System.out.println(findAny.get());


        // Example : Squaring and Sorting numbers

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        List<Integer> squareNumList =numbers.stream().map(x -> x * x).sorted(Comparator.reverseOrder()).toList();
        System.out.println("square & Sort : " +squareNumList);


        // Summing values 
        long sumNumList =numbers.stream().reduce(Integer::sum).get();
        System.out.println("Summing  : " +sumNumList);


        // Counting Occurance of a character 
        String sentences = "Hello world"; 
        
        Map<Character, Long> map = sentences.chars()
        .mapToObj(ch -> (char) ch )
        .filter(ch -> ch != ' ')
        .collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));

        System.out.println("Counting Occurance  : " +map);

        




    }

}
