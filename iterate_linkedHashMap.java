import java.security.KeyStore.Entry;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class iterate_linkedHashMap {

    public static void main(String[] args) {

        LinkedHashMap<Character, String> lhmap = new LinkedHashMap<>();
        lhmap.put('R', "Red");
        lhmap.put('G', "Green");
        lhmap.put('B', "Brown");
        lhmap.put('O', "Orange");
        lhmap.put('P', "Pink");

        System.out.println("Entries in LinkedHashMap lhmap: " + lhmap);

        Iterator<String> itr3 = lhmap.values().iterator(); // values is a method that is used to get values of keys of a
                                                           // linked hash map.
        System.out.println("Iterating Values of LinkedHashMap");
        while (itr3.hasNext()) {
            Object valuesView = itr3.next();
            System.out.println(valuesView);
        }


        Iterator<Character> itr2 = lhmap.keySet().iterator(); // keySet is a method that is used to get view of keys of a linked hash map.
        System.out.println("Iterating Keys of LinkedHashMap");
        while(itr2.hasNext())
        {
          Object keyView = itr2.next();
          System.out.println(keyView);
        }
        System.out.println("\n");

        
        // Iterator<Entry<Character, String>> itr = lhmap.entrySet().iterator();

        // System.out.println("Iterating Entries of LinkedHashMap");
        // while(itr.hasNext())
        // {
        // Object key = itr.next();
        // System.out.println(key);
        // }
        // System.out.println("\n");

    }

}
