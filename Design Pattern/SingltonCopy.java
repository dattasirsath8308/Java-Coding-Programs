

class Example
{

    private static Example ex;

    private Example()
    {

    }

    public synchronized static Example getInstace()
    {
        if(ex == null)
        {
            ex = new Example();
        }
        return ex;
    }
}


public class SingltonCopy {
    
    public static void main(String[] args) {
            
        Example eobj = Example.getInstace();
        System.out.println(eobj.hashCode());
        System.out.println(Example.getInstace().hashCode());


    }
}
