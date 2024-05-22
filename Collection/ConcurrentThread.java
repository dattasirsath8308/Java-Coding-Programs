import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

// package Collection;




public class ConcurrentThread {

    public static void main(String[] args) {
        

        // ArrayList<String> al = new ArrayList<>();
        List<String> al =new CopyOnWriteArrayList();
        al.add("Datta");
        al.add("BHau");
        al.add("Sirsath");
        

        // CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>(al);


        // Runnable t1 = new Runnable() {
        //     @Override
        //     public void run() {
        //     }
        // };


            // Thread 1 : task 1
            Runnable t1 = () -> {
                for (String str: al) {
                    System.out.println(str);
                    
                    try {
                        Thread.sleep(5000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                    
            };


            // Thread 2 : task 2
            Runnable t2 = () -> {

                al.add("Don1");
                al.add("Don2");

            };

            new Thread(t2).start();
            new Thread(t1).start();


    }
    
}
