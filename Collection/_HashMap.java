import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import java.util.Map.*;



public class _HashMap {

    public static void main(String[] args) {
        

        HashMap<String,Integer> m = new HashMap<>();

        m.put("One", 1200);
        m.put("Nine", 100);
        m.put("Three", 200);
        m.put("Four", 500);

        System.out.println(m);

        m.put("Eight", 300);
        Set s = m.entrySet();
        System.out.println(s);

        
        ArrayList<String> l = new ArrayList<>(m.keySet()); 
        Collections.sort(l);
         int index = Collections.binarySearch(l, "Nine");
         System.out.println("\n--\n"+index+"\n--\n");


        Iterator<Map.Entry<String,Integer>> itr =   m.entrySet().iterator();

        while (itr.hasNext()) {
            
            Map.Entry<String,Integer> i   = itr.next();
        }



    }
    
}
