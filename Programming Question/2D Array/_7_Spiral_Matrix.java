import java.util.Scanner;

/*
Q : given a position integer n , generate an n x n matrix filled with element from 1 to n^2  in spiral orfer . 

Input 
n = 3

output 
1 2 3
8 9 4
7 6 5

means -> 1 2 3 4 5 6 7 8 9



*/

public class _7_Spiral_Matrix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // System.out.println("The Array : ");
        System.out.println("Enter the size : ");
        // int n = sc.nextInt();

        int n = sc.nextInt();
      

        System.out.println("Spiral Order ");
        int[][] matrix =  generateSpiralOrder(n);
        printArray(matrix);

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

    static int[][] generateSpiralOrder(int n) {

        int[][] arr = new int[n][n];

        int topRow = 0, bottomRow = n - 1, leftCol = 0, rightCol = n - 1;
        int currentElement = 1;

        while (currentElement <= n * n) {

            // 1. topRow -> leftCol to rightCol
            for (int j = leftCol; j <= rightCol && currentElement <= n * n; j++) {
                arr[topRow][j] = currentElement++;
                // currentElement++;
            }
            topRow++;

            // 2. rightCol -> topRow to bottomRow
            for (int i = topRow; i <= bottomRow && currentElement < n * n; i++) {
                arr[i][rightCol] = currentElement++;
            }
            rightCol--;

            // 3. bottomRow -> rightCol to leftCol
            for (int j = rightCol; j >= leftCol && currentElement < n * n; j--) {
                arr[bottomRow][j] = currentElement++;
            }
            bottomRow--;

            // 4. leftCol -> bottomRow to topRow
            for (int i = bottomRow; i >= topRow && currentElement < n * n; i--) {
                arr[i][leftCol] = currentElement++;

            }
            leftCol++;
        }
        return arr;
    }

}
