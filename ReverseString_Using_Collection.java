
/*

To reverse a string using an `ArrayList` in Java, you can follow these steps:

1. Convert the string to an `ArrayList<Character>`.
2. Reverse the `ArrayList`.
3. Convert the reversed `ArrayList` back to a string.

*/


import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class ReverseString_Using_Collection {
    public static void main(String[] args) {
        String str = "Hello, world!";
        
        // Step 1: Convert string to ArrayList<Character>
        ArrayList<Character> charList = new ArrayList<>();
        for (char c : str.toCharArray()) {
            charList.add(c);
        }
        
        // Step 2: Reverse the ArrayList
        Collections.reverse(charList);
        
        // Step 3: Convert the reversed ArrayList back to a string
        StringBuilder reversedStr = new StringBuilder(charList.size());
        for (char c : charList) {
            reversedStr.append(c);
        }
        
        String reversedString = reversedStr.toString();
        
        // Output the reversed string
        System.out.println("Original string: " + str);
        System.out.println("Reversed string: " + reversedString);



        System.out.println("\n\n Reverse Stack");

        RevString();
    }



    static void RevString()
    {
        String str = "Hey";


        //  Here i will convert String to Character Stack 
        Stack<Character> st = new Stack<>();


        for (char ch : str.toCharArray()) {
            st.add(ch);   
        }

        //  reverse the Stack
        Collections.reverse(st);

        // Convert Revesed  Character stack to String
        StringBuffer sb = new StringBuffer(st.size());
        for (char ch : st) {
            sb.append(ch);
        }

        String rev = sb.toString();
        System.out.println(rev);

    }


}


// This code first converts the string into an `ArrayList<Character>`, then reverses the list using `Collections.reverse()`, and finally converts the reversed `ArrayList` back to a string using a `StringBuilder`.

