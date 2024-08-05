import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/*
18) Reverse each word of a string using Java 8 streams?
input : Java Concept Of The Day
output : avaJ tpecnoC fO ehT yaD

*/

public class _18_ReverseEachWord {

    public static void main(String[] args) {

        reverseEachWord();

        System.out.println("\n------------\n");
        
        reverseEachWordUsingJava8();

    }

    static void reverseEachWord() {


        String str = "Java Concept Of The Day";

        String [] words = str.split(" ");

        String revString = " ";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String revWord = " ";

            for (int j = word.length() -1 ; j >= 0 ; j--) {
                revWord = revWord + word.charAt(j);
            }            

            revString = revString + revWord +" ";
        }

        System.out.println(str);
        System.out.println(revString);

    }

    static void reverseEachWordUsingJava8() {
        String str = "Java Concept Of The Day";

        String revStr = Arrays.stream(str.split(" ")).map(e -> new StringBuffer(e).reverse())
                .collect(Collectors.joining(" "));


        System.out.println(revStr);

    }

}
