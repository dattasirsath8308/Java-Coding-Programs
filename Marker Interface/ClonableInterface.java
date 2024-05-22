

/* 
Cloneable interface : Cloneable interface is present in java.lang package. There is a method clone() in Object class. A class that implements the Cloneable interface indicates that it is legal for clone() method to make a field-for-field copy of instances of that class. 
Invoking Object’s clone method on an instance of the class that does not implement the Cloneable interface results in an exception CloneNotSupportedException being thrown. By convention, classes that implement this interface should override Object.clone() method. 

*/


public class ClonableInterface implements Cloneable {


    private String name;
    private int age;

    public ClonableInterface(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }



    public static void main(String[] args) {
        

        try {
            
            
            ClonableInterface c1 = new ClonableInterface("Datta Bhau", 23);
            System.out.println("Original \nName :"+c1.name +" & Age : "+c1.age);
            System.out.println(c1.hashCode());
            
            ClonableInterface c2 =(ClonableInterface) c1.clone();
            System.out.println("Shallow Copy \nName :"+c1.name +" & Age : "+c1.age);
            System.out.println(c2.hashCode());

        
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
