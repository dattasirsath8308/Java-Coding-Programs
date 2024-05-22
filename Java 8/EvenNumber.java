import java.lang.reflect.Array;
import java.security.Key;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenNumber {
    public static void main(String[] args) {

        int[] arr = { 10, 11, 12, 13, 14, 15, 16 };

        Arrays.stream(arr)
                .filter(n -> n % 2 == 0)
                // .forEach(System.out::println);
                .forEach(n -> System.out.println(n + " "));

        System.out.println();

        Integer[] a = { 10, 20, 21, 23, 25, 27, 28 };
        List<Integer> no = Arrays.asList(a);

        no.stream().filter(n -> n % 2 != 0).forEach(System.out::println);

        System.out.println();

        LinkedHashSet<Integer> lh = new LinkedHashSet<>();
        lh.add(1);
        lh.add(2);
        lh.add(3);
        lh.add(4);
        lh.add(5);

        lh.stream().filter(n -> n % 2 == 0).forEach(n -> System.out.print(n + " "));

        System.out.println();
        System.out.println();

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");

        map.forEach((Key, Value) -> {
            if (Key % 2 == 0) {
                System.out.println(Key);
            }
        });


        System.out.println();
        List<Integer> ll = List.of(2,4,5,6,7,8,2);
        
        List<Integer> num = ll.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());

        System.out.println(num);
    }
}