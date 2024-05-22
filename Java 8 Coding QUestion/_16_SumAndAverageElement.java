import java.util.Arrays;

/*
16) Given an integer array, find sum and average of all elements?
input : 45, 12, 56, 15, 24, 75, 31, 89
output :
Sum = 347
Average = 43.375


*/

public class _16_SumAndAverageElement {

    public static void main(String[] args) {
        
        sumAndaverageElement();

        System.out.println("\n--------------\n");
        
        sumAndaverageElementUsingJava8();

    }


    static void sumAndaverageElement()
    {
        int[] a = new int[] {45, 12, 56, 15, 24, 75, 31, 89};

        int n = a.length;
        int sum = 0;
        int avg = 0 ;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        avg = sum / n;
        System.out.println("Sum of All Element : "+sum +"  Average is :"+avg);
    }
    
    
    static void sumAndaverageElementUsingJava8()
    {
        int[] a = new int[] {45, 12, 56, 15, 24, 75, 31, 89};

        int sum = Arrays.stream(a).sum();
        System.out.println("Sum of All Element :"+sum);

        Double avg = Arrays.stream(a).average().getAsDouble();
        System.out.println("Average of All Element :"+avg);

    }

}

