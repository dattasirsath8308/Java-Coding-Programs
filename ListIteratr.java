import java.util.ArrayList;
import java.util.ListIterator;

// import java.util.ArrayList;
// import java.util.ListIterator;

// public class ListIteratr {

//     public static void main(String[] args) {
        

//         ArrayList<String> al = new ArrayList(); 
//         al.add("First"); 
//         al.add("Second"); 
//         al.add("Third"); 
//         al.add("Fourth"); 
//         al.add("Fifth"); 
//         System.out.println(al); 



//         ListIterator ltr =  al.listIterator();
        
//         System.out.println("Iteration in the forward direction"); 
//         while(ltr.hasNext()) 
//         {
//             Object o = ltr.next();
//             String str = (String)o;
//             System.out.println(str);
//         }

//         System.out.println("Iteration in the forward direction"); 

//         while(ltr.hasPrevious())
//         {
//             Object o = ltr.previous();
//             String str = (String)o;
//             System.out.println(o);
//         }



//     }
// }




public class ListIteratr {

    public static void main(String[] args) {
    
        
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);


        ListIterator itr = al.listIterator();


        while(itr.hasNext())
        {

            
            // int index = al.indexOf(40);
        int index = itr.nextIndex()+1;
        // System.out.println(index);
        
        int value =(int) itr.next();
        System.out.println(index +" :  "+value);
        
        
        }


        System.out.println("Backword directions : ");
        while(itr.hasPrevious())
        {
        int value =(int) itr.previous();
        System.out.println( value);
        
        }

    }

}    