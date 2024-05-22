import java.util.Scanner;

/*
 Write a program to display a transpose of matrix entered by the user.
 Note : Rows convert to column 

 Input 
 1 2 3
 4 5 6
 7 8 9

 Output
 1 4 7
 2 5 8
 3 6 9



*/

public class _3_Matrix_Transpose {

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

        // printArray(arr);

        System.out.println("Input Matrix");
        printArray(arr);

        System.out.println("Transpose of Matrix");
       

        // int[][] ans = findTranspose(arr, r, c);
        // System.out.println(ans);

        transposeInPlace(arr, r, c);
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


    static int[][] findTranspose(int[][] Matrix, int row, int col)
    {
        // where row convert to col means so below condtion
        int[][] ans = new int[col][row];

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                ans[i][j] = Matrix[j][i];
            }
        }

        return ans;
    }


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

}



