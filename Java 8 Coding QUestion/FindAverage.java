import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

/*

7. find the Average of Array Element using Stream.
input : 1, 2, 3, 4, 5    -> sum 15/5 = 3
output : 3 



*/

public class FindAverage {
    public static void main(String[] args) {
        
        

        AverageOfArray();


        AverageOfArrayList();

        FindAverageUsingJava8();


        FindAverageofArrayListUsingJava8();




    }


     static void AverageOfArray() {

            int[] arr = {1, 2, 3, 4, 5};
            
            int sum = 0;
            for (int num : arr) {
                sum += num;
            }
            
            double average = (double) sum / arr.length;
            
            System.out.println("The average of the array elements is: " + average);
    }




    public static void AverageOfArrayList() {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);

        // Calculate the sum of elements
        int sum = 0;
        for (int num : arrayList) {
            sum += num;
        }

        // Calculate the average
        double average = (double) sum / arrayList.size();

        System.out.println("Average of ArrayList elements: " + average);
    }

    


    static void FindAverageUsingJava8()
    {

        int[] arr = {1, 2, 3, 4, 5};

        double d =  Arrays.stream(arr).average().orElse(0);
        System.out.println(d);

    }


    static void FindAverageofArrayListUsingJava8()
    {
        List<Integer> arrayList = new ArrayList<>();
        // Add elements to the ArrayList
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);


        OptionalDouble d = arrayList.stream().mapToInt(Integer::intValue).average();
        System.out.println(d);
    }
    
}
