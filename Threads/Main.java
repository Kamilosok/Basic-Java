package Threads;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread.currentThread().setName("Mainer");
        Thread.currentThread().setPriority(7); //Priority 1-10
        System.out.println(Thread.activeCount());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(Thread.currentThread().isAlive());

        for(int i=3; i>0; i--)
        {
            System.out.println(i);
            Thread.sleep(500);
        }
        System.out.println("End");

        MyThread thread2 = new MyThread();
        thread2.setDaemon(true);

        thread2.run(); //Can be run but will not start the thread
        System.out.println(thread2.isAlive());

        thread2.start(); //Executes the run once automatically
        System.out.println(thread2.isAlive());

        thread2.setName("Thread2");
        System.out.println(thread2.getName());
        System.out.println(thread2.getPriority()); //Inherits the priority of the thread that created it

        //The JVM exits when the only threads running are all daemon threads / none

        System.out.println(thread2.isDaemon());

    }
}
