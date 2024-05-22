import java.util.concurrent.CompletableFuture;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class EvenOddUsingCompatableFuture {

    private static Object object = new Object();

    private static IntPredicate evenCount = i -> i % 2 == 0;
    private static IntPredicate oddCount = i -> i % 2 != 0;

    public static void main(String[] args) {

        CompletableFuture.runAsync(() -> EvenOddUsingCompatableFuture.printNumber(evenCount));

        CompletableFuture.runAsync(() -> EvenOddUsingCompatableFuture.printNumber(oddCount));
        
        try {
            Thread.sleep(1000);
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void printNumber(IntPredicate condition) {
        IntStream.range(1, 10).filter(condition) .forEach(EvenOddUsingCompatableFuture::execute);
    }

    public static void execute(int no) {
        synchronized (object) {
            try {
                System.out.println(Thread.currentThread().getName() + " : " + no);
                object.notify();
                object.wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
