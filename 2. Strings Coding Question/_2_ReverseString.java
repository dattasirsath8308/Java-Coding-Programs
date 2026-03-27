

/*
  2. Write a program to reverse each word  from a String ("hello word" to olleh dlrow ").

 */


public class _2_ReverseString {

    public static void main(String[] args) {
        
        reveseWord();

    }


    public static void reveseWord()
    {
        String str = "hello world";
        // String []word = str.split(" ");
        
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }

        System.out.println(sb.toString().trim());


    }
    
}
