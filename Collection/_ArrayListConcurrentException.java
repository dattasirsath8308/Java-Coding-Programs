import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class _ArrayListConcurrentException {

    public static void main(String[] args) {

        ArrayListConcurrentException();


        System.out.println("\n\n2. Program");
        ArrayListWihtoutConcurrentException();

    }

    public static void ArrayListConcurrentException() {
        ArrayList<Integer> a = new ArrayList<>();

        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);

        System.out.println(a);
        System.out.println("------");

        try {
            Iterator<Integer> itr = a.iterator();
            while (itr.hasNext()) {

                Integer i = itr.next();
                // System.out.print(i);

                if (i % 2 == 0) {
                    // itr.remove();
                    a.add(i + 10);
                    System.out.println(i);
                }
            }
        } catch (ConcurrentModificationException e) {
            System.out.println("CME occurs " + e);
        }
    }

    public static void ArrayListWihtoutConcurrentException() {
        List<Integer> a = new CopyOnWriteArrayList<>();

        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);

        System.out.println(a);
        System.out.println("------");

        Iterator<Integer> itr = a.iterator();
        while (itr.hasNext()) {

            Integer i = itr.next();
            // System.out.print(i);

            if (i % 2 == 0) {
                // itr.remove();
                a.add(i + 10);
                System.out.println(i);
            }
        }
        System.out.println(a);
    }

}
