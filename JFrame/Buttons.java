package JFrame;

import javax.swing.*;
import java.awt.*;

public class Buttons{

    //Assuming only one frame will be open at a time

    public static void main(String[] args)
    {
        JFramer frame = new JFramer(800, 600, "Test", "JFrame\\Diamond.png", true);
        frame.setLayout(null);

        ImageIcon icon = new ImageIcon("JFrame\\Diamond.png");

        JButton button = new JButton();
        frame.add(button);
        button.setBounds(100, 100, 200, 300);
        button.setText("Button");
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setFont(new Font("Arial", Font.PLAIN, 40));
        button.setIconTextGap(-10);
        button.setForeground(Color.DARK_GRAY);
        button.setBackground(Color.BLUE);
        button.setBorder(BorderFactory.createEtchedBorder());
        button.setFocusable(false);
        button.setIcon(icon);
        button.addActionListener(e -> System.out.println("A"));
        //button.setEnabled(false);

        frame.revalidate();
    }
}
