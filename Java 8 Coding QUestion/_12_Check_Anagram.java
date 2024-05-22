import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
12) Java 8 program to check if two strings are anagrams or not?

input : 
    String s1 = "RaceCar";
    String s2 = "CarRace";

output :
     two string are Anagram.

*/

public class _12_Check_Anagram {

    public static void main(String[] args) {

        anagram();

        anagramUsingJava8();


        removeDuplicateElement();

    }

    static void anagram() {

        String s1 = "RaceCar";
        String s2 = "CarRace";


        if(s1.length() != s2.length())
        {
            System.out.println("Both String is not  Anagram");
        }else{

            char[] c1 =  s1.toCharArray();
            char[] c2 =  s2.toCharArray();
            
            // System.out.println(c1);
            // System.out.println(c2);


            Arrays.sort(c1);
            Arrays.sort(c2);

            // System.out.println(c1);
            // System.out.println(c2);


            if(Arrays.equals(c1, c2) == true)
            {
                System.out.println("Both String are Anagram !!");
            }
            else
            {
                System.out.println("Both String are Not Anagram !!");

            }
        }

    }


    static void anagramUsingJava8()
    {
        
        String s1 = "RaceCar";
        String s2 = "CarRace";

        s1 = Stream.of(s1.split("")).map(String::toUpperCase) .sorted().collect(Collectors.joining());

        s2 = Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        

        if(s1.equals(s2))
        {
            System.out.println("both string are anagram");
        }else{
            System.out.println("both string are Not anagram");
        }
    }
}
