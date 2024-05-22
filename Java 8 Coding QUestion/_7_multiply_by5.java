import java.beans.IntrospectionException;
import java.security.DrbgParameters.Reseed;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
7) From the given list of integers, print the numbers which are multiples of 5?

input : 45, 12, 56, 15, 24, 75, 31, 89
ouput : 45 , 15 , 75


*/

public class _7_multiply_by5 {

    public static void main(String[] args) {
        

        listOfNumbers();

        System.out.println("\n----------------\n");

        listOfNumbersUsingJava8();

    }


    static void listOfNumbers()
    {
        List<Integer> numList = Arrays.asList( 45, 12, 56, 15, 24, 75, 31, 89);


        for (int i = 0; i <numList.size(); i++) {
            
            if(numList.get(i) % 5 == 0)
            {
                System.out.println(numList.get(i));
            }
        }
    }


    static void listOfNumbersUsingJava8()
    {
        List<Integer> numList = Arrays.asList( 45, 12, 56, 15, 24, 75, 31, 89);

        numList.stream().filter(n -> n % 5 ==0).forEach(System.out::println);
        
        Map<Object,  List<Integer>> result = numList.stream().collect(Collectors.groupingBy(n-> n % 5 == 0, Collectors.toList()));


        System.out.println("\n\n"+result);
    }
    
}
