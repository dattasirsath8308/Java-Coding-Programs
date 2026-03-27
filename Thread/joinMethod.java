/* 
 
	- How we can prevent thread Execution 
		- By Using 3 method we can 
		2. join() 
            - : The join() method is used to make a thread wait for another thread to terminate its process. 
			- If a Thread want to wait until completing some other Thread then we should go for join() method.
			- If  Thread t1  execute t2.join() then t1 thread will entered into waitaing state until t2 completes onece t2 completes then t1 will continue its execution.
            - join() Method is overloaded and every join() Throw InteruptedException. Hence , when ever we are using join(), Compulsory we should handle InteruptedException, either by try-catch or by throws other wise we will get compile Error.
            
 */

 class Demo extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Child Thread");
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

public class joinMethod {

    public static void main(String[] args) throws InterruptedException {

        Demo d1 = new Demo();
        d1.start();
        d1.join();

        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread");
        }

    }

}

