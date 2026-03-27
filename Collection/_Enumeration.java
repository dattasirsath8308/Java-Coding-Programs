import java.util.Enumeration;
import java.util.Vector;

public class _Enumeration {

    public static void main(String[] args) {
        
        Vector<Object> v = new Vector<>();


        for (int i = 0; i < 10; i++) {
            v.add(i);
        }
        System.out.println(v);


        Enumeration<Object> e = v.elements();

        while (e.hasMoreElements()) {
            
            Integer i = (Integer) e.nextElement();

            if(i % 2 == 0)
            {
                System.out.print(i+" ");
            }
        }
        System.out.println("\n"+v);

    }
    
}
