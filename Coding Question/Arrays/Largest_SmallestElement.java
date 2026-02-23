// Find largest and smallest number in the give array 

import java.util.Arrays;

public class Largest_SmallestElement {


    public static void main(String[] args) {
        


        usingJava8();


        
        System.out.println("\n2. using Java core ");

        int[] num = {12, 29, 10, 1008, 89, 2987, 16, 28, 123, 787, 54};

        int smallest = num[0]; // 12
        int largest = num[0]; // 2987
        

        for(int i = 0; i< num.length ; i++){

            if(num[i] > largest){
                largest = num[i];
            }else if(num[i] < smallest){
                smallest = num[i]; 
            }
        }


        System.out.println("Largest No :"+ largest);
        System.out.println("Smallest No :"+ smallest);

    }
    

    public static void usingJava8(){


        System.out.println("1. using Java 8 ");
        int[] num = {12, 29, 10, 1008, 89, 2987, 16, 28, 123, 787, 54};


        int min = Arrays.stream(num).min().getAsInt();
        int max = Arrays.stream(num).max().getAsInt();

        System.out.println("Largest No :"+ max);
        System.out.println("Smallest No :"+ min);
        

    }


}
