package SimpleAnimation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleAnimationPanel extends JPanel implements ActionListener {

    final int width = 500, height = 500;

    Image image;
    Timer timer;
    int xVel=3, yVel=4;
    int x,y;

    SimpleAnimationPanel()
    {
        image = new ImageIcon("Test.png").getImage();
        timer = new Timer(10, this);
        timer.start();

        this.setBackground(Color.black);
        this.setPreferredSize(new Dimension(width,height));
        this.setOpaque(true);
    }

    public void paint(Graphics g)
    {
        super.paint(g);
        //Paints background
        Graphics2D g2 = (Graphics2D) g;

        g2.drawImage(image, x,y,null);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        x+=xVel;
        y+=yVel;
        if(x+image.getWidth(null)>width||x<0)
            xVel*=-1;
        if(y+image.getHeight(null)>height||y<0)
            yVel*=-1;
        repaint();
    }
}
