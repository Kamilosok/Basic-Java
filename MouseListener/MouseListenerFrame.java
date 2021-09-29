package MouseListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseListenerFrame extends JFrame implements MouseListener {


    JLabel label;
    MouseListenerFrame()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Mouse Listener");
        this.setSize(600, 600);

        label = new JLabel();
        label.setBounds(0,0, 300, 300);
        label.setBackground(Color.MAGENTA);
        label.setOpaque(true);
        this.add(label);
        label.addMouseListener(this);

        this.setLayout(null);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //Invoked when the mouse button has been clicked (pressed and released) on the component\
        System.out.println("You clicked on the label with mouse button nr. " + e.getButton());
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //Invoked when the mouse button has been pressed on a component
        System.out.println("You pressed on the label");
        Color color = label.getBackground();
        label.setBackground(new Color((color.getRed()*2)%256,(color.getGreen()*2)%256,(color.getBlue()*2)%256));
        //this.revalidate();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //Invoked when the mouse button has been released on a component
        System.out.println("You released on the label");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //Invoked when the mouse button enters a component
        System.out.println("You entered the label");

    }

    @Override
    public void mouseExited(MouseEvent e) {
        //Invoked when the mouse button exits a component
        System.out.println("You exited the label");


    }
}
