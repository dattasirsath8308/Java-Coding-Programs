import java.util.Scanner;

/* 
Q : Given an integer n , return the first n row of Pascal's triangle. In Pascal's triangle, each number is the sum of the two numbers directly above it as shown :

                1
              1    1
            1   2   1
          1   3    3  1
         1   4  6    4  1  


*/

public class _5_pascal_Tringle {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the N : ");
        int n =sc.nextInt();

        int[][] ans = pascal(n);
        printArray(ans);

    }

    
    static int[][] pascal(int n)
    {
        int [][]ans = new int[n][];

        for (int i = 0; i < n; i++) {
            
            // ith row has i + 1 columns
            ans[i] = new int[i+1];

            // 1st and last element of every row value is 1 
            ans[i][0] = ans[i][i] = 1 ;


            for (int j = 1; j < i; j++) {
                ans[i][j] = ans[i-1][j] + ans[i-1][j-1];
            }
        }

        return ans; 
    }

    static void printArray(int[][] Matrix)
    {
        for (int i = 0; i < Matrix.length; i++) {
            for (int j = 0; j < Matrix[i].length; j++) {
                System.out.print(Matrix[i][j] +" ");
            }
            System.out.println();
        }
    }

    
}
