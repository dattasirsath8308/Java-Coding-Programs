// package Pattern Programming Questions;


/*  

Input : 5 
Output : (condition : int totalColsInRow = row > No ? 2 * No - row : row;
            int space = No - tatolColsInRow ;    
        )

         *
        * *
       * * *
      * * * *
     * * * * *
      * * * *
       * * *
        * *
         *



*/

public class _7_starPattern {
    

    public static void main(String[] args) {
        
        pattern1();
    }

    public static void pattern1()
    {
        int No = 5;
        for (int row = 1; row <= 2 * No; row++) {
            // Calculate the number of stars to print in the current row
            int totalColsInRow = row > No ? 2 * No - row : row;
            int Emptyspace = No - totalColsInRow;
            for (int space = 0; space < Emptyspace; space++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= totalColsInRow ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }    
}    

