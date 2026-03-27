import java.util.ArrayList;

public class ReverseListDuplicate {

    public static void main(String[] args) {
        

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        // System.out.println(list);

        int n = list.size();

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                
                if(list.get(j) < list.get(j+1))
                {

                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j+ 1, temp);
                }

            }
            
            for (Integer integer : list) {
                System.out.println(integer);
            }



        }




    }



    
}
