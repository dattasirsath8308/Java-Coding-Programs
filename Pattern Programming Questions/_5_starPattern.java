// package Pattern Programming Questions;


/*  

Input : 5 
Output : (condition : (int col = No; col >= No - row + 1 ; col--) )

5
5 4 
5 4 3
5 4 3 2 
5 4 3 2 1



---------

for (int row = 1; row <= No; row++) {
            for (int col = row; col >= 1; col--) {
                System.out.print(col);
        

1
21
321
4321
54321

*/

public class _5_starPattern {
    

    public static void main(String[] args) {
        
        pattern1();
    }

    public static void pattern1()
    {
        int No = 5;
        for (int row = 1; row <= No; row++) {
            for (int col = No; col >= No - row + 1 ; col--) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }    
}    

