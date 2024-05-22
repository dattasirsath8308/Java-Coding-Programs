import java.util.function.Function;

public class Reverse_String {

    public static void main(String[] args) {
    
        
        String original = "Datta BHau";

        

        // 1. Using Loop
        // Reverse_Loop(original);


        // 2. USing Char 
        // reverse_Char(original);


        // 3. Using Recursion
        System.out.println("\nRecursion :"+ reverse_recursion(original));


        //  4. USing StringBuilder
        StringBuilder str = new StringBuilder(original).reverse();
        System.out.println("Stringbuilder reverse : "+str);

        //  5. Using StringBuffer
        StringBuffer str1 = new StringBuffer(original).reverse();
        System.out.println("StringBUffer reverse : "+str1);


        // 6. Using character array
        Reverse_CharArray(original);



        // 7.  Using Lambda Expression 
        reverse_Lambda(original);

        //  8. Using append method of StringBuilder
        
        String result = reverse_append(original);
        
        System.out.println("Original string: " + original);
        System.out.println("Reversed string: " + result);            
        
}

// 1. Using Loop 
    static void Reverse_Loop(String original ) {

        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }
        System.out.println(reversed);
        
    }


    // 2. Using char 

    static void reverse_Char(String original){

        String rev = "";
        for(int i = 0 ; i < original.length() ; i++ )
        {
            char ch ='\0';
            ch = original.charAt(i);
            rev = ch + rev;
            
        }

        System.out.println("Reverse String is : \n"+rev);
    }


    // 3.  Using recursion

    public static String reverse_recursion(String str) {
        // System.out.println(str.substring(1) + str.charAt(0));
        
        if (str.isEmpty()) {
            return str;
        } else {
            return reverse_recursion(str.substring(1)) + str.charAt(0);
        }

    }


    // 6. Using char Array 
    
      static void Reverse_CharArray(String original){

        char ch[] = original.toCharArray();
        int start = 0 ;
        int end = original.length() -1 ;


        while(start < end)
        {
            char temp  = ch[start];
            ch[start] =  ch[end] ;
            ch[end] = temp; 
            start++;
            end--;
        }



        String result = new String(ch);

        System.out.println("Using char Array : "+result);
    }
   

    


    //  7. Using Lambda 

    static void reverse_Lambda(String original){

        Function<String, String> lamda = e -> new StringBuilder(e).reverse().toString();
        String strRev =  lamda.apply(original);
        System.out.println("Reverse USing Lambda : "+strRev);
    }



    // 8. 

    public static String reverse_append(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}
