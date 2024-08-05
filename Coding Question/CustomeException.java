
/* 
 		- It highly recommended to keep our customized Exception class as unchecked, i.e we have to extend Runtime Exception  class but not Exception class while defining our customized Exception.


 */

class NotEligibleForVoteException extends RuntimeException
{
    NotEligibleForVoteException(String msg)
    {
        super(msg);
    }
}


public class CustomeException {

    public static void checkEligibility(int age) throws NotEligibleForVoteException
    {

        if(age < 18)
        {
            throw new NotEligibleForVoteException("You are Not Eligible for Vote coz of ur are underage");
        }else
        {
            System.out.println("You are eligible for vote");
        }
    }  

    public static void main(String[] args) {
        

        int []age = {17, 18, 2,99};

        for (int i : age) {
            try {
                checkEligibility(i);
            } catch (Exception e) {
                System.out.println("Error :  "+ e.getMessage() );
            }
        }
        
    }
    
}
