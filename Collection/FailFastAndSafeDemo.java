import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastAndSafeDemo {
    
    public static void main(String[] args) {

        
        // List<String> list = new ArrayList<>();
        List<String> list = new CopyOnWriteArrayList<>();

        list.add("first");
        list.add("Second");
        list.add("Third");



        Iterator itr = list.iterator();

        while(itr.hasNext())
        {
            String numbers =(String) itr.next();
            
            //  Here got java.util.ConcurrentModificationException bcoz we try modify original collection Fail - Fast   
            //  We Can remove this exception using ConcurrentHashMap or CopyonWriteArrayList
            
           if(!list.contains("fourth"))
            {
                list.add("fourth");
            }
            System.out.println(numbers);
        }

        System.out.println(list);

    }
}
