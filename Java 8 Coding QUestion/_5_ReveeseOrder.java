import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.DoubleUnaryOperator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/* 
5) How do you sort the given list of decimals in reverse order?
input : 12.45, 23.58, 17.13, 42.89
output : 42.89,23.58,17.13, 12.45.


*/


public class _5_ReveeseOrder {

    public static void main(String[] args) {


        reverseArray();

        System.out.println("\n-----------------\n");
        
        reverseListUsingJava8();

        System.out.println("\n-----------------\n");

        reverseStringListUsingJava8();

    }

    static void reverseArray()
    {
        double []arr =  {10.12, 24.15, 52.10, 34.54};


        int start = 0;
        int end = arr.length - 1;


        while(start < end)
        {
            double temp = arr[start];
            arr[start] =  arr[end];
            arr[end] = temp;

            start++;
            end--;
        }


        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+", ");
        }
    }



    static void  reverseListUsingJava8()
    {
        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89);
        System.out.println("Decimal List : "+decimalList);

        List<Double> reverseList = decimalList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("Reverse List : "+reverseList);

    }
    


    static void  reverseStringListUsingJava8()
    {
        List<String> StringList = Arrays.asList("Datta", "BHau", "good", "is", "coming");
        System.out.println("Before Reverse List : "+StringList);

        List<String> reverseList = StringList.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println("Reverse List : "+reverseList);

    }
   
    
    
}
