import java.security.cert.TrustAnchor;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle.Control;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
4) How do you find frequency of each element in an array or a list?

input :  datta
output : d=1 , a =2 , t = 2

Input: arr[] = {10,5,10,15,10,5};
Output: 10 : 3 , 5 : 2 times, 15 :  1




*/

public class _4_CountFreqElement {

    public static void main(String[] args) {

        CountArrayOccurance();

        System.out.println("\n----------------\n");

        CountArrayOccuranceUsingJava8();

        System.out.println("\n----------------\n");

        CountStringOccurance();

        System.out.println("\n----------------\n");

        // CountStringOccurance2();



    }

    public static void CountArrayOccurance() {
        int arr[] = { 10, 5, 10, 15, 10, 5, 2 };
        int n = arr.length;

        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (visited[i] == true)
                continue;

            int count = 1;
            for (int j = i + 1; j < visited.length; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " : " + count);
        }

    }

    public static void CountArrayOccuranceUsingJava8() {

        Integer[] numbersArray = { 1, 2, 3, 4, 1, 2, 3, 4, 5 };

        // Find frequency in array
        Map<Integer, Long> frequencyArray = Arrays.stream(numbersArray)
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()));

        List<Integer> numbers = Arrays.asList(10, 5, 10, 15, 10, 5, 2);

        Map<Integer, Long> freqList = numbers.stream().collect(Collectors.groupingBy(i -> i, Collectors.counting()));

        System.out.println("Frequency in array: " + frequencyArray);
        System.out.println("Frequency in list: " + freqList);
    }



    static void CountStringOccurance()
    {

        List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");

        Map<String, Long> StringOccuranceCount = stationeryList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(StringOccuranceCount);

    }

  
}
