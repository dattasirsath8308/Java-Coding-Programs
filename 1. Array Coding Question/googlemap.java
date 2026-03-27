
package p;
class A {
    void print()
    {
        System.out.println(" Class A");
    }


    package q;
class B extends A {
    void print()
    {
        System.out.println(" Class A");
    }


}

/**
 *  
 */
 interface A   {

    void routeA();
}


interface b   {

    void routeB();
    
}


class A {

}


//  Hide


 class googmap implements A , b
{
    void  routeA()
    {
        System.out.println("Here ROute  of point A ");
    }


    
    void  routeB()
    {
        System.out.println("Here ROute  of point B ");
    }


}


public class googlemap{

    public static void main(String[] args) {
        

        googmap g = new googmap();
        g.routeA();
        g.routeB();



    }
    
}
