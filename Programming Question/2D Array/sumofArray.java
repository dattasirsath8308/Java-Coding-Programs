import java.util.Scanner;

/*
2 3   +  1  2   = 3  5
4 5      3  4     7  9

*/


public class sumofArray {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("The the 1st Array : ");
        System.out.println("Enter the No of Rows : ");
        int r =sc.nextInt();
        System.out.println("enter the No of Column in  Rows : ");
        int c = sc.nextInt();

        int[][] arr =  new int[r][c];

        System.out.println("Enter the row"+r +" *  Col "+c+" Matrix :");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // printArray(arr);

        System.out.println("\n ---------------------------");
        
        System.out.println("The the 2st Array : ");
        System.out.println("Enter the No of Rows : ");
        int r2 =sc.nextInt();
        System.out.println("enter the No of Column in  Rows : ");
        int c2 = sc.nextInt();

        int[][] arr2 =  new int[r2][c2];

        System.out.println("Enter the row"+r2 +" *  Col "+c2+" Matrix :");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        
        System.out.println("1st Array");
        printArray(arr);
        System.out.println("2nd Array");
        printArray(arr2);


        add(arr, r, c, arr2, r2, c2);

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


    static void add(int[][] a, int r1, int c1 , int[][] b, int r2, int c2)
    {
        if(r1 != r2 || c1 != c2)
        {
            System.out.println("Wrong Input : Addition not possible");
            return;
        }


        int[][] sum = new int[r1][c1];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                sum[i][j] = a[i][j] + b[i][j] ;
            }
            System.out.println();
        }


        System.out.println("The Sum of Array is :");
        printArray(sum);

    }




}
