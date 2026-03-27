

/* 
Q : WOP to Insert String & Strinbuilder Object into the TreesSet where the Sorting order incresing length order if 2 object having same length then consider theie alphabetical order  


 */

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator implements Comparator
{

    @Override
    public int compare(Object o1, Object o2) {
        // TODO Auto-generated method stub
        String s1 = o1.toString();
        String s2 = o2.toString();

        int l1 =  s1.length();
        int l2 =  s2.length();

        if(l1 < l2)
        {
            return -1;
        }
        else if (l1 > l2) {
            return +1;
        }
        else{
            return s1.compareTo(s2);
        }

    }

}


 public class _TreeSetProgram {
    
    public static void main(String[] args) {
 
        MyComparator m = new MyComparator();
        
        TreeSet<Object> t = new TreeSet<>(m);

        t.add("A");
        t.add(new StringBuffer("ABC"));
        t.add(new StringBuffer("AA"));

        t.add("XX");
        t.add("ABCD");
        t.add("A");

        System.out.println(t);


    }
    
}
