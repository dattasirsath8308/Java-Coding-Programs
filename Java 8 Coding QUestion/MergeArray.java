import java.util.Arrays;
import java.util.stream.Stream;

/*

8. Merge Two Array using Stream.




*/

public class MergeArray {

    public static void main(String[] args) {

        MergeArrays();
    }

    public static void MergeArrays() {

        // Two arrays to merge
        int[] array1 = { 1, 2, 3 };
        int[] array2 = { 4, 5, 6 };

        // Merging arrays using Java 8 streams
        int[] mergedArray = Stream.concat(Arrays.stream(array1), Arrays.stream(array2)).toArray();

        // Print the merged array
        System.out.println("Merged Array:");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }

}
