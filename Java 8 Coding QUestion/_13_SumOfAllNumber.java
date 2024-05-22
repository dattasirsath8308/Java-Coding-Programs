import java.util.Arrays;
import java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import javax.sound.midi.Instrument;

/*
13) Find sum of all digits of a number in Java 8?

input : 15623
output : 17  

*/

public class _13_SumOfAllNumber {

    public static void main(String[] args) {
     
        
        sumOfDigits();

        System.out.println("\n--------\n");

        sumOfDigitsUsingJava8First();

        sumOfDigitsUsingJava8Second();


    }
    

    static void sumOfDigits()
    {

        int value =  15623;
        int temp =value;
        int sum = 0;

        System.out.println("start");
        while(temp != 0)
        {
            int digit  = temp % 10;
            sum =sum +  digit;
            temp = temp / 10;
        }

        System.out.println("Sum of Digit : "+sum);

    }


    static void sumOfDigitsUsingJava8First()
    {
       int value =  15623;   
        // Arrays.stream(value).
        IntStream stream =  String.valueOf(value).chars();

        int sum =  stream.map(Character::getNumericValue).sum();

        System.out.println("Sum of Digit : "+sum);
    }


    static void  sumOfDigitsUsingJava8Second()
    {

        int value =  15623;   

        Integer result = Stream.of(String.valueOf(value).split("")).collect(Collectors.summingInt(Integer::parseInt));
        System.out.println("result :  "+result);
     

    }

}
