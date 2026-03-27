import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        // Arguments will be read by STDIN
        Scanner s = new Scanner(System.in); // do not change this
        String inputLine = s.nextLine(); // do not change this

        // Your code will be inside this main method
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Remove spaces and convert to lowercase
        String cleanedInput = inputLine.replaceAll("\\s", "").toLowerCase();

        // Traverse the string and store character counts
        for (char c : cleanedInput.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Find the first non-repeating character
        char firstNonRepeatingChar = ' ';
        for (char c : cleanedInput.toCharArray()) {
            if (charCountMap.get(c) == 1) {
                firstNonRepeatingChar = c;
                break;
            }
        }

        System.out.println(firstNonRepeatingChar);
    }
}



