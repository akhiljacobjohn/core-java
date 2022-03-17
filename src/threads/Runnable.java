package threads;

public class Runnable implements java.lang.Runnable {

    @Override
    public void run() {
        System.out.println("Thread is running now");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable());
        thread.start();

    }
}
