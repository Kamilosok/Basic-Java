package KeyListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyListenerFrame extends JFrame implements KeyListener {

    JLabel label;

    KeyListenerFrame()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Key Listener");
        this.setSize(600, 600);
        this.addKeyListener(this);
        this.setLayout(null);

        label = new JLabel();
        label.setBounds(0,0, 100, 100);
        label.setBackground(Color.black);
        label.setOpaque(true);
        this.add(label);

        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //Invoked when a key is typed, char output
        //System.out.println("Key typed: " + e.getKeyChar());
        /*switch (e.getKeyChar()) {
            case 'w':
                label.setLocation(label.getX(), label.getY()-10);
                break;
            case 'a':
                label.setLocation(label.getX()-10, label.getY());
                break;
            case 's':
                label.setLocation(label.getX(), label.getY()+10);
                break;
            case 'd':
                label.setLocation(label.getX()+10, label.getY());
                break;
          }
    */
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //Invoked when a physical key is pressed down, int output
        //System.out.println("Key pressed: " + e.getKeyChar());
        switch (e.getKeyChar()) {
            case 'w':
                label.setLocation(label.getX(), label.getY() - 10);
                break;
            case 'a':
                label.setLocation(label.getX() - 10, label.getY());
                break;
            case 's':
                label.setLocation(label.getX(), label.getY() + 10);
                break;
            case 'd':
                label.setLocation(label.getX() + 10, label.getY());
                break;
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        //Invoked when a key is released, char output

        System.out.println("Key released: " + e.getKeyChar());
        //System.out.println("Key released: " + e.getKeyCode());

    }
}
