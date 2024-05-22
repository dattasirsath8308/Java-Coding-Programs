import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*

14) Find second largest number in an integer array?
input : 10,20,30,40,50
output : 40


*/

public class _14_Second_largest {

    public static void main(String[] args) {

        secondMax();

        secondMaxUsingJava8();

    }

    static void secondMax() {
        List<Integer> numList = Arrays.asList(10, 20, 30, 40, 50);

        int max = numList.get(0);
        int secondMax = numList.get(0);

        for (int i = 0; i < numList.size(); i++) {

            if (max < numList.get(i)) {
                secondMax = max;
                max = numList.get(i);
            }

            if (secondMax < numList.get(i) && max != numList.get(i)) {
                secondMax = numList.get(i);
            }
        }

        System.out.println("Max : " + max);
        System.out.println("Second Max : " + secondMax);
    }


    static void secondMaxUsingJava8()
    {
        List<Integer> numList = Arrays.asList(10, 30, 20, 80, 50);
        System.out.println(numList);
        int secondMax = numList.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();    
        System.out.println("Second Max "+secondMax);
    }

}
