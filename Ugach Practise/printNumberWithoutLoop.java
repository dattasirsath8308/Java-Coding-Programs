


public class printNumberWithoutLoop {
    
    // global varible 
    // static int No = 1 ;


    public static void main(String[] args) {

        int n = 50 ;
        // printNumber(n);

        printNumber(n, 1);

        System.out.println("\nReverse Order :");
        ReverseOrder(n);

    }
    

    public static void printNumber(int n, int No)
    {

        if( No <= n )
        {
            System.out.println(No);
            // No++;
        }
        else
        {
            return;
        }

        printNumber(n , No + 1);
        // return printNumber(n) + 1 ;
    }

    public static void ReverseOrder(int n)
    {
        if( n > 0)
        {
            System.out.println(n);
        }else
        {
            return;
        }

        ReverseOrder(n-1);
    }
}
