// package Pattern Programming Questions;


/*  

Input : 4 
Output :

0 0 0 0 0 0 0 0 0
0 1 1 1 1 1 1 1 0
0 1 2 2 2 2 2 1 0
0 1 2 3 3 3 2 1 0
0 1 2 3 4 3 2 1 0
0 1 2 3 3 3 2 1 0
0 1 2 2 2 2 2 1 0
0 1 1 1 1 1 1 1 0
0 0 0 0 0 0 0 0 0



------------

Input : 4 
Output :


4 4 4 4 4 4 4
4 3 3 3 3 3 4
4 3 2 2 2 3 4
4 3 2 1 2 3 4
4 3 2 2 2 3 4
4 3 3 3 3 3 4
4 4 4 4 4 4 4


     


*/

public class _11_starPattern {
    

    public static void main(String[] args) {
        
        pattern1();

        System.out.println("\n------------\n");
        
        pattern2();
    }


    public static void pattern1()
    {

        int n = 4;
        int No = 2 * n ;


        for (int row = 0; row <= No; row++) {
            for (int col = 0 ; col <= No ; col++) {
              int addEveryIndex = Math.min ( Math.min(row, col), Math.min(No- row , No - col) );
                System.out.print(addEveryIndex +" " );

            }

            System.out.println();
        }

    }


    public static void pattern2()
    {

        int n = 4;
        int No = 2 * n ;


        for (int row = 1; row < No; row++) {
            for (int col = 1 ; col < No ; col++) {
              // Find the minimum distance to the edges of the grid
              int addEveryIndex = n - Math.min ( Math.min(row, col), Math.min(No- row , No - col) );
                System.out.print((addEveryIndex + 1) +" " );

            }

            System.out.println();
        }

    }

}    

