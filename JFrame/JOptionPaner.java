package JFrame;

import javax.swing.*;

public class JOptionPaner {
    public static void main(String[] args)
    {
        //JOptionPane is a pops up a standard dialog box that prompts users for a value or informs them of something
        //JOptionPane.showMessageDialog(null, "This is a message", "Title", JOptionPane.PLAIN_MESSAGE);

        //JOptionPane.showMessageDialog(null, "This is an information message", "Title", JOptionPane.INFORMATION_MESSAGE);

        //JOptionPane.showMessageDialog(null, "This is a question message", "Title", JOptionPane.QUESTION_MESSAGE);

        //JOptionPane.showMessageDialog(null, "This is a warning message", "Title", JOptionPane.WARNING_MESSAGE);

        //JOptionPane.showMessageDialog(null, "This is an error message", "Title", JOptionPane.ERROR_MESSAGE);

        int boo =
        JOptionPane.showConfirmDialog(null, "Yes or No?", "?", JOptionPane.YES_NO_OPTION);

        if(boo == 0)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }

        String name =
        JOptionPane.showInputDialog("What is your name?");

        System.out.println("Hello " + name);

        //Should be resized if it were to be used properly
        ImageIcon icon = new ImageIcon("JFrame\\Questiony.png");

        String[] responses = new String[] {"Maybe", "Or not"};

        JOptionPane.showOptionDialog(null, "What if?", "Title", JOptionPane.YES_NO_OPTION,
                JOptionPane.INFORMATION_MESSAGE, icon, responses, 0);

    }

}
