import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class _ListIterator {

    public static void main(String[] args) {
        

        List<Integer> l = new ArrayList<>();

        l.add(10);
        l.add(40);
        l.add(30);
        l.add(20);


        ListIterator<Integer> itr = l.listIterator();

        while (itr.hasNext()) {

            Integer next = itr.next();
            System.out.println(next);

            // itr.add(100);

            if(next == 20)
            {
                itr.set(50);
            }
            // System.out.println();

        }

        System.out.println(l);

    }
    
}
