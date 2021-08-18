package JFrame;

import javax.swing.*;
import java.awt.*;

public class JLayerPaner {
    public static void main(String[] args)
    {
        JFramer frame = new JFramer(800, 600, "JLayeredPane", "", true);
        frame.setLayout(null);

        //JLayeredPane is a swing container that provides a third dimension for positioning components ex. depth
        //Default>Palette>Modal>PopUp>Drag

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0, 0, 500, 500);
        frame.add(layeredPane);

        JLabel label1 = new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.red);
        label1.setBounds(50, 50, 200, 200);

        JLabel label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.green);
        label2.setBounds(100, 100, 200, 200);

        JLabel label3 = new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.blue);
        label3.setBounds(150, 150, 200, 200);

        layeredPane.add(label1, Integer.valueOf(0));
        layeredPane.add(label2, JLayeredPane.DEFAULT_LAYER);
        layeredPane.add(label3, JLayeredPane.DRAG_LAYER);
        //The higher the number the "closer to the top" the component is


        frame.revalidate();
    }
}
