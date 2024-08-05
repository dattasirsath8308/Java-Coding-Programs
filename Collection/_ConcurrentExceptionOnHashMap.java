import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class _ConcurrentExceptionOnHashMap {

    public static void main(String[] args) {
    
        
        MapWithConcurrentModicationException();



    }
    


    public static void MapWithConcurrentModicationException()
    {

        Map<Integer, String> m = new HashMap<>();
        m.put(1, "One");
        m.put(4, "Four");
        m.put(2, "Two");
        m.put(3, "Three");



        System.out.println(m);


        // iteration 

        Iterator<Map.Entry<Integer,String>> itr = m.entrySet().iterator();

        while (itr.hasNext()) {


            Map.Entry<Integer,String> i = itr.next();

            System.out.println(i.getKey() +" , "+ i.getValue());

            if(i.getKey() % 2 == 0)
            {
                m.put(5, "five");
            }
            
        }

        System.out.println(m);



        

    }
        



}
