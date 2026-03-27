// package Pattern Programming Questions;


/*  

Input : 5 
Output : (condition : int totalColsInRow = row > No ? 2 * No - row : row;)

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

public class _6_starPattern {
    

    public static void main(String[] args) {
        
        pattern1();
    }

    public static void pattern1()
    {
        int No = 5;
        for (int row = 1; row <= 2 * No; row++) {
            // Calculate the number of stars to print in the current row
            int totalColsInRow = row > No ? 2 * No - row : row;
            for (int col = 1; col <= totalColsInRow ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }    
}    

