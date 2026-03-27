
//  print sum of square even number interger array 

import java.util.Arrays;

class q
{
    public static void main(String[] args) {
        
        int [] arr = {1,2,3,4,9 };

        // List<Integer> numlist  = Arrays.asList()



            long result  = Arrays.stream(arr).filter(num -> num % 2 == 0).map(num -> num * num).sum(); 

        System.out.println(result);

    }
}