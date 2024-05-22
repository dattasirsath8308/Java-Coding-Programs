import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* 
4. Find the Second Largest Elemenet in An array Using Java 8 .

input : 1,2,3,4
output : 3 secondLarger value 

*/

public class SecondLargerElement {

    public static void main(String[] args) {
        


        SecondLargerElementNormal();
        
        SecondLargerElementUsingJava8();
        
        
    }
    
    public static void SecondLargerElementNormal()
    {
        int arr[] = { 1, 3 ,4,5};

        int Largest = arr[0], SecondLargest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            

            if(Largest < arr[i])
            {

                SecondLargest = Largest;
                Largest = arr[i];
            } else if( arr[i] > SecondLargest && Largest != arr[i] )
            {
                SecondLargest = arr[i];
            }

        }

        System.out.println("Largest is "+ Largest + "  second Largest is "+ SecondLargest  );

    }



    public static void SecondLargerElementUsingJava8()
    {
        List<Integer> number = Arrays.asList(1,2,3,4,5);

        
        Integer i = number.stream()
        .sorted(Comparator.reverseOrder())
        .skip(1)
        .findFirst()
        .get();

        System.out.println("Second Highest is :"+i);
    }
}
