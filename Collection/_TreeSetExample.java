import java.util.TreeSet;

/* 
 
 1. The Underlying DataStructure in Balanced tree.
 2. Duplicate Object Not allowed.
 3. Insertion order Not maintained becayse Object will be inserted according to some sorting order.
 4. Heterogenous Objects are not allowed. Otherwise ClassCastException will be occur.
 5. Null values Not Allowed. if we try to insert then NUllPointer Exception Occur
 Notes : String class & all wrapper classes already implements Comparable interface where as StringBuffer doesn't implements Comparable Interface that reason we get ClassCastException.
 

 */
public class _TreeSetExample {

    public static void main(String[] args) {

        TreeSet<Integer> t = new TreeSet<>();

        t.add(10);
        t.add(80);
        t.add(20);
        t.add(60);
        t.add(70);

        System.out.println(t);

    }

}
