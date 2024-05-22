import java.util.Arrays;
import java.util.List;

public class Stream_ {

    public static void main(String[] args) {

        filterMethod();

        
        System.out.println();
        mapMethod();
    
        System.out.println();
        limitMethod();


        System.out.println();
        skipMethod();

        System.out.println();
        sortedMethod();

        System.out.println();
        distinctMethod();


    
    
    }

    static void filterMethod() {
        List<String> strings = Arrays.asList("Hollis", "", "HollisChuang", "H", "hollis");
        strings.stream().filter(string -> !string.isEmpty()).forEach(System.out::println);
        // Hollis, , HollisChuang, H, hollis
    }


    static void mapMethod()
    {
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        numbers.stream().map(i -> i * i).forEach(System.out::println);
    }


    static void limitMethod()
    {
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        numbers.stream().limit(4).forEach(System.out::println);
    }

    static void skipMethod()
    {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        numbers.stream().skip(3).forEach(System.out::println);
    }


    static void sortedMethod()
    {
        List<Integer> numbers = Arrays.asList(1,2,10,8,44,3,4,5,6);
        numbers.stream().sorted().forEach(System.out::println);
    }


    static void distinctMethod()
    {
        List<Integer> numbers = Arrays.asList(1,2,2,5,6,3,4,5,6);
        numbers.stream().distinct().forEach(System.out::println);
    }

}
