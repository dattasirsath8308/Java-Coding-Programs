import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

// 1. Find the Maximum Element in an Array .
// input : arr = 1 2 3 4 5 7 8
// output : 8 

public class MAXElementArray {

    public static void main(String[] args) {

        maxEleNorm();

        SecondMaxElement();

        MaxElemusingJava8();

    }

    static void MaxElemusingJava8() {

        List<Integer> list = Arrays.asList(1, 2, 34, 5, 6);

        Integer sum = list.stream().max(Integer::compare).get();
        System.out.println(sum);
    }

    public static void maxEleNorm() {

        int[] Arr = { 1, 2, 3, 4, 5, 6 };

        prinArray(Arr);
        int Max = Arr[0];

        for (int i = 0; i < Arr.length; i++) {

            if (Max < Arr[i]) {
                Max = Arr[i];
            }
        }

        System.out.println("Max Eleement is :" + Max);

    }

    public static void SecondMaxElement() {

        int[] Arr = { 1, 2, 3, 4, 5, 6 };

        prinArray(Arr);

        int Highest = Arr[0];
        int SecondHighest = Arr[0];

        for (int i = 0; i < Arr.length; i++) {

            if (Highest < Arr[i]) {
                SecondHighest = Highest;
                Highest = Arr[i];

            } else if (Arr[i] > SecondHighest && Arr[i] != Highest) {
                SecondHighest = Arr[i];
            }
        }

        System.out.println("Second Max Eleement is :" + SecondHighest);

    }

    static void prinArray(int[] Array) {
        for (int i = 0; i < Array.length; i++) {
            System.out.println(Array[i]);
        }
    }
}
