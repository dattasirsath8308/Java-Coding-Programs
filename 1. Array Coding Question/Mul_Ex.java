
class B {
    void m2() {
        System.out.println("m2 method");
    }
}


// class B {
//     void m2() {
//         System.out.println("m2 method");
//     }
// }

interface A {
     void m1();
}


class C extends B implements A {
    @Override
    public void m1() {
        System.out.println("m1");
    }
}


// class C extends B implements A {

    
//     void m1() {
//         System.out.println("m1");
//     }

// }

class Mul_Ex {

    public static void main(String[] args) {
        
        C obj = new C();
        obj.m1();  // This will call the m1 method from class C
        obj.m2();  // This will call the m2 method from class B

    }

}




// interface A {
//     void m1();
// }


// public class Mul_Ex {
//     public static void main(String[] args) {
//         C obj = new C();
//         obj.m1();  // This will call the m1 method from class C
//         obj.m2();  // This will call the m2 method from class B
//     }
// }
