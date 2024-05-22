import java.util.Arrays;
import java.util.List;

/*
    6. Check if Array Contains a Specific Elemenet using stream.

    input :  1 2 3 4 5   and searchNumber - 2
    output :   index No 1 or number is find.


*/

public class CheckContainElement {

    public static void main(String[] args) {
        
        int[] arr = { 40, 2, 30 };
        int result = searchElement(arr);
        System.out.println("Element found at index position : "+ result);


        checkElementUsingJava8();

    }


    public static int searchElement(int[] arr) {
        int search = 30 ;
        for (int index = 0; index < arr.length; index++) {

            if (search ==  arr[index]) {
                return index;
            }
        }
        return -1;
    }
    


    static void checkElementUsingJava8()
    {
        List<Integer> list = Arrays.asList(40, 2, 30 );

        Integer search = 2 ;
        boolean count =  list.stream().anyMatch(e -> e == search);
        System.out.println("Element is Contain : "+ count);

    }

}


