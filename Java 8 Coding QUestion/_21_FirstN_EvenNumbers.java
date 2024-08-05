import java.util.stream.IntStream;

// java 8 Stream.map() operation transforms the elements of a stream from one type to another.
/*
21) Print first 10 even numbers

intput : n = 10 ;
output : 2 ,4
6
8
10
12
14
16
18
20

*/


public class _21_FirstN_EvenNumbers {

    public static void main(String[] args) {
        
        firstEvenNumber();

        System.out.println("\n-------------\n");

        firstEvenNumberUsingJava8();
    }


    static void firstEvenNumber()
    {

        int numbers = 10 ;
        for (int i = 1; i <=  numbers * 2; i++) {
            if(i % 2== 0)
            {
                System.out.println(i);
            }
        }
    }


    static void firstEvenNumberUsingJava8()
    {
        IntStream.range(1, 10).map(i -> i * 2).forEach(System.out::println);
    }
    
}
