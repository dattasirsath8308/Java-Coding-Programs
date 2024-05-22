import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashtableEx {

    public static void main(String[] args) {
        

        Hashtable<Integer, String> ht = new Hashtable(); 


        ht.put(1,"Datta");
        ht.put(2,"Kailas");
        // ht.put(3,null);


        System.out.println(ht);


        LinkedHashMap<Integer,String> hm = new LinkedHashMap<>();
       hm.put(11, "bhau");
       hm.put(null, "aav");
       hm.put(13, null);
       hm.put(null, null);


       System.out.println(hm);


        // ht.remove(3);
        // System.out.println(ht);

        // for (Map.Entry<Integer, String> i  : ht.entrySet()) {
        //     System.out.println(i.getKey() +" : "+ i.getValue());
        // }
 
    }
    
}
