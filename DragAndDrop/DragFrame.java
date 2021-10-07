package DragAndDrop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DragFrame extends JFrame {

    DragPanel dragPanel;

    DragFrame()
    {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setTitle("DragFrame");
        this.setSize(600,600);
        ImageIcon icon = new ImageIcon("Test.png");
        this.setIconImage(icon.getImage());

        dragPanel = new DragPanel();

        this.add(dragPanel);

        this.setVisible(true);
    }

}
