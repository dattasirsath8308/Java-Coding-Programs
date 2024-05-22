import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Stack;

public class Reverse_String_usingArrList {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Datta");
        list.add("Kailas");
        list.add("Sirsath");

        System.out.println(list);

        // Collections.reverse(list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);


        System.out.println("Sort String using stack ");


        Stack<String> st = new Stack<>();
        st.add("Bhau");
        st.add("Datta");

        System.out.println(st);

        Collections.sort(st, Collections.reverseOrder());
        System.out.println(st);
        




    }
    
}
