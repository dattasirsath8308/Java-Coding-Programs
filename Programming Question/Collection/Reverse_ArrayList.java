import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reverse_ArrayList {
    
    public static void main(String[] args) {
        

        ArrayList<Integer> l =  new ArrayList<>();

        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        l.add(60);

        System.out.println(l);

        // reverse(l);
        Collections.reverse(l);
        System.out.println("reversed  : "+l);

        Collections.sort(l);
        System.out.println("Ascending Sort :  "+l);

        // Collections.sort(l , Collections.reverseOrder()); 

        Collections.sort(l, Collections.reverseOrder());
        // Collections.reverse(l);
        System.out.println("Descending Sort :  "+l);



    }

    public static void reverse(ArrayList<Integer> list)
    {
        int start = 0 , end =  list.size() -1;

        // swapping
        /*
        temp = a ;
        a =b;
        b= temp
        */

        while(start < end)
        {
            Integer temp =  Integer.valueOf( list.get(start));
            list.set(start, list.get(end));
            list.set(end,temp);
            
            start++;
            end--;
        }
    }
}
