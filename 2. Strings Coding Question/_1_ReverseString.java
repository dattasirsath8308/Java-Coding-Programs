

/*
  1. Write a program to reverse word order from a String ("hello word" to "word hello").

 */


public class _1_ReverseString {

    public static void main(String[] args) {
        
        reveseWordOrder();

    }


    public static void reveseWordOrder()
    {
        String str = "hello world";
        String []word = str.split(" ");

        StringBuilder sb = new StringBuilder();

        for (int i = word.length - 1; i >= 0; i--) {
               sb.append(word[i]).append(" "); 
        }

        System.out.println(sb.toString().trim());


    }
    
}
