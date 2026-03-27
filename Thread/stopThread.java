
/* 
 Why is stop() Method Deprecated in Java?
In the early days of Java, Thread class defined a stop() method that simply terminates a thread. But later on Java 1.2 version, stop() method had been deprecated. This is because this method is “inherently unsafe” and can cause serious problem sometimes. Therefore, it should not be used in the program for thread safety.

An interviewer can ask you an interesting question that what logic will you use to stop a thread in the place of stop() method because stop() method had been deprecated from Java 1.2.

Basically, there are two ways through which we can easily stop a thread in java program. They are:

1. By using boolean variable.
2. By using isInterrupted() method

 */



 //  1. topping a thread by using boolean variable
 
 public class stopThread extends Thread{
    boolean stop = false;
    public void run()
    {
       System.out.println("Thread is running");
       int i = 0;
       while(i < 10)
       {
         System.out.println("i: " +i);
         if(i == 5)
         if(stop == true) // Come out of run() method.
           return;	   
           i = i + 1;
       }
    }
    public static void main(String[] args) 
    {
        stopThread th1 = new stopThread();
        Thread t1 = new Thread(th1);
       t1.start();
       th1.stop = true;
     }
    }

// public class stopThread {
    
// }



/* 

// Stopping a thread by using isInterrupted() method

public class Thread1 extends Thread {	
    public void run()
    {
      System.out.println("Thread is running");
      int i = 0;
      while(i < 10)
      {
        System.out.println("i: " +i);
        if(i == 5)
        if(!Thread.currentThread().isInterrupted()) // Come out of run() method.
        {
           System.out.println("Status of thread: " +!Thread.currentThread().isInterrupted());
           return;
        }
        i = i + 1;  
      }
    }
    public static void main(String[] args) 
    {
       Thread1 th1 = new Thread1();
       Thread t1 = new Thread(th1);
       t1.start();
     }
    }

    */