package RadioButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioFrame extends JFrame implements ActionListener{

    private JRadioButton pizzaButton;
    private JRadioButton hamburgerButton;
    private JRadioButton hotdogButton;

    RadioFrame()
    {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setResizable(false);

        pizzaButton = new JRadioButton("Pizza");
        hamburgerButton = new JRadioButton("Hamburger");
        hotdogButton = new JRadioButton("Hotdog");
        //Or use setText()
        pizzaButton.setFocusable(false);
        hamburgerButton.setFocusable(false);
        hotdogButton.setFocusable(false);
        pizzaButton.addActionListener(this);
        hamburgerButton.addActionListener(this);
        hotdogButton.addActionListener(this);

        ImageIcon pizzaIcon = new ImageIcon("RadioButton\\Pizza.png");
        ImageIcon hamburgerIcon = new ImageIcon("RadioButton\\Hamburger.png");
        ImageIcon hotdogIcon = new ImageIcon("RadioButton\\Hotdog.png");
        pizzaButton.setIcon(pizzaIcon);
        hamburgerButton.setIcon(hamburgerIcon);
        hotdogButton.setIcon(hotdogIcon);


        ButtonGroup group = new ButtonGroup();
        group.add(pizzaButton);
        group.add(hamburgerButton);
        group.add(hotdogButton);

        this.add(pizzaButton);
        this.add(hamburgerButton);
        this.add(hotdogButton);


        this.pack();
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == pizzaButton)
            System.out.println("Pizza");
        else if (e.getSource() == hamburgerButton)
            System.out.println("Hamburger");
        else if (e.getSource() == hotdogButton)
            System.out.println("Hotdog");

    }
}
