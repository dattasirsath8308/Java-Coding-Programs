// package Pattern Programming Questions;


/*  

Input : 5 
Output : (condition : col = row )

1
1 2 
1 2 3
1 2 3 4
1 2 3 4 5

*/

public class _4_starPattern {
    

    public static void main(String[] args) {
        
        pattern1();
    }

    public static void pattern1()
    {

        int No = 5;
        for (int row = 1; row <= No; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }    
}    

