import java.util.StringJoiner;
import java.util.function.ObjDoubleConsumer;

/*

In java 8, a new class StringJoiner is introduced in the java.util package. Using this class we can join more than one strings with the specified delimiter, we can also provide prefix and suffix to the final string while joining multiple strings.

*/

public class _6_StringJoiner {
    
    public static void main(String[] args) {
        
        delimeterJoining();

        System.out.println("\n-----------------------\n");

        prefix_SuffixJoining();

        System.out.println("\n-----------------------\n");

        StringJoinerMethod();
    }


    public static void delimeterJoining()
    {
        // Passing Hyphen(-) as delimiter
        StringJoiner mystring = new StringJoiner("-");    
          
        // Joining multiple strings by using add() method  
        mystring.add("Logan");  
        mystring.add("Magneto");  
        mystring.add("Rogue");  
        mystring.add("Storm");  
                  
        // Displaying the output String
        System.out.println(mystring);  
    }

    
    public static void prefix_SuffixJoining()
    {
        
        /* Passing comma(,) as delimiter and opening bracket
    	 * "(" as prefix and closing bracket ")" as suffix
    	 */
        StringJoiner mystring = new StringJoiner(",", "(", ")");    
          
        // Joining multiple strings by using add() method  
        mystring.add("Negan");  
        mystring.add("Rick");  
        mystring.add("Maggie");  
        mystring.add("Daryl");  
                  
        // Displaying the output String
        System.out.println(mystring);  


        /* Passing hyphen(-) as delimiter and string "pre"
	 * as prefix and string "suff" as suffix
	 */
	StringJoiner myanotherstring = new StringJoiner(", ", "kar", "Mi");    

	myanotherstring.add("Sans");  
	myanotherstring.add("Imp");  
	myanotherstring.add("Jon");  
	myanotherstring.add("Hara"); 

	System.out.println("Second String: "+myanotherstring);


    }


    // setEmptyValue(), length() and toString() methods
    public static void StringJoinerMethod()
    {
        //Comma(,) as delimiter
        StringJoiner mystring = new StringJoiner(",");   
          
        //  Using setEmptyValue() method, we can set the default value of a StringJoiner instance, so if the StringJoiner is empty and we print the value of it, this default value will be displayed
         
        mystring.setEmptyValue("This is a default String");  

        // We have not added any string to StringJoiner yet so this should display the default value of StringJoiner
        System.out.println("Default String: "+mystring); 
         

        // Adding strings to StringJoiner  
        mystring.add("Apple");  
        mystring.add("Banana"); 
        mystring.add("Orange");
        mystring.add("Kiwi");
        mystring.add("Grapes");
        System.out.println(mystring);  
          
        // The length() method of StringJoiner class returns the length of the string (the number of characters in the StringJoiner instance)
         
        int length = mystring.length();  
        System.out.println("Length of the StringJoiner: "+length);  


        // The toString() method is used for converting a StringJoiner instance to a String. 
         
        String s = mystring.toString();  
        System.out.println(s);   


    }
}
