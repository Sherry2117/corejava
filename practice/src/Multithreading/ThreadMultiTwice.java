package Multithreading;

public class ThreadMultiTwice extends Thread{
    @Override
    public void run() {
        super.run();
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        ThreadMultiTwice thread = new ThreadMultiTwice();
        thread.start();
        thread.start();

        }

}

