package SimpleAnimation;

import javax.swing.*;

public class SimpleAnimationFrame extends JFrame{

    SimpleAnimationPanel panel = new SimpleAnimationPanel();

    SimpleAnimationFrame()
    {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setTitle("Animation?");
        this.setLocationRelativeTo(null);

        this.add(panel);
        this.pack();

        this.setVisible(true);
    }
}
