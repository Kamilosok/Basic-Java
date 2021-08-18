package ProgressBar;

import javax.swing.*;
import java.awt.*;

public class ProgressBarFrame {

    JFrame frame;
    JProgressBar bar;

    ProgressBarFrame()
    {
        frame = new JFrame();
        bar = new JProgressBar();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Progress Bars");
        frame.setSize(600, 600);
        frame.setLayout(null);
        frame.setResizable(false);

        bar.setMinimum(0);
        bar.setMaximum(200);
        bar.setValue(200);

        bar.setStringPainted(true);

        bar.setBounds(0,0,600, 200);
        bar.setFont(new Font("Times New Roman", Font.BOLD, 40));
        bar.setForeground(Color.red);
        bar.setBackground(Color.black);

        frame.add(bar);

        frame.setVisible(true);


        fill();
    }

    public void fill()
    {
        while(bar.getValue() > 0)
        {
            bar.setString(bar.getValue() + " / " + bar.getMaximum());
            bar.setValue(bar.getValue() - 1);
            try
            {
                Thread.sleep(50);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }

        bar.setString("DONE");
    }
}
