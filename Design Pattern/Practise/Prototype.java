

import java.lang.reflect.Constructor;

class Bike implements Cloneable
{
    private String  name;

    public Bike(String name)
    {
        this.name = name;
    }

    public void getBike() throws Exception
    {
        this.name = "Bike Name is " ;
        Thread.sleep(6000);
    }


    public String getName() {
        return name;
    }

    public void setName(String name)  {
        this.name = name;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return this.name;
    }

}



public class Prototype {
    public static void main(String[] args) throws Exception {
        
        Bike b1 = new Bike("Shine");
        // b1.getBike();
        System.out.println(b1.getName());
       
        Bike b2 = (Bike) b1.clone();
        System.out.println(b2.getName());
       
        
        b2.setName("Hero Honda");
        System.out.println("After setting copy Object : "+b2);
       

    }
}
