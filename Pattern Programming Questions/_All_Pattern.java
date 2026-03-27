
/*  

1. pattern 1 : 

Input : 4 
Output :

*
* *
* * *
* * * *
* * *
* *
*


----------
pattern 2 :

     1 
    2 2 
   3 3 3 
  4 4 4 4 
 5 5 5 5 5 
6 6 6 6 6 6 
     

--------
pattern 3 : 

1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
1 2 3 4 5 6 


-------

pattern 4 :

5
5 4 
5 4 3
5 4 3 2
5 4 3 2 1

---------
pattern 5 :

1 2 3 4 5 6 
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 


----------
pattern 6 : 

1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
16 17 18 19 20 21 




-----------
pattern 7 :

*
* *
* * *
* * * *
* * * * *



-----------
pattern 8 :

* * * * *
* * * *
* * *
* *
*


-----------
pattern 9 :

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





-----------
pattern 10 :

         *
        * *
       * * *
      * * * *
     * * * * *
  

-----------
pattern 11 :

* * * * *
 * * * *     
  * * *
   * *
    *    
     


-----------
pattern 12 :

Input : 5 
Output :

            1
          2 1 2
        3 2 1 2 3
      4 3 2 1 2 3 4
    5 4 3 2 1 2 3 4 5




-----------
pattern 13 :

Input : 5 
Output :

            1
          2 1 2
        3 2 1 2 3
      4 3 2 1 2 3 4
    5 4 3 2 1 2 3 4 5
      4 3 2 1 2 3 4
        3 2 1 2 3
          2 1 2
            1


-----------
pattern 14 :


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



-----------
pattern 15 :

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

public class _All_Pattern {
    

    public static void main(String[] args) {
        
        pattern1();
        System.out.println("\n-------------\n");

        pattern2();
        System.out.println("\n-------------\n");

        pattern3();
        System.out.println("\n-------------\n");

        pattern4();
        System.out.println("\n-------------\n");

        pattern5();
        System.out.println("\n-------------\n");

        pattern6();
        System.out.println("\n-------------\n");

        pattern7();
        System.out.println("\n-------------\n");

        pattern8();
        System.out.println("\n-------------\n");

        pattern9();
        System.out.println("\n-------------\n");

        pattern10();
        System.out.println("\n-------------\n");

        pattern11();
        System.out.println("\n-------------\n");

        pattern12();
        System.out.println("\n-------------\n");

        pattern13();
        System.out.println("\n-------------\n");

        pattern14();
        System.out.println("\n-------------\n");

        pattern15();

    }



    public static void pattern1()
    {
        // int n = 4;
        int No = 4 ;



        for (int row = 1; row <= 2 * No; row++) {
            int totalColsInRow =  row > No ? 2 *   No - row : row;
            for (int col = 1 ; col <= totalColsInRow ; col++) {
            //   int addEveryIndex = Math.min ( Math.min(row, col), Math.min(No- row , No - col) );
                System.out.print("* " );

            }

            System.out.println();
        }

    }

    public static void pattern2()
    {

        int No = 6 ;

        for (int row = 1; row <= No; row++) {

            for (int i = 1; i <= No - row; i++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= row; col++) {
                System.out.print(row+ " ");
            }
            System.out.println();
        }

    }
    

    public static void pattern3()
    {
        int No = 6 ;
        for (int row = 1; row <= No; row++) {

            for (int col = 1; col <= row; col++) {
                System.out.print(col+ " ");
            }
            System.out.println();
        }
    }

    public static void pattern4()
    {
        int No = 5 ;
        for (int row = 0; row < No; row++) {

            for (int col = No; col >= No - row  ; col--) {
                System.out.print(col+ " ");
            }
            System.out.println();
        }
    }


    public static void pattern5()
    {
        int No = 5 ;
        for (int row = 0; row < No; row++) {

            for (int col = 1; col <= No - row  ; col++) {
                System.out.print(col+ " ");
            }
            System.out.println();
        }
    }

    public static void pattern6()
    {
        int No = 5 ;
        int num = 1;
        for (int row = 1; row <=  No; row++) {
            for (int col = 1; col <= row   ; col++) {
                System.out.print(num+ " ");
                num++;
            }
            System.out.println();
        }
    }


    public static void pattern7() {
        int n = 5; // number of rows
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void pattern8()
    {
        int No = 5;
        for (int row = 0; row < No; row++) {
            for (int col = 0; col < No - row ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void pattern9()
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
    
    

    public static void pattern10()
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

    public static void pattern11()
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


    public static void pattern12()
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


    public static void pattern13()
    {
        int No = 5 ;


        for (int row = 0; row <  2 * No; row++) {

            int totalColsInRow = row > No ? No * 2 - row : row;

            for (int space = 0; space < No - totalColsInRow ; space++) {
                System.out.print(" ");
            }
            
            for (int col = totalColsInRow ; col >= 1 ; col--) {
                System.out.print(col );
            }

            for (int col = 2; col <= totalColsInRow  ; col++) {
                System.out.print(col);
            }

            System.out.println();
        }

    }


    public static void pattern14()
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


    public static void pattern15()
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

