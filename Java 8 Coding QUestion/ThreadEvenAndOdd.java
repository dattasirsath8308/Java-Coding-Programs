


public class ThreadEvenAndOdd implements Runnable {
    

    Object object;
    static int i = 1 ;


    public ThreadEvenAndOdd(Object object)
    {
        this.object = object;
    }



    @Override
    public void run() {
        
        while(i <= 10)
        {
            if(i % 2 == 0 && Thread.currentThread().getName().equals("even")) //2,4,6
            {
                synchronized(object)
                {
                    System.out.println(Thread.currentThread().getName()+" : "+i);
                    i++;
                    
                    try {
                        object.wait();   
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

            if(i % 2 != 0 && Thread.currentThread().getName().equals("odd")) // 1, 3, 5
            {
                synchronized(object)
                {
                    System.out.println(Thread.currentThread().getName()+" : "+i);
                    i++;
                    object.notify();
                }
            }
        }
    }



    public static void main(String[] args) {
        
        Object obj = new Object();
        Runnable th1 = new ThreadEvenAndOdd(obj);
        Runnable th2 = new ThreadEvenAndOdd(obj);

        new Thread(th1,"even").start();
        new Thread(th2,"odd").start();


    }

}
