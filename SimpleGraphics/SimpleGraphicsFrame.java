package SimpleGraphics;

import javax.swing.*;

public class SimpleGraphicsFrame extends JFrame {

    GraphicsPanel panel = new GraphicsPanel();

    SimpleGraphicsFrame()
    {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setTitle("Graphics?");
        this.setSize(500,500);
        this.setLocationRelativeTo(null);

        this.add(panel);

        this.pack();

        this.setVisible(true);
    }
}
