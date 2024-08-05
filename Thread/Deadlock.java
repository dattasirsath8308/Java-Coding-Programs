

/* 
- What is Deadlock ?
		- Deadlock such a suitation where thread is waiting for Object lock , and that Object lock acquired by second thread , and second thread waiting for object lock that acquired by first thread. 
		- Since both threads are waiting for each other to release the lock simultaneously, this condition is called deadlock in Java. The object locks acquired by both threads are not released until their execution is not completed.	
 
 */

import java.util.zip.CRC32C;

class Cricket
 {

    void bat1(Cricket c2)
    {
        System.out.println("Rohit waiting for when Kohli release lock(Pad) ");
        synchronized(c2)
        {
            System.out.println("Deadlock Occured");
        }
    }

    void bat2(Cricket c1)
    {
        System.out.println("VIrat waiting for when rohit release lock(Pad) ");
        synchronized(c1)
        {
            System.out.println("Deadlock Occured");
        }
    }

 }




 // rohit = Thread1
class Rohit extends Thread
{

    Cricket c1 , c2;
    // Constructor
    Rohit(Cricket c1, Cricket c2)
    {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public void run() {
        synchronized(c1)
        {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
            // Here rohit want virat pads
            c2.bat2(c2);
        }      
    }
}

 // Virat = Thread2
class Virat extends Thread
{

    Cricket c1 , c2;
    // Constructor
    Virat(Cricket c1, Cricket c2)
    {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public void run() {
        synchronized(c2)
        {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
            // Here virat want rohit pads
            c1.bat1(c1);
        }     
    }
}




public class Deadlock {

    public static void main(String[] args) {

        Cricket c1 = new Cricket();
        Cricket c2 = new Cricket();

        Rohit r = new Rohit(c1, c2);
        Virat v = new Virat(c1, c2);

        r.start();
        v.start();

    }
    
}

/* 
 Explanation:

1. First, Thread thread1 starts its execution and synchronizes on the object obj1 that prevents another thread to call method display1 on obj1 reference variable. Thread thread1 then goes to sleep by calling sleep() method and allows Thread thread2 to start its execution.

2. Now Thread thread2 starts its execution and synchronizes on the object reference obj2. It prevents display2() method on the object obj2 to be called by another thread. Thread thread2 goes to sleep by calling sleep() method and allows Thread thread1 to wake up.

3. Thread thread1 continues its execution and tries to call display2() method on obj2. But it cannot call this method on obj2 until the code inside Thread thread2 completes execution.

4. Since Thread thread1 cannot proceed its execution, Thread thread2 gets the control and tries to call display1() method on obj1 which is also not possible until the code inside Thread thread1 completes execution. Thus, neither of threads can continue their execution because they are deadlocked.

 */