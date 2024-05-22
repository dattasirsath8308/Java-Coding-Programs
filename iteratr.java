import java.util.ArrayList;
import java.util.Iterator;

import org.w3c.dom.ls.LSException;

// import java.util.ArrayList;
// import java.util.Iterator;

// public class iteratr {
    
//     public static void main(String[] args) {
        

//         ArrayList<String> al = new ArrayList<String>();

//         // Adding elements in the array list. 
//            al.add("A");
//            al.add("B");
//            al.add("C");
//            al.add("D");
//            al.add("E");
//            al.add("F");



//           Iterator<String> itr = al.iterator();
          
//           while(itr.hasNext())
//           {
//               String str = itr.next();
//               System.out.println(str);


//               if(str.equals("F"))
//               {
//                   itr.remove();
//                   System.out.println(al); 
//               }
//           }
//     }
// }






public class iteratr {

    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();

        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);


        Iterator<Integer> itr = list.iterator();
        
        while(itr.hasNext())
        {
            Integer i = itr.next();
            
            // itr.remove();
            
            if(i % 2 != 0) 
            itr.remove(); 
        
            
            System.out.println(i);
        }





    }

}



















