
/*

316. Remove Duplicate Letters

Given a string s, remove duplicate letters so that every letter appears once and only once. You must make sure your result is 
the smallest in lexicographical order
 among all possible results.

 

Example 1:

Input: s = "bcabc"
Output: "abc"
Example 2:

Input: s = "cbacdcbc"
Output: "acdb"
 

Constraints:

1 <= s.length <= 104
s consists of lowercase English letters.
 

*/



import java.util.*;

public class _13_String {
    public String removeDuplicateLetters(String s) {
        Stack<Character> stack = new Stack<>();
        int[] lastOccurrence = new int[26];
        boolean[] seen = new boolean[26];
        
        // Store the last occurrence index of each character
        for (int i = 0; i < s.length(); i++) {
            lastOccurrence[s.charAt(i) - 'a'] = i;
        }
        
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            
            // If the current character is already in the stack, skip
            if (seen[currentChar - 'a']) continue;
            
            // Remove characters from the stack if they are greater than the current character and if there are more occurrences later
            while (!stack.isEmpty() && currentChar < stack.peek() && i < lastOccurrence[stack.peek() - 'a']) {
                seen[stack.pop() - 'a'] = false;
            }
            
            stack.push(currentChar);
            seen[currentChar - 'a'] = true;
        }
        
        // Build the result string from the stack
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.insert(0, stack.pop());
        }
        
        return sb.toString();
    }

    public static void main(String[] args) {
        _13_String solution = new _13_String();
        
        // Test cases
        String s1 = "bcabc";
        String s2 = "cbacdcbc";
        
        System.out.println("Input: " + s1);
        System.out.println("Output: " + solution.removeDuplicateLetters(s1));
        
        System.out.println("Input: " + s2);
        System.out.println("Output: " + solution.removeDuplicateLetters(s2));
    }
}
