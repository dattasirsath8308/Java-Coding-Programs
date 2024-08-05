
// 	 Take one Map and sorted element using java 8 and Iterate that element print element.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Sort_Iterate_Map {



    public static void main(String[] args) {
        
        
        Map<Integer, String> m = new LinkedHashMap<>();
        m.put(4, "Four");
        m.put(5, "Five");
        m.put(2, "Two");
        m.put(1, "One");

        System.out.println(m);
 

        // Sorting Using Java 8 

        Map<Integer,String> sortedMap = m.entrySet().stream()
        .sorted(Map.Entry.comparingByKey())
        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2) -> e1, LinkedHashMap::new));

        System.out.println("\nSorted Map using Java 8 : "+sortedMap);



        // Sorting without Java 8 

        System.out.println("\n Sorting without Java 8 \n");
        List<Map.Entry<Integer,String>> list = new ArrayList<>(m.entrySet());

        bubbleSort(list);


        for (Entry<Integer,String> entry : list) {
            System.out.println(entry.getKey() + " : " + entry.getValue());

        }
        
        // Iteation

        Iterator<Map.Entry<Integer, String>> itr =  sortedMap.entrySet().iterator();
        while (itr.hasNext()) {

            Map.Entry<Integer,String> i = itr.next();
            System.out.println("Key is "+ i.getKey() +" , Value is :"+i.getValue());
            
        }


        
    }

    public static void bubbleSort(List<Map.Entry<Integer,String>> l)
    {

        int n = l.size();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1 ; j++) {
                
                if(l.get(j).getKey().compareTo(l.get(j+ 1).getKey()) > 0)
                {
                    // swap
                    Map.Entry<Integer,String> temp =  l.get(j);
                    l.set(j, l.get(j + 1));
                    l.set(j + 1, temp);
                }

            }
        }



    }
}
