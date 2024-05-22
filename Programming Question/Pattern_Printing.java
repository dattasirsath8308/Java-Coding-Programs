import java.util.Scanner;

import javax.xml.stream.events.EntityReference;

public class Pattern_Printing {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number of Row : ");
        int r = sc.nextInt();

        System.out.println("Enter the Number of Column : ");
        int c = sc.nextInt();

        System.out.println();

        // 1
        // rectanglePattern(r,c);

        // 2
        // rectangularPattern(r,c);


        // 3 
        // triangularPattern(r,c);

        // 4
        // ReversetriangularPattern(r,c);

        // 5
        // pyramidPattern(r,c);


        // 6
        // numericRectanglePattern(r,c);

        // 7
        // numericRectanglePattern2(r,c);


        // 8
        // numericRectanglePattern3(r,c);


        // 9
        // numericTrianglePattern(r,c);


        // 10
        // NumericpyramidPattern(r,c);

        // 11
        // Hallow_TringularPattern(r,c);

        star(r);


    }


     // 1. Rectangle pattern 
        /*
            * * * *
            * * * *
            * * * *
            * * * *

        */
    public static void rectanglePattern(int r,int c)
    {
        for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    System.out.print("*");
                }
                System.out.println();
        }
    }


    


     // 2. Rectangular pattern 
        /*

            c
        r   * * * *
            *     *
            *     *
            * * * *

     
        */
    public static void rectangularPattern(int r,int c)
    {
        for (int i = 1; i <= r; i++) {
                for (int j = 1; j <= c; j++) {
                    if(i == 1 || i == r || j == 1 || j == c )
                    System.out.print("*");
                    else
                    System.out.print(" ");
                    
                }
                System.out.println();
        }
    }



     // 3. Triangular pattern 
        /*

            c
        r   * 
            * *   
            * * *  
            * * * *

     
        */
        public static void triangularPattern(int r,int c)
        {
            for (int i = 1; i <= r; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");                        
                    }
                    System.out.println();
            }
        }




        // 4. Reverse Triangular pattern 
        /*

            c
        r   
            * * * *
            * * * 
            * * 
            * 

     
        */
        //  1 st way 
        // public static void ReversetriangularPattern(int r,int c)
        // {
        //     for (int i = r; i >= 1; i--) {
        //             for (int j = 1; j <= i; j++) {
        //                 System.out.print("*");                        
        //             }
        //             System.out.println();
        //     }
        // }

        public static void ReversetriangularPattern(int r,int c)
        {
            for (int i = 1; i <= r; i++) {
                    for (int j = 1; j <= (r+ 1 - i); j++) {
                        System.out.print("*");                        
                    }
                    System.out.println();
            }
        }


        // 5. pyramid pattern 
        /*

            c
        r      * 
             * * * 
           * * * * *
         * * * * * * *
            

         row space : r - i  = 4 - 1 = 3 , 4-2 = 2 
         star : 2 * i - 1   = 2 * 1 - 1 = 1 , 2 * 2 - 1 = 3 , 5 , 7 
     
        */
        public static void pyramidPattern(int r,int c)
        {
            for (int i = 1; i <= r; i++) {

                // print r-i
                for (int j = 1; j <= r - i; j++) {
                    System.out.print(" ");                        
                }

                //  2 * i - 1
                for (int k = 1; k <= 2 * i -1; k++) {
                    System.out.print("*");                        
                }
                    System.out.println();
            }
        }



        // 6. Numerical Rectangle pattern 
        /*

            c
        r1  1 2 3 4 5  
        r2  2 3 4 5 1
        r3  3 4 5 1 2
        r4  4 5 1 2 3
        r5  5 1 2 3 4
          
        i to r && 1 to i - 1
         
        */

        public static void numericRectanglePattern(int r,int c)
        {
            for (int i = 1; i <= r; i++) {

                // print r-i
                for (int j = i; j <= r; j++) {
                    System.out.print(j);                        
                }

                // //  2 * i - 1
                for (int k = 1; k <=  i -1; k++) {
                    System.out.print(k);                        
                }
                    System.out.println();
            }
        }


        // 7. pattern 
        /*

            c
        r1  1 2 3 4 5  
        r2  1 2 3 4 5  
        r3  1 2 3 4 5  
        r4  1 2 3 4 5  
        r5  1 2 3 4 5  
        
         
        */

        public static void numericRectanglePattern2(int r,int c)
        {
            for (int i = 1; i <= r; i++) {

                for (int j = 1; j <= r; j++) {
                    System.out.print(j);                        
                }
                    System.out.println();
            }
        }



        // 8. pattern 
        /*

            c
        r1  1 2 1 2 1 2 
        r2  2 1 2 1 2 1 
        r3  1 2 1 2 1 2
        r4  2 1 2 1 2 1


        i + j % 2 == 0  --> print 1 else print 2 
        
         
        */

        public static void numericRectanglePattern3(int r,int c)
        {
            for (int i = 1; i <= r; i++) {

                for (int j = 1; j <= c; j++) {
                    if((i + j) % 2 == 0)
                    System.out.print(1);                        
                    else
                    System.out.print(2); 
                }
                    System.out.println();
            }
        }



        // 9. Numeric Triangle pattern 
        /*

            c
        r1  1 
        r2  1 2  
        r3  1 2 3 
        r4  1 2 3 4


        i + j % 2 == 0  --> print 1 else print 2 
        
         
        */

        public static void numericTrianglePattern(int r,int c)
        {
            for (int i = 1; i <= r; i++) {

                for (int j = 1; j <= i; j++) {
                    System.out.print(j);                        
                    }
                    System.out.println();
            }
        }



        // 10. pyramid pattern 
        /*

            c
        r      1 
             1 2 1
           1 2 3 2 1
         1 2 3 4 3 2 1 
            

         row space : r - i  = 4 - 1 = 3 , 4-2 = 2 
         print number : 1 to i 
         i - 1 to 1 
     
        */
        public static void NumericpyramidPattern(int r,int c)
        {
            for (int i = 1; i <= r; i++) {

                // print r-i
                for (int j = 1; j <= r - i; j++) {
                    System.out.print(" ");                        
                }

                // //  2 * i - 1
                // for (int k = 1; k <= 2 * i -1; k++) {
                //     System.out.print(k);                        
                // }

                //  print  1 to i
                for (int k = 1; k <= i ; k++) {
                    System.out.print(k);                        
                }

                //  print  i-1 to 1
                for (int l = i - 1; l >= 1 ; l--) {
                    System.out.print(l);                        
                }



                    System.out.println();
            }
        }


        // 11. Hallow Tringular pattern  Pending 
        /*

            c
        r        1
               2   2   
             3       3
           4 4 4 4 4 4 4         
            
            */
    // public static void Hallow_TringularPattern(int n,int c)
    // {   

    //     // size of the pyramid
    //     int size = n;
    //     int num = 1;
    //     for (int i = 0; i < size; i++) {
    //     // print spaces
    //     for (int j = 0; j < size-i-1; j++) {
    //         System.out.print(" ");
    //     }
    //     // print numbers
    //     for (int k = 0; k < 2*i+1; k++) {
    //         if (i == 0 || i == size - 1) {
    //         System.out.print(num*i);
    //         } else {
    //         if (k == 0 || k == 2*i) {
    //             System.out.print(num*i);
    //         }
    //          else {
    //             System.out.print(" ");
    //         }
    //         }
    //     }
    //     // num = 1;
    //     System.out.println();
    //     }
          

    // }

    public static void Hallow_TringularPattern(int n, int c) {
        // size of the pyramid
        int size = n;
        // num variable to be printed, initialized to 1
        int num = 1;
        // loop through each row of the triangle
        for (int i = 1; i <= size; i++) {
            // print spaces before the numbers
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            // print numbers and spaces
            for (int k = 1; k <= 2 * i - 1; k++) {
                // check if it's the first or last row
                if (i == 1 || i == size) {
                    System.out.print(num);
                } else {
                    // check if it's the first or last position in the row
                    if (k == 1 || k == 2 * i - 1) {
                        System.out.print(num);
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            // increment num for the next row
            num++;
            // move to the next line after each row
            System.out.println();
        }
    }
    


   


public static void star(int n)
{
    for (int i = 1; i <= n; i++) {
        
        // space
        for (int j = 1; j <= n - i; j++) {
            System.out.print(" ");
        }

        for (int k = 1; k <= 2 * i - 1; k++) {
            if(i == 1 || i == n || k == 1 || k == 2 * i - 1)
            {
                System.out.print("*");
            }
            else
            {
                System.out.print(" ");
            }
        }
        
        System.out.println();
    }
}


}
