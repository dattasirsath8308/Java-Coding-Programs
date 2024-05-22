
class ABC {
    // instance variable of the class ABC
    int x = 30;
}

public class DeepCopy {
    // main method
    public static void main(String argvs[]) {
        // creating an object of the class ABC
        ABC obj1 = new ABC();

        // Deep copy stores copies of the object’s value.
        ABC obj2 = new ABC();

        // updating the value to 6 using the reference variable obj2
        obj2.x = 6;
        System.out.println("obj1 : "+obj1.hashCode());
        System.out.println("obj2 : "+obj2.hashCode());

        // printing the value of x using reference variable obj1
        System.out.println("obj1 : The value of x is: " + obj1.x);
        System.out.println("obj2 : The value of x is: " + obj2.x);

    }
}

// public class DeepCopy {

// public static void main(String[] args) {

// }
// }
