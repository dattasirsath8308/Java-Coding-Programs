import java.util.stream.Collectors;

/*
3) How do you find frequency of each character in a string using Java 8 streams?

input : datta
output : d=1 , a =2 , t = 2



*/

public class _3_freqOfEachCharacter {

    public static void main(String[] args) {

        countFreq();

        System.out.println("\n--------------\n");

        countFreqUsingJava8();

    }

    static void countFreq() {
        String str = " My Name datta bhau";

        // counter array to store frequency of each character
        int[] frequency = new int[256];

        for (int i = 0; i < str.length(); i++) {

            // increasing freq count by 1 ;
            frequency[str.charAt(i)]++;
        }

        // for (int i : frequency) {
        for (int j = 0; j < frequency.length; j++) {

            // freq array is not empty
            if (frequency[j] != 0) {
                System.out.println((char) j + " : " + frequency[j]);
            }
        }
    }

    static void countFreqUsingJava8() {

        String str = " My Name datta bhau";

        str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .forEach((c, noOftime) -> System.out.println(c + ": " + noOftime));

    }
}
