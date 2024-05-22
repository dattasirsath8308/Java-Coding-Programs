class ABC {
    // instance variable of the class ABC
    int x = 30;
}

public class Ex_ShallowCopy {
    // main method
    public static void main(String argvs[]) {
        // creating an object of the class ABC
        ABC obj1 = new ABC();
        System.out.println(obj1.x);

        // it will copy the reference, not value
        ABC obj2 = obj1;
        System.out.println(obj2.x);

        // updating the value to 6  using the reference variable obj2
        obj2.x = 6;

        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());


        // printing the value of x using reference variable obj1
        System.out.println("The value of x is: " + obj1.x);
    }
}