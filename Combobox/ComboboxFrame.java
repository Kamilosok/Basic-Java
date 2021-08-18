package Combobox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboboxFrame extends JFrame implements ActionListener {

    JComboBox comboBox;

    ComboboxFrame()
    {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setResizable(false);

        String[] animals = new String[]{"--", "Dog", "Cat", "Bird"};
        comboBox = new JComboBox(animals);
        comboBox.addActionListener(this);

        //comboBox.setEditable(true);
        //comboBox.getItemCount();
        comboBox.addItem("Horse");
        comboBox.insertItemAt("Pig", 1);
        comboBox.setSelectedIndex(0);
        //Here it's redundant
        //comboBox.removeItem("Cat");
        //comboBox.removeItemAt(1);
        //comboBox.removeAllItems();

        this.add(comboBox);

        this.pack();
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == comboBox && comboBox.getSelectedIndex() != 0)
        {
            System.out.println(comboBox.getSelectedItem());
        }
    }
}
