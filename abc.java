
// Reverse Words in a String with Complex Rules
// Problem: Given a string, reverse each word while keeping the word order intact. Additionally, apply the following rules:If the word has an odd length, convert all vowels (a, e, i, o, u) to uppercase.
// If the word has an even length, reverse the case of all consonants.
// Preserve all spaces exactly as they appear in the original string (e.g., multiple spaces between words).
// Example:
// Input: "Java is great"
// Output: "AVAj SI taErg"
// Constraints:
// The input string may contain multiple spaces between words or trailing spaces.
// You may assume all input characters are ASCII.
// Senior Java_R1_Technical Video Interview_Datta Sirsath

import java.util.Arrays;
import java.util.stream.Stream;

public class abc {

    public static void main(String[] args) {

        String input =  "Java is great"; 
        
        char []ch  = input.toCharArray();

        StringBuffer sb = new StringBuffer(input);

        for (int i = 0; i < args.length; i++) {
            sb.append(ch);     
        } 
       
        System.out.println(sb.reverse());


        




        // input.toCharArray();


        



    }
}
