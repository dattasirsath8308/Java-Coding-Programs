


import java.util.ArrayList;
import java.util.List;

public class ReverseList {

    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(2);
        list.add(6);
        list.add(4);
        list.add(1);


        // Print the list in reverse order
        printReverse(list);
    }

    public static void printReverse(List<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }
}


/* 
 
import java.util.ArrayList;
import java.util.List;

public class ReverseSortedList {

    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(2);
        list.add(6);
        list.add(4);
        list.add(1);

        // Sort the list
        sortList(list);

        // Print the sorted list in reverse order
        printReverse(list);
    }

    // Function to sort the list using Bubble Sort
    public static void sortList(List<Integer> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    // Swap list[j] and list[j + 1]
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }

    // Function to print the list in reverse order
    public static void printReverse(List<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }
}

 */