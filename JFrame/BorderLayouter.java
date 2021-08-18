package JFrame;

import javax.swing.*;
import java.awt.*;

public class BorderLayouter {
    public static void main(String[] args)
    {
        //BorderLayout places components in five areas: NORTH, SOUTH, WEST, EAST and CENTER
        JFramer frame = new JFramer(500, 500, "BorderLayout", "JFrame\\Diamond.png", true);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.red);
        panel2.setBackground(Color.green);
        panel3.setBackground(Color.yellow);
        panel4.setBackground(Color.magenta);
        panel5.setBackground(Color.blue);

        panel1.setPreferredSize(new Dimension(0, 100));
        panel2.setPreferredSize(new Dimension(50, 0));
        panel3.setPreferredSize(new Dimension(50, 0));
        panel4.setPreferredSize(new Dimension(0, 100));
        //panel5.setPreferredSize(new Dimension(0, 0));


        frame.setLayout(new BorderLayout(10, 10));
        //Set margin for width and height

        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.WEST);
        frame.add(panel3, BorderLayout.EAST);
        frame.add(panel4, BorderLayout.SOUTH);
        frame.add(panel5, BorderLayout.CENTER);

        //-Subpanels-

        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();
        JPanel panel8 = new JPanel();
        JPanel panel9 = new JPanel();
        JPanel panel10 = new JPanel();

        panel6.setBackground(Color.black);
        panel7.setBackground(Color.darkGray);
        panel8.setBackground(Color.gray);
        panel9.setBackground(Color.lightGray);
        panel10.setBackground(Color.white);

        panel5.setLayout(new BorderLayout(5, 5));

        panel6.setPreferredSize(new Dimension(0, 50));
        panel7.setPreferredSize(new Dimension(50, 0));
        panel8.setPreferredSize(new Dimension(50, 0));
        panel9.setPreferredSize(new Dimension(0, 50));
        panel10.setPreferredSize(new Dimension(0, 0));

        panel5.add(panel6, BorderLayout.NORTH);
        panel5.add(panel7, BorderLayout.WEST);
        panel5.add(panel8, BorderLayout.EAST);
        panel5.add(panel9, BorderLayout.SOUTH);
        panel5.add(panel10, BorderLayout.CENTER);







        frame.revalidate();
    }

}
