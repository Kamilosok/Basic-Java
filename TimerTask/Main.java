package TimerTask;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args)
    {
        //Timer - a facility for threads to schedule tasks for future execution in a background thread
        //TimerTask - A task that can be scheduled for execution by a timer
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int counter=10;
            @Override
            public void run()
            {
                if(counter>0)
                {
                    System.out.println(counter);
                    counter-=1;
                }
                else
                {
                    System.out.println("End");
                    timer.cancel();
                }
            }
        };


        Calendar date = Calendar.getInstance();
        date.set(Calendar.YEAR, 2021);
        date.set(Calendar.MONTH, Calendar.DECEMBER);
        date.set(Calendar.DAY_OF_MONTH, 20);
        date.set(Calendar.HOUR_OF_DAY, 0);
        date.set(Calendar.MINUTE, 0);
        date.set(Calendar.SECOND, 0);
        date.set(Calendar.MILLISECOND, 0);


        timer.scheduleAtFixedRate(task, date.getTime(), 1000);

    }
}
