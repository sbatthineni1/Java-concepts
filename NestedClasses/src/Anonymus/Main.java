package Anonymus;

public class Main {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("This is runnable task");
            }
        };

        runnable.run();
    }

}
