import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/*
24) Given a list of strings, find out those strings which start with a number?

intput : "One", "2wo", "3hree", "Four", "5ive", "Six"
output : 
2wo
3hree
5ive

*/

public class _24_StringStartwithNumber {

    public static void main(String[] args) {

        stringStartwithNumber();

        System.out.println("\n-------------\n");

        stringStartwithNumberUsingJava8();

    }

    public static void stringStartwithNumber()
    {

        List<String> inputList = Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "Six");

        
        List<String> result = new ArrayList<>();
        Pattern pattern = Pattern.compile("^[0-9].*");

        for (String str : inputList) {
            if (pattern.matcher(str).matches()) {
                result.add(str);
            }
        }

        for (String str : result) {
            System.out.println(str);

        }

    }

    static void stringStartwithNumberUsingJava8() {
        List<String> listOfStrings = Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "Six");

        listOfStrings.stream().filter(str -> Character.isDigit(str.charAt(0))).forEach(System.out::println);

    }

}
