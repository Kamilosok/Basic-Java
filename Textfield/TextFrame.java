package Textfield;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFrame extends JFrame implements ActionListener {

    JButton button;
    JTextField textField;
    TextFrame()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setTitle("Enter your name");

        button = new JButton("Submit");
        button.addActionListener(this);
        this.add(button);

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250, 40));
        textField.setFont(new Font("Times New Roman", Font.ITALIC, 20));
        textField.setForeground(Color.BLUE);
        textField.setBackground(Color.CYAN);
        textField.setCaretColor(Color.GREEN);
        textField.setText("Username");
        //Grayed out ghost text is more complicated so this for now

        this.add(textField);

        this.pack();
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == button)
        {
            String text =
            textField.getText();

            System.out.println("Hello " + text);

            textField.setEditable(false);
            button.setEnabled(false);
        }

    }
}
