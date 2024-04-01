import java.util.ArrayList;
import java.util.Iterator;

public class iteratr {
    
    public static void main(String[] args) {
        

        ArrayList<String> al = new ArrayList<String>();

        // Adding elements in the array list. 
           al.add("A");
           al.add("B");
           al.add("C");
           al.add("D");
           al.add("E");
           al.add("F");



          Iterator<String> itr = al.iterator();
          
          while(itr.hasNext())
          {
              String str = itr.next();
              System.out.println(str);


              if(str.equals("F"))
              {
                  itr.remove();
                  System.out.println(al); 
              }
          }
    }
}
