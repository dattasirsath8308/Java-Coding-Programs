
//  Q : add two number without using + operator.

public class AdditionWithoutUsingPlus {

    public static void main(String[] args) {
        
        addition();
    }

    static void addition()
    {
        int a = 10 ;
        int b = 20 ;

        // int sum = a - (-b);
        int sum =  Math.addExact(a,b);

        System.out.println(sum);

    }
   
}
