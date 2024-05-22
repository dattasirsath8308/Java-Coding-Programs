import java.lang.reflect.Constructor;

import javax.print.attribute.standard.MediaSize.NA;

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



public class prototype3 {
    public static void main(String[] args) throws Exception {
        
        Bike b1 = new Bike("Shine");
        b1.getBike();
        System.out.println(b1);

        Bike b2 = (Bike) b1.clone();
        System.out.println(b2);
        
        b2.setName("Hero Honda");
        
        System.out.println("After setting copy Object : "+b2);

    }
}
