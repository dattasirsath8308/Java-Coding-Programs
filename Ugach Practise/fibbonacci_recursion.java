

//  0 1 2 3 4 5 6 7  8  9  10

//  0 1 1 2 3 5 8 13 21 34 55
//  fn = n-1 + n-2


public class fibbonacci_recursion {

    public static void main(String[] args) {
        
        int n = 10 ;
        System.out.println(findNFibo(n));

        System.out.println("\n\n");
        fib(10);
    }


    public static int findNFibo(int n)
    {
        if(n == 0 || n == 1)
            return n;


        return findNFibo(n-1) + findNFibo(n -2); // 9(34)  8(21)  // 34 + 21 = 55 

    }



    static void fib(int n)
    {
        int No1 = 0 , No2 = 1 ;

        for (int i = 0; i < n; i++) {
            
            System.out.print(No1 + ", ");
            int No3 = No1 + No2;
            No1 = No2;
            No2 = No3;
        }
    }
    
}
