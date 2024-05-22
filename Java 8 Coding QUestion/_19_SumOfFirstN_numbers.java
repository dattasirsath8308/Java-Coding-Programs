import java.util.stream.IntStream;

/*
19) How do you find sum of first 10 natural numbers?
input : 10
output : 45 

*/

public class _19_SumOfFirstN_numbers {
    
    public static void main(String[] args) {
        
        sumOfFirstNumber();

        System.out.println("\n----------\n");

        sumOfFirstNumberUsingJava8();


    }

    static void sumOfFirstNumber()
    {
        int n = 10 ;
        int sum = 0 ;

        for (int i = 1; i <= n; i++) {
            sum += i;    
        }

        System.out.println(sum);
    }


    static void sumOfFirstNumberUsingJava8()
    {
        int sum =  IntStream.range(1, 11).sum();
        System.out.println(sum);
    }
}
