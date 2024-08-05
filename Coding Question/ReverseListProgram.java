import java.util.ArrayList;
import java.util.List;

public class ReverseListProgram {

    public static void main(String[] args) {
        
        List<Integer> list =  new ArrayList<Integer>();
        list.add(8);
        list.add(3);
        list.add(7);
        list.add(2);
        list.add(6);


        // ReverseList(list);


        SortAndReverse(list);
    }
    
    
    // Bubble Sort 
    public static void SortAndReverse(List<Integer> list)
    {

        int n = list.size();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                
                if(list.get(j) < list.get(j + 1))
                {
                    // swap logic 
                    int temp = list.get(j);
                    list.set(j , list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }

        for (Integer integer : list) {
            System.out.println(integer);
        }

    }

    public static void ReverseList(List<Integer> list)
    {
        for (int i = list.size() - 1; i >= 0  ; i--) {
            System.out.println(list.get(i));
        }

    }
}
