/*

1. find the sum of numbers from a list: 10,20,30 list using java 8 ?
2. calculate the frequency of numbers 1,2,3,1,2,3 using java 8 ?
3. Using Java 8, define a list with the words Datta, Datta and calculate the word frequency using a Map ?
4. Given a list of numbers such as {1, 2, 3, 1, 2}, write a Java 8 program to identify the duplicate numbers and count their frequencies using a Map




*/

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ask_Interview_Coding_Que {

    public static void main(String[] args) {

        sumOfNumbers();

        calculateFrequencyOfNumbers();

        listFrequencyUsingMap();

        findDuplicateAndFrequencyOfNumbers();

        duplicateNumbers();

    }

    public static void sumOfNumbers() {

        System.out.println("find the sum of numbers from a list: 10,20,30 list using java 8 ?\n");

        List<Integer> list = Arrays.asList(10, 20, 30);

        int sum = list.stream()
                .mapToInt(n -> n)
                .sum();

        System.out.println("Sum = " + sum);
    }

    public static void calculateFrequencyOfNumbers() {

        System.out.println("\n2. calculate the frequency of numbers 1,2,3,1,2,3 using java 8 ?\n");

        List<Integer> list = Arrays.asList(1, 2, 3, 1, 2, 3);

        Map<Integer, Long> freqMap = list.stream()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()));

        System.out.println(freqMap);

    }

    public static void listFrequencyUsingMap() {

        System.out.println(
                "\n3. Using Java 8, define a list with the words Datta, Datta and calculate the word frequency using a Map ?\n");

        List<String> words = Arrays.asList("Datta", "Datta");

        // Frequency using groupingBy + counting
        Map<String, Long> freqMap = words.stream()
                .collect(Collectors.groupingBy(w -> w, Collectors.counting()));

        System.out.println(freqMap);
    }

    public static void findDuplicateAndFrequencyOfNumbers() {

        System.out.println(
                "\n4. Given a list of numbers such as {1, 2, 3, 1, 2}, write a Java 8 program to identify the duplicate numbers and count their frequencies using a Map\r\n"
                        + //
                        "\n");

        List<Integer> numbers = Arrays.asList(1, 2, 3, 1, 2);

        // Count frequency of each number
        Map<Integer, Long> freqMap = numbers.stream()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()));

        // Filter only duplicates (frequency > 1)
        Map<Integer, Long> duplicates = freqMap.entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()));

        System.out.println("All Frequencies : " + freqMap);
        System.out.println("Duplicate Numbers : " + duplicates);

        System.out.println("\n2nd Simple Ways \n");

        List<Integer> list = Arrays.asList(1, 2, 3, 1, 2);

        Map<Integer, Long> freq = list.stream()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()));

        freq.forEach((num, count) -> {
            if (count > 1) {
                System.out.println(num + " = " + count);
            }
        });

    }


    public static void duplicateNumbers() {

        System.out.println(
                "\n5. Given a list of numbers such as {1, 2, 3, 1, 2}, write a Java 8 program to identify the duplicate numbers \r\n"
                        + //
                        "\n");

        List<Integer> list = Arrays.asList(1, 2, 3, 1, 2);

        List<Integer> duplicates = list.stream()
                .filter(n -> Collections.frequency(list, n) > 1)
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Duplicate Numbers : " + duplicates);

    }




}
