import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Duplicate_Character {

    
    public static void main(String[] args) {
        

        String input =  "programming";

        findDuplicateCharacter(input);
    }


    static void findDuplicateCharacter(String input){


        Map<Character, Long> duplicateChars = input.chars()
        .mapToObj(ch -> (char) ch)
        .collect(Collectors.groupingBy(
            Function.identity(),
            Collectors.counting()
        ));



        duplicateChars.entrySet().stream()
        .filter(no -> no.getValue() > 1)
        .forEach(e -> System.out.println(e.getKey() +" : "+ e.getValue()));

    }

}
