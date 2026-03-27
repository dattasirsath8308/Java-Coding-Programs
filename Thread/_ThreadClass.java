

class Demo extends Thread
{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
}



public class _ThreadClass {

    public static void main(String[] args) {
        
        
        Demo d1 = new Demo();

        // Thread t1 = new Thread(d1); // No need to create 
        
        d1.start();

        // t1.start();  //  java.lang.IllegalThreadStateException coz t1 thread stated already here we try to restart it again that the reason.
    }

    
}
