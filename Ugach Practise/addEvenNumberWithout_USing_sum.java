import java.util.Arrays;
import java.util.List;

import javax.swing.event.InternalFrameEvent;

public class addEvenNumberWithout_USing_sum {

    public static void main(String[] args) {
        



        //  Add Even Number Using sum Method
        addEvenNumberUsingSumMethod();


        //  Add Even Number Wihtout Using sum Method we can use  reduce method Instead of sum
        addEvenNumberWithoutUsingSumMethod();

    }


    public static  void addEvenNumberUsingSumMethod()
    {
        List<Integer> list =  Arrays.asList(1,2,3,4,5);

        long sum = list.stream().filter(e -> e % 2 == 0).mapToInt(Integer::intValue).sum();
        System.out.println("Addition of All Number is usig sum() Method : "+sum);

    }


    public static void addEvenNumberWithoutUsingSumMethod()
    {
        List<Integer> list =  Arrays.asList(1,2,3,4,5);


        long result = list.stream().filter(num -> num % 2 == 0).reduce(0,(subtotal,num) -> subtotal + num);

        System.out.println("Addition of All Number is usig sum() Method : "+result);




    }


    
}
