package JFrame;

import javax.swing.*;
import java.awt.*;

public class Panels {
    public static void main(String[] args)
    {
        JFramer frame = new JFramer(800, 600, "Test", "JFrame\\Diamond.png", true);
        frame.setLayout(null);


        //JPanel a component that functions as a container for other components
        JPanel redPanel = new JPanel();
        frame.add(redPanel);
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 0, 200, 200);

        JPanel bluePanel = new JPanel();
        frame.add(bluePanel);
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(200, 0, 200, 200);

        JPanel greenPanel = new JPanel();
        frame.add(greenPanel);
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0, 200, 400, 200);
        greenPanel.setLayout(null);

        JLabel label = new JLabel("Label here");
        label.setBounds(200, 100, 100, 10);
        greenPanel.add(label);
        //Label can only be in one place at a time

        frame.revalidate();
        //Refresh the frame to account all of the changes


    }
}
