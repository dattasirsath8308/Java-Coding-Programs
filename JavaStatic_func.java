

// @FunctionalInterface
@FunctionalInterface
interface funInterface
{
    
    static void staMethod()
    {
        System.out.println("ghe bhau static ");
    }

    void fun();

    default void ghe()
    {
        System.out.println("this is default method");
    }

}

class  Derived  implements funInterface
{
    public void fun()
    {
        System.out.println("Java Khealayla");
    }

    @Override
    public void ghe() {
        // TODO Auto-generated method stub
        funInterface.super.ghe();
    }


}
 

public class JavaStatic_func {
    
    public static void main(String[] args) {


        funInterface.staMethod();

        funInterface f = () -> System.out.println("method");
        System.out.println(f);

        Derived d = new Derived();
        d.fun();;
        d.ghe();

        
    }

}
