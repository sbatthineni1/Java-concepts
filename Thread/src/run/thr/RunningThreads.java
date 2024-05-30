package run.thr;

public class RunningThreads {
    public static void main(String[] args) {
        System.out.println("Main Thread Running!");
        try {
            System.out.println("Main Thread Paused for one second!");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread  thread = new Thread(() -> {

        });


        System.out.println("Main Thread continues here again");

    }
}
