// package Pattern Programming Questions;


/*  

Input : 5 
Output :  ( Condition :  No - row  )

* * * * *
* * * *
* * *
* *
*


*/

public class _3_starPattern {
    

    public static void main(String[] args) {
        
        pattern1();

        System.out.println("\n------------\n");

        pattern2();
    }

    public static void pattern1() {
        int n = 5; // number of rows
        for (int row = 1; row <= n; row++) {
            for (int col = n; col >= row ; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }



    public static void pattern2()
    {
        int No = 5;
        for (int row = 0; row < No; row++) {
            for (int col = 0; col < No - row ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
