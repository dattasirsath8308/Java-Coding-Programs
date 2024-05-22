import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
1) Given a list of integers, separate odd and even numbers?


Input :  71, 18, 42, 21, 67, 32, 95, 14, 56, 87
Output : 

Odd Numbers 
71 
21
67
95
87
————–
Even Numbers
————–
18
42
32
14
56

*/

public class _1_SeperateEvenAndOdd {

    public static void main(String[] args) {

        EvenAndOdd();

        System.out.println("\n---------\n");
        sepearateEvenAndOddUsingJava8();


        System.out.println("\n---------\n");
        SeparateOddEvenFilter();

    }

    static void EvenAndOdd() {
        int[] Arr = { 10, 25, 35, 40, 45, 50, 52 };

        for (int i = 0; i < Arr.length; i++) {

            if (Arr[i] % 2 == 0) {
                System.out.println("Even : " + Arr[i]);                
            } else {
                System.out.println("Odd :  " + Arr[i]);
            }
        }

    }

    public static void sepearateEvenAndOddUsingJava8() {
        List<Integer> list = Arrays.asList(10, 25, 35, 40, 45, 50, 52);

        Map<Boolean, List<Integer>> mPartitioned = list.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));

        List<Integer> even = mPartitioned.get(true);
        List<Integer> Odd = mPartitioned.get(false);


        System.out.println("Even Number :  "+  even);
        System.out.println("Odd Number :  "+  Odd);
        
    }



    public static void SeparateOddEvenFilter()
    {
            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    
            List<Integer> evens = numbers.stream()
                                         .filter(n -> n % 2 == 0)
                                         .collect(Collectors.toList());
    
            List<Integer> odds = numbers.stream()
                                        .filter(n -> n % 2 != 0)
                                        .collect(Collectors.toList());
    
            System.out.println("Even Numbers: " + evens);
            System.out.println("Odd Numbers: " + odds);
    }

}
