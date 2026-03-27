// package Thread;

/* 
    - If we are not overring run() Method 
    - then Thread class run() will be executed which has empty implementation & Hence we wont get any output.
    - Note : It is highly Recommended to override run() Method.
 */

class Demo extends Thread
{

}



public class _OverridingRunMethod {

    public static void main(String[] args) {
        
        
        Demo d1 = new Demo();

        Thread t1 = new Thread(d1);
        
        t1.start();

    }

    
}
