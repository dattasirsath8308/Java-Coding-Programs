

/*
 3. Write a program to create immutable class .

 */


 final class Demo
{

    private final int id;
    private final String name;

    
    public Demo(int id, String name)
    {
        this.id = id;
        this.name = name;
    }


    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "id :"+ id +" , Name :"+name;
    }
}




public class _3_ImmutableClass {

    public static void main(String[] args) {
        
        Demo d = new Demo(10, "Datta");
        System.out.println(d);
    }
}
