package SimpleGraphics;

import Encapsulation2.C;

import javax.swing.*;
import java.awt.*;

public class GraphicsPanel extends JPanel {

    GraphicsPanel()
    {
        this.setPreferredSize(new Dimension(500,500));
    }
    public void paint(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(5));
        g2.setColor(Color.red);
        g2.drawLine(0,0,500,500);
        //g2.drawRect(0,0,500,500);
        g2.fillRect(0,0,200,300);
        g2.setColor(Color.blue);
        g2.drawOval(200,100,300,100);
        g2.drawArc(100,100,300,150, 90,180);
        g2.setColor(Color.cyan);
        g2.drawPolygon(new int[] {50,100,200}, new int[] {50,100,0}, 3);
        g2.setFont(new Font("Arial", Font.PLAIN, 20));
        g2.drawString("AAAAAAAAAA", 200, 350);
    }
}
