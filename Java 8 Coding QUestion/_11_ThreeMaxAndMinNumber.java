import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*

11) How do you get three maximum numbers and three minimum numbers from the given list of integers?

input : 45, 12, 56, 15, 24, 75, 31, 89
output : Minimum 3 Numbers
—————–
12
15
24
—————–
Maximum 3 Numbers
—————–
89
75
56


*/

public class _11_ThreeMaxAndMinNumber {

    public static void main(String[] args) {

        get3maxAndMin();

        System.out.println("\n--------------\n");

        get3maxAndMinUsingJava8();

    }

    static void get3maxAndMin() {
        List<Integer> numList = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        Collections.sort(numList);

        List<Integer> maxThree = numList.subList(0, 3);

        // 8-3 = 5 , 8
        List<Integer> minThree = numList.subList(numList.size() - 3, numList.size());

        System.out.println("Maximum Three Element");
        for (Integer integer : maxThree) {
            System.out.println(integer);

        }

        System.out.println("Minimum Three Element");
        for (Integer integer : minThree) {
            System.out.println(integer);
        }
    }


    static void get3maxAndMinUsingJava8()
    {

        List<Integer> numList = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        System.out.println("Maximum 3 Element");
        numList.stream().sorted().limit(3).forEach(System.out::println);

        System.out.println("\nMinimum 3 Element");
        numList.stream().sorted(Collections.reverseOrder()).limit(3).forEach(System.out::println);

    }
    

}
