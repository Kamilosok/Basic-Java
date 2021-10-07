package DragAndDrop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class DragPanel extends JPanel {

    ImageIcon icon = new ImageIcon("Test.png");
    final int width = icon.getIconWidth();
    final int height = icon.getIconHeight();
    Point imageCorner;
    Point prevP;

    DragPanel()
    {
        imageCorner = new Point(0,0);
        ClickListener clickListener = new ClickListener();
        DragListener dragListener = new DragListener();
        this.addMouseListener(clickListener);
        this.addMouseMotionListener(dragListener);

        this.setOpaque(true);
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        icon.paintIcon(this, g, (int)imageCorner.getX(), (int)imageCorner.getY());
    }


    private class ClickListener extends MouseAdapter
    {
        public void mousePressed(MouseEvent e)
        {
            prevP = e.getPoint();
        }
    }

    private class DragListener extends MouseMotionAdapter
    {
        public void mouseDragged(MouseEvent e)
        {
            Point currentP = e.getPoint();
            imageCorner.translate((int)(currentP.getX() - prevP.getX()), (int)(currentP.getY() - prevP.getY()));

            prevP = currentP;
            repaint();
        }
    }

}
