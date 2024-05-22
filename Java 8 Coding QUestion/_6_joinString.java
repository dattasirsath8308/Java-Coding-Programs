import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
6) Given a list of strings, join the strings with ‘[‘ as prefix, ‘]’ as suffix and ‘,’ as delimiter?

input : "apple", "banana", "cherry"
output : [apple,banana,cherry].
*/

public class _6_joinString {

    public static void main(String[] args) {
        
        joinPreSuf();
        System.out.println("\n----------\n");

        joinPreSufUsingJava8();

    }


    static void joinPreSuf()
    {
        List<String> list = Arrays.asList("apple","banana","cherry");
        
        StringBuffer sb = new StringBuffer();
        sb.append("[");

        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));

            if(i < list.size()- 1)
            {
                sb.append(",");
            }
        }

        sb.append("]");
        System.out.println(sb.toString());
    }
 
    
    static void joinPreSufUsingJava8()
    {
        List<String> list = Arrays.asList("apple","banana","cherry");
        String joinString =  list.stream().collect(Collectors.joining(",","[","]"));
        System.out.println(joinString );
    }

}
