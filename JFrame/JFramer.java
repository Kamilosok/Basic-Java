package JFrame;

import javax.swing.*;
import java.awt.*;

public class JFramer extends JFrame
{
    JFramer(int width, int height, String name, String iconPath , boolean resizable)
    {
        this.setSize(width, height);
        this.setTitle(name);
        this.setResizable(resizable);
        this.setVisible(true);

        ImageIcon image = new ImageIcon(iconPath);
        this.setIconImage(image.getImage());

        this.getContentPane().setBackground(new Color(100, 50, 150));
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
    }
    //Basic window opener
}
