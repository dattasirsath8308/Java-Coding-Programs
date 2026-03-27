import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class ReverseUsingAL_Stack {

    public static void main(String[] args) {

        reverseUsingArrayList();

        System.out.println();

        reverseUsingStack();

    }

    /*
     * To reverse a string using an `ArrayList` in Java, you can follow these steps:
     * 
     * 1. Convert the string to an Character List `ArrayList<Character>`.
     * 2. Reverse the `ArrayList`.
     * 3. Convert the reversed `ArrayList` back to a string.
     * 
     */

    static void reverseUsingArrayList() {

        String str = "Datta";

        List<Character> charList = new ArrayList<>();
        for (char ch : str.toCharArray()) {
            charList.add(ch);
        }

        Collections.reverse(charList);

        StringBuilder sb = new StringBuilder(charList.size());
        for (char ch : charList) {
            sb.append(ch);
        }

        String revString = sb.toString();

        System.out.println("Original string: " + str);
        System.out.println("Reversed string: " + revString);

    }



    static void reverseUsingStack()
    {

        String str1 = "Love Day";

        Stack<Character> charStack = new Stack();
        for (char ch : str1.toCharArray()) {
            
            charStack.add(ch);
        }

        Collections.reverse(charStack);


        StringBuilder sb = new StringBuilder(charStack.size());
        for (char ch : charStack) {
            sb.append(ch);
        }

        String revString = sb.toString();

        System.out.println("Original string: " + str1);
        System.out.println("Reversed string: " + revString);


    }


}
