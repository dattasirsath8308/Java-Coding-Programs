


public class swappingArray {
    
    public static void main(String[] args) {
        
        int[] arr = {10,20,30,40,50};
        
        System.out.println("Before reverse");
        printArray(arr);
        reverseArray(arr);
        System.out.println("\nAfter reverse");
        printArray(arr);
        


        System.out.println("temp");

        int [] res = RevArray(arr);
        printArray(res);
        // System.out.println(res);

    }

    public static void  reverseArray(int []arr)
    {

        int start = 0 , end = arr.length -1 , temp = 0 ;


        while(start < end)
        {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            // System.out.println(arr[start]);
            start++;
            
            end--;
            // System.out.println(arr[end]);
        }
        
        

    }
     

    public static int[] RevArray (int[] Arr )
    {
        int n = Arr.length  ;
        int[] temp =  new int[n];

        for (int i = 0; i < Arr.length; i++) {
            // temp[i] =  Arr[Arr.length -i - 1 ] ;
            temp[i] = Arr[Arr.length - i - 1];
        }

        return  temp;
    }




    public static void printArray(int[] Arr) {
        for (int i = 0; i < Arr.length; i++) {
            System.out.print(Arr[i] + ", ");
        }
    }

}
