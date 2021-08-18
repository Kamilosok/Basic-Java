package JFrame;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Labels
{
    public static void main(String[] args)
    {
        JFramer frame = new JFramer(600, 600, "Labels", "JFrame\\Diamond.png", true);
        frame.setLayout(null);
        //Set bounds manually

        JLabel label = new JLabel();
        frame.add(label);
        //JLabel displays strings and/or images

        label.setText("Test text");
        ImageIcon image = new ImageIcon("JFrame\\Diamond.png");
        Border border = BorderFactory.createLineBorder(Color.GREEN, 5);

        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.GREEN); //Set font color
        label.setFont(new Font("Times New Roman", Font.PLAIN, 40));
        label.setIconTextGap(-20);
        label.setBackground(Color.BLACK);
        label.setOpaque(true); //If true, the label paint every pixel within its bounds to its background colour
        label.setBorder(border);

        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(200, 200, 200, 200);

        frame.pack(); //Automatically accomodate labels in frame





    }
}
