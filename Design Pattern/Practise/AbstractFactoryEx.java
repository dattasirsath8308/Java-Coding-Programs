
// package Practise;


/*
                   Propety i
             Father          Son
     
           
             AbstactFactoryProprty a-c
        FatherFactory        SonFactory

        
        PropetyFactory  

*/


interface Property {
    int estate();
    String name();
}

class Father implements Property {
    public int estate()
    {
        System.out.println("Father Class estate");
        return 1500000;
    }

    public String name()
    {
        System.out.println("I am Father");
        return "Father Estate";
    }
}


class Son implements Property {
    
    public int estate()
    {
        System.out.println("Son Class estate");
        return 500000;
    }

    public String name()
    {
        System.out.println("I am Son");
        return "Son Estate";
    }
}

abstract class AbstractFactoryEstate
{
    public abstract Property getProperty();
}


class FatherFactory extends AbstractFactoryEstate
{
    public Property getProperty()
    {
        return new Father();
    }
}

class SonFactory extends AbstractFactoryEstate
{
    public Property getProperty()
    {
        return new Son();
    }
}


class EstateFactory
{
    public static Property getEstate(AbstractFactoryEstate abstractFactoryEstate)
    {
        return abstractFactoryEstate.getProperty();
    }
}


public class AbstractFactoryEx {

    public static void main(String[] args) {


        Property p1 = EstateFactory.getEstate(new FatherFactory());
        int amount1 =  p1.estate();
        System.out.println("Total Estate :  "+amount1 +" , "+p1.name());

        
        Property p2 = EstateFactory.getEstate(new SonFactory());
        int amount2 =  p2.estate();
        System.out.println("Total Estate :  "+amount2 +" , "+p2.name());  
    }
}
