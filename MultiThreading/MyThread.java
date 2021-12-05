package MultiThreading;

public class MyThread extends Thread{

    @Override
    public void run()
    {
        for(int i=0; i<10; i++)
        {
            System.out.println("Thread #1: " + i);
            try {
                Thread.sleep(500);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread #1 is finished");
    }
}
