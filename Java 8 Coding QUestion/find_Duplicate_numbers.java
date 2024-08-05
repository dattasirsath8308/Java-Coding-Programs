import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class find_Duplicate_numbers {

    public static void main(String[] args) {
        
        int a[] = { 1, 4, 5, 2, 12, 34, 2, 11 };

        findDuplicateElementInArrayUsing8(a);

    }


    static void findDuplicateElementInArrayUsing8(int[] arr)
    {
        System.out.println("Before Duplicate Find : ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        Map<Integer, Long> collect = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))   ;

        System.out.println(collect);


    }
    
}
