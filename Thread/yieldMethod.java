// package Thread;

/* 
 
	- How we can prevent thread Execution 
		- By Using 3 method we can 
		1. Yield() 
            - The yield() method pauses the execution of current thread and allows another thread of equal or higher priority that are waiting to execute. Currently executing thread give up the control of the CPU.  The general form of yield() method is as follows
			-  yield() method causes to pause current executing thread for giving the chance to remaining waiting threads of same priority.
			- If there are no waiting thread or all waiting thread have low priority then the same thread will continue its execution once again.
			- the Thread which is yieded when it will get chance once again for execution is decided by ThreadSchedular & we can't expect exactly.

            
 */

class Demo extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            Thread.yield();
            System.out.println("Child Thread");
        }
    }
}

public class yieldMethod {

    public static void main(String[] args) {

        Demo d1 = new Demo();
        d1.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread");
        }

    }

}

/*
 * - If we are connecting line 1 the both thread wil be executed simultaneosuly
 * & we can't except exceution order.
 * - If we are not commenting line 1, then chance of completing main thread
 * first is high because child thread always calls yield();
 * 
 * 
 */