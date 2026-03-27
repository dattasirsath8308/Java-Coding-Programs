import java.util.Arrays;

//  When Arrays Sorted then write Below Programs 

public class RemoveDuplicateArray {

    public static void main(String[] args) {

        int[] arr = { 10, 20, 20, 10, 30, 30, 40, 50 };
        Arrays.sort(arr);
        int n = arr.length;
        int[] temp = new int[n];
        int uniqueElement = 0;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[uniqueElement++] = arr[i];
            }
        }

        temp[uniqueElement++] = arr[n - 1];

        // int[] arrElement = Arrays.copyOf(temp, uniqueElement);

        // for (int i = 0; i < uniqueElement; i++) {
        //     System.out.println(arrElement[i]);
        // }

        int[] arrElement = new int[uniqueElement];
        for (int i = 0; i < uniqueElement; i++) {
            arrElement[i] = temp[i];
        }

        for (int i = 0; i < uniqueElement; i++) {
            System.out.println(arrElement[i]);
        }

    }

}
