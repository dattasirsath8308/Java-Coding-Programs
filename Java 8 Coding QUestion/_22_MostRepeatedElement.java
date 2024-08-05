import java.io.FileReader;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
22) How do you find the most repeated element in an array?

input : "Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil"
output : Most Frequent Element : Pen
Count : 3

*/

public class _22_MostRepeatedElement {
    
    public static void main(String[] args) {

        mostFrequent();

        System.out.println("\n----------------\n");

        mostFrequentUsingJava8();
     
    }
       static void mostFrequent()
       {

        int[] arr = { 10, 20, 10, 20, 30, 20, 20 }; 
        int n = arr.length;

        int count = 0 ;
        int maxCount = 0 ;
        int maxFreqElement = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[i] == arr[j])
                {
                    count++;
                }
            }
            
            if(count > maxCount)
            {
                maxCount = count;
                maxFreqElement = arr[i];
            }
        }
        System.out.println("Max Frequency Element : "+maxFreqElement );
       }


    static void mostFrequentUsingJava8()
    {
        
        List<String> listOfStrings = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");
         
        
        Map<String, Long> elementCountMap = listOfStrings.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        Entry<String, Long> mostFrequentElement = elementCountMap.entrySet().stream().max(Map.Entry.comparingByValue()).get();

        System.out.println("Most Frequent Element : "+ mostFrequentElement.getKey());

        System.out.println("Count : "+ mostFrequentElement.getValue());
    }
}
