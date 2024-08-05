// package Pattern Programming Questions;


/*  

Input : 5 
Output :

         *
        * *
       * * *
      * * * *
     * * * * *
  
     

-------------------

* * * * *
 * * * *     
  * * *
   * *
    *    
     


*/

public class _8_starPattern {
    

    public static void main(String[] args) {
        
        pattern1();

        System.out.println("\n------------\n");
        
        pattern2();
    }

    public static void pattern1()
    {
        int No = 5;
        for (int row = 1; row <= No; row++) {
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


    public static void pattern2()
    {
        int No = 5;
        for (int row = No; row >= 1; row--) {
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

