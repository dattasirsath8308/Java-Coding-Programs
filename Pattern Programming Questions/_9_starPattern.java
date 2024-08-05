// package Pattern Programming Questions;


/*  

Input : 5 
Output :

            1
          2 1 2
        3 2 1 2 3
      4 3 2 1 2 3 4
    5 4 3 2 1 2 3 4 5

     


*/

public class _9_starPattern {
    

    public static void main(String[] args) {
        
        pattern1();

        System.out.println("\n------------\n");
        
        // pattern2();
    }


    public static void pattern1()
    {
        int No = 5 ;


        for (int row = 1; row <=  No; row++) {

            for (int space = 0; space < No - row; space++) {
                System.out.print(" ");
            }
            
            for (int col = row; col >= 1 ; col--) {
                System.out.print(col );
            }

            for (int col = 2; col <= row ; col++) {
                System.out.print(col);
            }

            System.out.println();
        }

    }

}    

