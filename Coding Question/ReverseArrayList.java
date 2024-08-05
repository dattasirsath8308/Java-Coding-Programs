import java.util.ArrayList;
import java.util.List;

public class ReverseArrayList {

    public static void main(String[] args) {
        

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(2);
        list.add(6);
        list.add(4);
        list.add(1);



        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j) < list.get(j + 1)) {
                    // Swap list[j] and list[j+1]
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }

        for (int i : list) {
            System.out.println(i);
        }


    }
    
}