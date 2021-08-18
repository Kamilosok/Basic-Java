package MenuBar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MenuBarFrame extends JFrame implements ActionListener {

    JMenuBar menuBar;

    JMenu fileMenu;
    JMenu editMenu;
    JMenu helpMenu;

    JMenuItem loadItem;
    JMenuItem saveItem;
    JMenuItem exitItem;

    MenuBarFrame()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Menu Bars");
        this.setSize(600, 600);
        this.setLayout(new FlowLayout());

        menuBar = new JMenuBar();

        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        helpMenu = new JMenu("Help");

        ImageIcon loadIcon = new ImageIcon("MenuBar\\Load.png");
        ImageIcon saveIcon = new ImageIcon("MenuBar\\Save.png");
        ImageIcon exitIcon = new ImageIcon("MenuBar\\Exit.png");

        fileMenu.setMnemonic(KeyEvent.VK_F); //Alt + F
        editMenu.setMnemonic(KeyEvent.VK_E); //Alt + E
        helpMenu.setMnemonic(KeyEvent.VK_H); //Alt + H

        loadItem = new JMenuItem("Load");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");
        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);
        loadItem.setIcon(loadIcon);
        saveItem.setIcon(saveIcon);
        exitItem.setIcon(exitIcon);

        //Setting key shortcuts: L,S,E
        loadItem.setMnemonic(KeyEvent.VK_L);
        saveItem.setMnemonic(KeyEvent.VK_S);
        exitItem.setMnemonic(KeyEvent.VK_E);

        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);


        this.setJMenuBar(menuBar);

        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == loadItem)
            System.out.println("Loading File");
        else if (e.getSource() == saveItem)
            System.out.println("Saving File");
        else if(e.getSource() == exitItem)
            System.exit(0);
    }
}
