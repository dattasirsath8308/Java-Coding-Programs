

/*      

input : 20, 10, 5, 15, 25, 30]
Target Expense: 35


m Prices: [25, 30, 15, 10, 20, 35]
Target Price: 45


 */



public class TwoSum {

    public static void main(String[] args) {
        
    int []arr = {25, 30, 15, 10, 20, 35};
    
    int target = 45;


    for (int i = 0; i < arr.length; i++) {
        for (int j = i; j < arr.length; j++) {
            
            if( arr[i] + arr[j] == target)
            {
                System.out.println(  arr[i] +" , "+ arr[j]);
            } 
        }
    }





    }
    
}
