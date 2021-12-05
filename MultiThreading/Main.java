package MultiThreading;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread1 = new MyThread();

        //Two ways to create a thread

        MyRunnable runnable1 = new MyRunnable();
        Thread thread2 = new Thread(runnable1);

        thread1.setDaemon(true);
        //thread2.setDaemon(true);
        //Threads no longer user threads
        thread1.start();
        //thread1.join(); //Calling thread wait until thread dies or for n milliseconds
        thread2.start();

        System.out.println(1/0); //Intentional interruption

        //As there are no more user threads the JVM will terminate
    }
}
