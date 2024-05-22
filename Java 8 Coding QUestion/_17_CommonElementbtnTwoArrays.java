import java.util.Arrays;
import java.util.List;

/*
17) How do you find common elements between two arrays?

input : 
arr1 : 71, 21, 34, 89, 56, 28
arr2 : 12, 56, 17, 21, 94, 34

output : 
21
34
56

*/


public class _17_CommonElementbtnTwoArrays {
    
    public static void main(String[] args) {
        
        CommonBtn2Array();

        System.out.println("\n------\n ");

        CommonBtn2ArrayUsingJava8();

    }


    static void CommonBtn2Array()
    {
        int []Arr1 = {71, 21, 34, 89, 56, 28};
         
        int []Arr2 = {12, 56, 17, 21, 94, 34};


        for (int i = 0; i < Arr1.length; i++) {
            
            for (int j = 0; j < Arr2.length; j++) {
                if(Arr1[i] == Arr2[j])
                {
                    System.out.println(Arr2[j]); //21,34,56
                }
            }
        }
    }

    static void CommonBtn2ArrayUsingJava8()
    {
        List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);
         
        List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);

        list1.stream().filter(list2::contains).forEach(System.out::println);
    }
}
