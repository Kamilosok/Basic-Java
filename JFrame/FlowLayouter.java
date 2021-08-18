package JFrame;

import javax.swing.*;
import java.awt.*;

public class FlowLayouter {
    public static void main(String[] args)
    {
        JFramer frame = new JFramer(800, 600, "FlowLayout", "", true);

        //By default frames use BorderLayout
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        //Setting where the content aligns and gap size
        //The FlowLayout puts components in a row, sized at their preferred size

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(180, 200));
        panel.setBackground(Color.blue);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        //Panels by default use FlowLayout
        frame.add(panel);


        //I didn't bother with using arrays
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("9");
        JButton button9 = new JButton("9");

        button1.setFocusable(false);
        button2.setFocusable(false);
        button3.setFocusable(false);
        button4.setFocusable(false);
        button5.setFocusable(false);
        button6.setFocusable(false);
        button7.setFocusable(false);
        button8.setFocusable(false);
        button9.setFocusable(false);

        button1.addActionListener(e -> {
            frame.setLayout(new FlowLayout(FlowLayout.CENTER));
            frame.revalidate();
        });
        button2.addActionListener(e -> {
            frame.setLayout(new FlowLayout(FlowLayout.LEFT));
            frame.revalidate();
        });
        button3.addActionListener(e -> {
            frame.setLayout(new FlowLayout(FlowLayout.LEADING));
            frame.revalidate();
        });
        button4.addActionListener(e -> {
            frame.setLayout(new FlowLayout(FlowLayout.RIGHT));
            frame.revalidate();
        });
        button4.addActionListener(e -> {
            frame.setLayout(new FlowLayout(FlowLayout.TRAILING));
            frame.revalidate();
        });


        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);


        frame.revalidate();
    }
}
