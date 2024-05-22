import java.util.Scanner;


/* 

Q : Given a square matrix , turn it by 90 degrees in clockwise direction without using any extra space.

INput : 
1 2 3
4 5 6
7 8 9


Ouptut : 
7 4 1
8 5 2
9 6 3


*/
public class _4_MatrixToClockwise {

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


        System.out.println("Input Matrix");
        printArray(arr);


        rotate1(arr,r); // r means degree
        // rotate2(arr,r);
        // rotateMatrix(arr,r);

        System.out.println("Rotation of Matrix");
        printArray(arr);


    }
    

    // static void  printMatrix(){}

    static void printArray(int[][] Matrix)
    {
        for (int i = 0; i < Matrix.length; i++) {
            for (int j = 0; j < Matrix[i].length; j++) {
                System.out.print(Matrix[i][j] +" ");
            }
            System.out.println();
        }

    }


    // (arr,r);

    // where n = r = c meas this a sqaure matrix so 
    static void rotate1(int[][] Matrix, int n)
    {
        // 1. transpose
        transposeInPlace(Matrix, n, n);

        // 2. Reverse each row of transposed Matrix
        for (int i = 0; i < n; i++) {

            reverseArray(Matrix[i]);

        }
        

    }


    static void reverseArray(int []Matrix)
    {
        int i = 0 , j = Matrix.length -1;

        while(i < j)
        {
            int temp =  Matrix[i];
            Matrix[i] = Matrix[j];
            Matrix[j] = temp;
            i++;
            j--;
        }
    }




    // static int[][] findTranspose(int[][] Matrix, int row, int col)
    // {
    //     // where row convert to col means so below condtion
    //     int[][] ans = new int[col][row];

    //     for (int i = 0; i < col; i++) {
    //         for (int j = 0; j < row; j++) {
    //             ans[i][j] = Matrix[j][i];
    //         }
    //     }

    //     return ans;
    // }


    static void transposeInPlace(int[][] Matrix, int row, int col)
    {
        for (int i = 0; i < col; i++) {
            // for (int j = 0; j < row; j++) {
                //  j = i Every index start from diagonal 
                for (int j = i; j < row; j++) {
                int temp =  Matrix[i][j];
                Matrix[i][j] =  Matrix[j][i];
                Matrix[j][i] = temp;

            }
        }
    }


    static void rotate2(int[][] matrix, int n) {
        // Transpose and reverse combined
        for (int i = 0; i < n; i++) {
            // Transpose
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
            // Reverse
            int left = 0, right = n - 1;
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }
    

    static void rotateMatrix(int[][] matrix, int n) {
        // 1. Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    
        // 2. Reverse each row of the transposed matrix
        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = n - 1;
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }
    

    
}
