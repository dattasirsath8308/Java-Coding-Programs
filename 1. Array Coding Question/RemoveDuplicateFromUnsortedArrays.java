
/* 
 Question : Remove Duplicates From an Unsorted Array
 Input: arr[]={2,3,1,9,3,1,3,9}
 Output:  {2,3,1,9}

 */
public class RemoveDuplicateFromUnsortedArrays {

    public static void main(String[] args) {





        int arr[]= { 2,3,1,9,3,1,3,9 };
        int n = arr.length;

        int []temp = new int[n];
        

        for (int i = 0; i < n -1; i++) {
            temp[i] = 1;
        }


        for (int i = 0; i < n -1 ; i++) {
            
            if (temp[i] == 1) {
                
                for (int j = i + 1; j < n -1 ; j++) {
                    if(arr[i] == arr[j])
                    {
                        temp[j] = 0;
                    }
                }
            }
        }


        for (int i = 0; i < n -1 ; i++) {
            if(temp[i] == 1)
            {
                System.out.print(arr[i] +" , ");
            }
        }

    }



}
