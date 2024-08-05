
/* 
Input :  11,22,35,4,62,45
Output : Lowest : 4  and Second Lowest : 11 

*/

import java.util.Arrays;
import java.util.Comparator;

public class Find_LowestAndSecondLowest {

    public static void main(String[] args) {
        


        int []Arr = {11,22,35,4,62,45};

        int Lowest =  LowestElement(Arr);

        System.out.println("Lowest :"+Lowest);


        System.out.println("Using Java 8  Feature !! ");
        LowestLementUsingJava8();

        SecondLowestLementUsingJava8();

    }

    
    
    static int LowestElement(int []Arr)
    {
        int Lowest = Integer.MAX_VALUE ;
        int SecondLowest = 0;
        for (int i = 0; i < Arr.length; i++) {
            
            if(Arr[i] < Lowest)
            {
                SecondLowest = Lowest;
                Lowest = Arr[i];
            } else if( SecondLowest < Arr[i] && Arr[i] == Lowest)
            {
                SecondLowest = Lowest;
            }
        }
        // System.out.println("Lowest :"+Lowest);
        System.out.println("Second Lowest :"+SecondLowest);


        return Lowest;
    } 
    

    static void LowestLementUsingJava8()
    {
        int []Arr = {11,22,35,4,62,45};

        Integer Lowest = Arrays.stream(Arr).boxed().sorted().findFirst().get();
        System.out.println("Lowest "+Lowest);
    }


    static void SecondLowestLementUsingJava8()
    {

        int []Arr = {11,22,35,4,62,45};

        Integer SecondLowest = Arrays.stream(Arr).boxed().sorted().skip(1).findFirst().get();
        System.out.println("Second Lowest "+SecondLowest);

    }
}
