// package Thread;


class Demo implements Runnable
{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
}



public class _RunnableInterface {

    public static void main(String[] args) {
        
        
        Demo d1 = new Demo();

        Thread t1 = new Thread(d1);
        
        t1.start();

    }

    
}
