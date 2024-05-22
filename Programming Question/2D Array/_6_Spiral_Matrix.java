import java.util.Scanner;

/*

- Spiral Matrix
Q : Given an n x m  Matrix 'a' , return all element of the matrix in spiral order.


Input 
1 2 3
4 5 6
7 8 9

Output

1 2 3 -> 6 9 -> 8 7 -> 4 5
means Spiral Order is  : 1 2 3 6 9 8 7 4 5


*/

public class _6_Spiral_Matrix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("The Array : ");
        System.out.println("Enter the No of Rows : ");
        int r = sc.nextInt();
        System.out.println("enter the No of Column in  Rows : ");
        int c = sc.nextInt();

        int[][] arr = new int[r][c];
        int totalElement = r * c;
        System.out.println("Enter total " + totalElement + " element the row" + r + " *  Col " + c + " Matrix :");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Input Matrix");
        printArray(arr);

        System.out.println("Spiral Order ");
        // printArray(arr);
        printSpiralOrder(arr, r, c);

    }

    // static void printMatrix(){}

    static void printArray(int[][] Matrix) {
        for (int i = 0; i < Matrix.length; i++) {
            for (int j = 0; j < Matrix[i].length; j++) {
                System.out.print(Matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    //

    static void printSpiralOrder(int[][] arr, int r, int c) {

        int topRow = 0, bottomRow = r - 1, leftCol = 0, rightCol = c - 1;
        int totalElement = 0;

        while (totalElement < r * c) {

            // 1. topRow -> leftCol to rightCol
            for (int j = leftCol; j <= rightCol && totalElement < r * c ; j++) {
                System.out.print(arr[topRow][j] + " ");
                totalElement++;
            }
            topRow++;

            // 2. rightCol -> topRow to bottomRow
            for (int i = topRow; i <= bottomRow && totalElement < r * c; i++) {
                System.out.print(arr[i][rightCol] + " ");
                totalElement++;
            }
            rightCol--;

            // 3. bottomRow -> rightCol to leftCol
            for (int j = rightCol; j >= leftCol && totalElement < r * c; j--) {
                System.out.print(arr[bottomRow][j] + " ");
                totalElement++;
            }
            bottomRow--;

            // 4. leftCol -> bottomRow to topRow
            for (int i = bottomRow; i >= topRow && totalElement < r * c; i--) {
                System.out.print(arr[i][leftCol] + " ");
                totalElement++;

            }
            leftCol++;
        }

    }

}
