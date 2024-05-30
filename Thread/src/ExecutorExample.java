import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample {
    public static void main(String[] args) {
        // Create an executor service with a fixed-size thread pool
        ExecutorService executor = Executors.newFixedThreadPool(5);

        // Submit tasks for execution
        for (int i = 0; i < 10; i++) {
            executor.submit(() -> {
                String threadName = Thread.currentThread().getName();
                System.out.println("Task executed by thread: " + threadName);
            });
        }

        // Shutdown the executor service
        executor.shutdown();
    }
}