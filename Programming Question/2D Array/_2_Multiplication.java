import java.util.Scanner;

public class _2_Multiplication {

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


        multiply(arr, r, c, arr2, r2, c2);
        // add(arr, r, c, arr2, r2, c2);

        

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



    static void multiply(int[][]a ,int r1 , int c1 , int[][]b, int r2 , int c2)
    {
        if(c1 != r2)
        {
            System.out.println("multiplication Not Possible : Wrong demension .");
            return ;
        }

        int[][] mul= new int[r1][c2];

        for (int i = 0; i < r1; i++) { // row Number
            for (int j = 0; j < c2; j++) { // col Number
                // mul[i][j] = ith row of a matrix * jth col of b matrix
                for (int k = 0; k < c1; k++) {
                    mul[i][j] += (a[i][k] * b[k][j]) ;
                }
            }
        }

        System.out.println("Multiplication of 2 Matrix");
        printArray(mul);

    }
}


/*

2
enter the No of Column in  Rows : 
3
Enter the row2 *  Col 3 Matrix :
1 2 1
3 1 2

 ---------------------------
The the 2st Array :
Enter the No of Rows :
3
enter the No of Column in  Rows :
2
Enter the row3 *  Col 2 Matrix :
2 1
1 3
1 1
1st Array
1 2 1 
3 1 2
2nd Array
2 1
1 3
1 1
Multiplication of 2 Matrix
5 8 = 2+2+1 = 5 , 3*1=3+ 1*3 = 3 , 2*1=2  3+3+2=8
9 8

*/