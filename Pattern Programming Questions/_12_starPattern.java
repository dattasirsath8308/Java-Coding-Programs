// package Pattern Programming Questions;


/*  

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

     1 
    2 2 
   3 3 3 
  4 4 4 4 
 5 5 5 5 5 
6 6 6 6 6 6 
     

--------


1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
1 2 3 4 5 6 


-------

5
5 4 
5 4 3
5 4 3 2
5 4 3 2 1

---------

1 2 3 4 5 6 
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 


----------


1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
16 17 18 19 20 21 





*/

public class _12_starPattern {
    

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



}    

