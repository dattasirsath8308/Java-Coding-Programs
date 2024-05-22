import java.util.Arrays;
import java.util.List;

// 2. Calculate the Sum of Even Number in Array ? Write the method to Calculate the sum of all even number in the array using java 8 stream.

/* 
    input :  1,2,3,4,5,6
    output : 12  ( sum of All event Number)
*/


public class SumofAllEvenNumber {
   
    public static void main(String[] args) {
        

        sumofEvenNumberNormal();

        sumofEvenNumberUsingJava8();
    }



    public static void sumofEvenNumberNormal()
    {
        int [] Arr = { 1,2,3,4,5,6};

        printArray(Arr);

        int sum = 0 ;

        for (int i = 0; i < Arr.length; i++) {
            
            if(Arr[i] % 2 == 0)
            {
                sum += Arr[i];
            }
        }

        System.out.println("Sum is :"+ sum);
    }


    public static void  sumofEvenNumberUsingJava8()
    {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

         int SumofEven =     list.stream().filter(e -> e % 2== 0).mapToInt(Integer::intValue).sum();
        System.out.println("Sum of All even Number : "+ SumofEven);

    }



    public static void printArray(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
