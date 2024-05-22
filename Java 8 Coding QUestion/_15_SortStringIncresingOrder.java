import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import javax.smartcardio.CommandAPDU;

/*
15) Given a list of strings, sort them according to increasing order of their length?

input : "Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C"
output : 
C
C#
C++
Java
HTML
COBOL
Python
Kotlin

*/

public class _15_SortStringIncresingOrder {
    
    public static void main(String[] args) {
        
        sortIncreasingOrder();

        System.out.println("\n--------------\n");
        sortIncreasingOrderUsingJava8();
    }

    static void sortIncreasingOrder()
    {
        String arr[] = { "Datta", "I", "Bhau","Sirsath", "am" };
        for (String string : arr) {
            System.out.print(string+", ");
        }

        System.out.println();
        
        Arrays.sort(arr,Comparator.comparing(s->s.length()));

        for (String string : arr) {
            System.out.println(string);
        }

    }

    static void sortIncreasingOrderUsingJava8()
    {
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");

        listOfStrings.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);

    }
}
