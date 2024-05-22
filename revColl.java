import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Stack;

public class revColl {

    public static void main(String[] args) {


        String str= "Datta";






        // 1. String to Character Arraylist
        ArrayList<Character> charList = new ArrayList<>();
        for (Character character : str.toCharArray()) {
            charList.add(character);
        }


        // 2. Reverse
        Collections.reverse(charList);
        
        // 3. Convert Revese to string
        StringBuffer revstr = new StringBuffer(charList.size());
        for (Character character : charList) {
            revstr.append(character);
        }

        String rev = revstr.toString();

        System.out.println("Original :"+str);
        System.out.println("reverse :"+rev);
        







        System.out.println("Reverse Using Linkedlist");

        String str1 = "Nagesh";


        // String to Character 
        LinkedList<Character> ll = new LinkedList<>();
        for (Character character : str1.toCharArray()) {
                ll.add(character);
        }   


        //  reverse
        Collections.reverse(ll);

        // convert to reverse to String
        StringBuffer st = new StringBuffer(ll.size());
        for (Character character : ll) {
            st.append(character);
        }

        String revers = st.toString();
        System.out.println("Original "+str1);
        System.out.println("Reverse "+revers);







        Stack<String> stack = new Stack<>();
        stack.add("H");
        stack.add("E");
        stack.add("L");
        stack.add("L");
        stack.add("o");


        System.out.println("\n Before Rev : "+stack);

        Collections.reverse(stack);
        System.out.println("\n After Rev : "+stack);
        

        System.out.println("-----------");

        String str3 = "Kam";
        Stack<Character> st1 =  new Stack<>();
        for (Character character : str3.toCharArray()) {
            st1.add(character);
        }


        Collections.reverse(st1);


        StringBuilder sb1 = new StringBuilder(st1.size());
        for (Character character : st1) {
            sb1.append(character);
        }

        String reverse1 = sb1.toString();
        System.out.println("Original "+str3);
        System.out.println("Reverse "+reverse1);

        
    }
    
}





/* 

        String str = "Datta";


        //1.  String to Arraylist Character Array
        ArrayList<Character> list = new ArrayList<>();
        for (Character character : str.toCharArray()) {
            list.add(character);
        }

        //2. Reverse the list
        Collections.reverse(list);

        // 3. Convert reversed Arraylist to String
        StringBuilder reversedStr =  new StringBuilder(list.size());
        for (Character character : list) {
            reversedStr.append(character);
        }

        String reverseString =  reversedStr.toString();

        System.out.println("Original : "+ str);
        System.out.println("Reverse  : "+ reverseString);


        
*/