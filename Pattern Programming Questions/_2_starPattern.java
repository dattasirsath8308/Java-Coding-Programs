// package Pattern Programming Questions;


/*  

Input : 5 
Outptu : 

*
* *
* * *
* * * *
* * * * *

*/


public class _2_starPattern {
    

    public static void main(String[] args) {
        
        pattern1();

        System.out.println("\n------------\n");

        pattern2();
    }

    public static void pattern1() {
        
        int No = 5 ;
        for (int i = No; i >= 1; i--) {
            
            for (int j = i-1; j < No; j++) {
                
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    

    public static void pattern2() {
        int n = 5; // number of rows
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
