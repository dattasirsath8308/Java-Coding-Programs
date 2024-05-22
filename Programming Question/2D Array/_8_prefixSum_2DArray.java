import java.util.Scanner;

/*

Pattern : Prefix sum in 2D Arrays
1. Brute force

Q : Given Matrix 'a' of dimension n X m and 2 coordinates (l1,r1) and (l2,r2). Return the sum of the rectangle from (l1,r1) to (l2,r2)


1 2 3
4 1 1
1 1 1

Enter Rectangle boundaries l1, r1, l2 ,r2 (0,0) (2,2)
0 0 2 2
Sum of Rectangle :15

----------------

Enter Rectangle boundaries l1, r1, l2 ,r2 (1,1) (2,2)
1 1 2 2
Sum of Rectangle :4


Method 2 : Pre-Calculating the horizontal sum  for each row in the matrix. (findSum2() Method)

Method 3 : Prefix sum over columns and Rows Both 


Enter the No of Rows : 
3
enter the No of Column in  Rows :
3
Enter total 9 element the row3 *  Col 3 Matrix :
1 2 3
2 1 1
3 2 1
Enter Rectangle boundaries l1, r1, l2 ,r2
0 0 2 2

Sum of Rectangle :16


*/

public class _8_prefixSum_2DArray {

    static int findSum(int[][] Matrix, int l1 , int r1 , int l2 , int r2)
    {
        int sum = 0;

        for (int i = l1; i <= l2; i++) {
            for (int j = r1; j <= r2; j++) {
                sum += Matrix[i][j];
            }
        }

        return sum;
    }


    /*
     static void findPrefixSumMatrix(int[][] Matrix)
    {
        int r = Matrix.length;
        int c = Matrix[0].length;


        // tranverse Horizontally to calculate row-wise prefix sum
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                Matrix[i][j] += Matrix[i][j-1]; 
            }
        }
    } 
    */
    // Calculate row and COlumn Sum
    // matrix[i][j] = sumRectangle((0,0) (i,j)) 
    static void findPrefixSumMatrix(int[][] Matrix)
    {
        int r = Matrix.length;
        int c = Matrix[0].length;


        // tranverse Horizontally to calculate row-wise prefix sum
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                Matrix[i][j] += Matrix[i][j-1]; 
            }
        }

         // tranverse Vartically  to calculate column-wise prefix sum
         for (int j = 0; j < c; j++) { // fixing column
            for (int i = 1; i < r; i++) {
                Matrix[i][j] += Matrix[i-1][j];

            }
        }
        
    }

    static int findSum2(int[][] Matrix, int l1 , int r1 , int l2 , int r2)
    {
        int sum = 0;
        findPrefixSumMatrix(Matrix);


        for (int i = l1; i <= l2; i++) {
            // r1 to r2 sum for row i 
            if(r1 >= 1)
            {
                sum += Matrix[i][r2] - Matrix[i][r1-1];
            }
            else
            {
                sum += Matrix[i][r2];
            }
        }
        return sum;
    }


    static int findSum3(int[][] Matrix, int l1 , int r1 , int l2 , int r2)
    {
        int ans = 0;
        int sum = 0 , up= 0 , left = 0 , leftUp = 0;
        
        findPrefixSumMatrix(Matrix);

        sum = Matrix[l2][r2];
        
        if(r1 >= 1)
        left = Matrix[l2][r1-1];
        
        if(l1 >= 1)
        up = Matrix[l1-1][r2];

        if(l1 >= 1 && r1>= 1 )
        leftUp = Matrix[l1-1][r1-1];

        ans = sum -up - left + leftUp;

        return ans;
    }


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("The Array : ");
        System.out.println("Enter the No of Rows : ");
        int r =sc.nextInt();
        System.out.println("enter the No of Column in  Rows : ");
        int c = sc.nextInt();

        int[][] arr =  new int[r][c];
        int totalElement = r * c ;
        System.out.println("Enter total "+ totalElement +" element the row"+r +" *  Col "+c+" Matrix :");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }


        System.out.println("Enter Rectangle boundaries l1, r1, l2 ,r2");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();
        
        System.out.println("Sum of Rectangle :"+ findSum(arr, l1, r1, l2, r2));
        // System.out.println("Sum of Rectangle :"+ findSum2(arr, l1, r1, l2, r2));
        System.out.println("Sum of Rectangle :"+ findSum3(arr, l1, r1, l2, r2));
    
    }
    
    
}


/* 
Method 2 : Pre-Calculating the horizontal sum  for each row in the matrix.


*/