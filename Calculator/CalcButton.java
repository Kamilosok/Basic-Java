package Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcButton extends JButton implements ActionListener {

    public char buttonChar;
    private CalcFrame framer;

    CalcButton (String ch)
    {
        this.addActionListener(this);

        this.setText(ch);
        this.setFocusable(false);
        this.setPreferredSize(new Dimension(100,100));
        buttonChar = ch.charAt(0);
    }

    public void setFramer(CalcFrame newFrame)
    {
        framer = newFrame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        framer.getButton(buttonChar);
    }
}
