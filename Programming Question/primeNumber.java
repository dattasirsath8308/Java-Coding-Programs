

public class primeNumber {
    
    public static void main(String[] args) {
        

        int Number = 15 ;
        boolean b = false;

        for (int i = 2; i < Number /2; i++) {
            
            if(Number % i == 0  )
            {
                b = true;
                break;
            }

        }

        if(!b )
        {
            System.out.println("The is Prime");
        }
        else
        {
            System.out.println("The is NOt  Prime");

        }
    }
}
