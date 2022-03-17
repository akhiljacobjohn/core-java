package threads;

public class Threads extends Thread{

    public void run(){
        System.out.println("Thread is running now");
    }


    public static void main(String[] args) {
        Threads thread = new Threads();
        thread.start();
    }



}
