// package Thread._OverloadingRunMethod.*;


/* 
    -  Overriding run() Method 
    -   Overloading of the run() method is possible but Thread class start() will always call no argument run() Only. but the other run() we have to call explicitly just like a normal method call.

 */

 class Demo extends Thread
 {
 
    // non parameterized run() method will called. 
    public void run()
    {
        System.out.println("run()");
    }

    public void run(int i)
    {
        System.out.println("run(int i)");
    }

 }
 
 
 
 public class _OverloadingRunMethod {
 
     public static void main(String[] args) {
         
         
         Demo d1 = new Demo();
 
        //  Thread t1 = new Thread(d1);
         
         d1.start();
 
     }
 
     
 }
 