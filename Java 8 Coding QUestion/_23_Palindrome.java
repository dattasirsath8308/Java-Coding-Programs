import java.util.stream.IntStream;

/*
23) Palindrome program using Java 8 streams
output : ROTATOR is a palindrome

*/


public class _23_Palindrome {

    public static void main(String[] args) {
        
        palindrome();

        System.out.println("\n-----------\n");

        palindromeUsingJava8();

        System.out.println("\n-----------\n");

        isPalindromeUsingJava8();

    }


    static void  palindrome()
    {
        String str = "Nayan";

        str = str.toLowerCase();
        char ch ;
        String rev = "";

        
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            rev =   ch + rev;

        }

        // Way 2
        // for (int i = str.length() - 1; i >= 0; i--) {
        //     rev = rev + str.charAt(i);
        // }

        // Way 3
        // for (int i = 0; i < n/2; i++)
        // if (str.charAt(i) != str.charAt(n-i-1))
        //     return false;

        // return true;


        System.out.println("Reverse is : "+rev);

        if(str.equals(rev))
        {
            System.out.println("Pallindrom");
        }else
        {
            System.out.println("Not Pallindrom");
        }

    }


    static void palindromeUsingJava8()
    {
       
        String str = "ROTATOR";
        int n = str.length();
         
        boolean isItPalindrome = IntStream.range(0, n/2).
                noneMatch(i -> str.charAt(i) != str.charAt(n - i -1));
          
        if (isItPalindrome)
        {
            System.out.println(str+" is a palindrome");
        }
        else
        {
            System.out.println(str+" is not a palindrome");
        }
    }


    static void isPalindromeUsingJava8()
    {
        String input = "Nayan";
        
        // Clean the input by removing spaces and converting to lowercase
        String cleanStr = input.replaceAll("\\s", "").toLowerCase();

        int n = cleanStr.length();

        boolean isItPalindrome =  IntStream.range(0, n/2).allMatch(i -> cleanStr.charAt(i) == cleanStr.charAt(n - i - 1));

        if(isItPalindrome)
        {
            System.out.println(input+" is a palindrome");
        }
        else
        {
            System.out.println(input+" is not a palindrome");
        }

    }

    
}
