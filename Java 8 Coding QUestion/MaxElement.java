import java.util.Arrays;
import java.util.Comparator;

public class MaxElement {

    public static void main(String[] args) {

        MaxElement();

        SecondHighestUsingJava8();

    }

    static void MaxElement() {

        int[] arr = { 10, 20, 40, 30, 80, 50 };

        int Max = 0;
        int secondMax = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > Max) {
                secondMax = Max;
                Max = arr[i];

            }

            if (secondMax < arr[i] && arr[i] != Max) {
                secondMax = arr[i];
            }

        }
        System.out.println("Highest : "+Max);
        System.out.println("Second Highest : "+secondMax);

    }

    static void SecondHighestUsingJava8()
    {
        int[] arr = { 10, 20, 40, 30, 80, 50 };

        Integer integer = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();

        System.out.println("Second Highest : "+integer);
    }

}
