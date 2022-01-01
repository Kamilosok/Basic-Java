package Calculator;

import javax.swing.*;
import java.awt.*;

public class CalcFrame extends JFrame{

    CalcButton[] buttons = new CalcButton[16];
    JPanel panel = new JPanel();
    TextField textField = new TextField();

    int currNumber = 0;
    int operNumber = 0;
    char currOperation = ' ';
    boolean isContinuousInput = false, isOperating = false;
    String equation;

    CalcFrame()
    {
        panel.setBackground(Color.blue);
        panel.setPreferredSize(new Dimension(600,200));
        panel.setLayout(new FlowLayout());
        textField.setPreferredSize(new Dimension(400,150));
        textField.setBackground(Color.blue);
        textField.setForeground(Color.WHITE);
        textField.setFocusable(false);
        textField.setFont(new Font("Times New Roman", Font.PLAIN, 40));
        panel.add(textField);
        this.add(panel);


        for(int i=0; i<=9; i++)
        {
            buttons[i] = new CalcButton(Integer.toString(i));
        }

        {
            buttons[10]= new CalcButton("+");
            buttons[11]= new CalcButton("-");
            buttons[12]= new CalcButton("*");
            buttons[13]= new CalcButton("/");
            buttons[14]= new CalcButton("=");
            buttons[15]= new CalcButton("C");

            for(int i=0; i<=15; i++)
            {
                buttons[i].setFramer(this);
                this.add(buttons[i]);
            }

        }

            this.setLayout(new FlowLayout());
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setSize(new Dimension(600,800));
            this.setVisible(true);
    }

    public void getButton(char ch)
    {
        if(ch >= '0'&& ch<='9')
        {
            if(currOperation == ' ')
            {
                if (!isContinuousInput)
                {
                    currNumber = ch - '0';
                    isContinuousInput = true;
                }
                else
                {
                    currNumber *= 10;
                    currNumber += ch - '0';
                }
            }
            else
            {
                if (!isContinuousInput)
                {
                    operNumber = ch - '0';
                    isContinuousInput = true;
                }
                else
                {
                    operNumber *= 10;
                    operNumber += ch - '0';
                }
            }
        }
        else
        {
            if(ch == '=' && currOperation!=' ')
            {
                try {
                    switch (currOperation) {
                        case '+':
                            currNumber += operNumber;
                            break;
                        case '-':
                            currNumber -= operNumber;
                            break;
                        case '*':
                            currNumber *= operNumber;
                            break;
                        case '/':
                            currNumber /= operNumber;
                            break;
                    }
                }
                catch (ArithmeticException e)
                {
                    e.printStackTrace();
                }
                System.out.println("=" + currNumber);
            }
            else
                if(ch=='C')
                {
                    currNumber=0;
                    isContinuousInput = false;
                    operNumber = 0;
                    currOperation = ' ';
                }
            else
            {
                currOperation = ch;
                isOperating = true;
                isContinuousInput = false;
                operNumber = 0;
            }
        }

        if(currOperation == ' ')
        {
            equation = Integer.toString(currNumber);
        }
        else
            equation = (Integer.toString(currNumber) + " " + currOperation + " " + Integer.toString(operNumber));

        updateTextField();
    }

    void updateTextField()
    {
        textField.setText(equation);
    }
}
