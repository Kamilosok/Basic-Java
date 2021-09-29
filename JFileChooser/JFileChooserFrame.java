package JFileChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class JFileChooserFrame extends JFrame implements ActionListener {
    //JFileChooser is a GUI mechanism that lets a user choose a file

    JButton button = new JButton("Select file");
    JFileChooserFrame()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Choose a File");
        this.setLayout(new FlowLayout());


        button.addActionListener(this);

        this.add(button);

        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==button)
        {
            JFileChooser fileChooser = new JFileChooser();

            fileChooser.setCurrentDirectory(new File("C:"));

            //int response = fileChooser.showOpenDialog(null); //Select a file to open
            int response = fileChooser.showSaveDialog(null); //Select a file to save

            if(response == JFileChooser.APPROVE_OPTION)
            {
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
            }
        }
    }


}
