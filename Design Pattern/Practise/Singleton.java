


class SingletonClass
{

    private static SingletonClass sc ;

    private SingletonClass()
    {

    }

    //  Thread Synchronizing 
    public synchronized static SingletonClass getInstance()
    {
        if(sc == null)
        {
            sc = new SingletonClass();
        }

        return sc;
    }

}


// Main Class
public class Singleton {
    
    public static void main(String[] args) {


        SingletonClass sc1 = SingletonClass.getInstance();
        System.out.println(sc1.hashCode());

        SingletonClass sc2 = SingletonClass.getInstance();
        System.out.println(sc2.hashCode());
        
    }
}
