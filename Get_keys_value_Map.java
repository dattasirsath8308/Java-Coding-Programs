import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Get_keys_value_Map {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("B", "B");
        map.put("D", "H");
        map.put("A", "A");
        map.put("C", "R");
        map.put("E", "T");



        Set<String> keys = map.keySet();
        System.out.println(keys);

        Collection<String> str  =  map.values();
        System.out.println(str);

        String value = map.get("C"); // It will return a value for specified key in this map.
        System.out.println("specific key :  "+value);


        boolean entryKey = map.containsKey("B");
        System.out.println(entryKey);

            


    }

}
