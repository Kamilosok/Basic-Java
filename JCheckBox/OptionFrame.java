package JCheckBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OptionFrame extends JFrame implements ActionListener {

    JButton button;
    JCheckBox checkBox;

    ImageIcon xIcon, checkIcon;

    OptionFrame()
    {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setResizable(false);

        xIcon = new ImageIcon("JCheckBox\\X.png");

        checkIcon = new ImageIcon("JCheckBox\\Check.png");

        button = new JButton();
        button.setText("Submit");
        button.addActionListener(this);
        button.setFocusable(false);
        this.add(button);

        checkBox = new JCheckBox();
        checkBox.setText("I'm not a robot");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Times New Roman", Font.BOLD, 20));
        checkBox.setIcon(xIcon);
        checkBox.setSelectedIcon(checkIcon);
        //These icons may be too large

        this.add(checkBox);

        this.pack();
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==button)
        {
            System.out.println(checkBox.isSelected());
        }
    }
}
