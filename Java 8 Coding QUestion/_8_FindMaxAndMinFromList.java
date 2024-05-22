import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
8) Given a list of integers, find maximum and minimum of those numbers?

input : 45, 12, 56, 15, 24, 75, 31, 89
ouput : Maximum Element : 89
Minimum Element : 12


*/

public class _8_FindMaxAndMinFromList {

    public static void main(String[] args) {
        
        MaxAndMinNumber();
        System.out.println("\n------------\n");

        MaxAndMinNumberUsingJava8();

    }
    

    public static void MaxAndMinNumber()
    {
        List<Integer> numList = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        int min = numList.get(0) ;
        int max = numList.get(0);

        for (int i = 0; i < numList.size(); i++) {
            
            if(numList.get(i) > max )
            {
                max = numList.get(i);
            }
            if(numList.get(i) < min )
            {
                min = numList.get(i);
            }
        }

        System.out.println("Max :"+max +" and Min :"+min);
    }

    static void MaxAndMinNumberUsingJava8()
    {
        List<Integer> numList = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        int max = numList.stream().max(Comparator.naturalOrder()).get();
        int min = numList.stream().min(Comparator.naturalOrder()).get();
        System.out.println("Max :"+max +" and Min :"+min);
    }
}
