package Calculator;

import javax.swing.*;
import java.awt.*;

public class CalcFrame extends JFrame{

    CalcButton[] buttons = new CalcButton[16];
    JPanel panel = new JPanel();
    TextField textField = new TextField();

    String currNumber = "";
    String operNumber = "";
    char currOperation = ' ';
    float theNumber = 0;
    boolean isContinuousInput = false, isOperating = false;
    String equation;

    CalcFrame()
    {
        this.setTitle("Calculator");
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(new Dimension(600,700));
        this.setResizable(false);
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
                    currNumber += (ch - '0');
                    isContinuousInput = true;
                }
                else
                {
                    currNumber += (ch - '0');
                }
            }
            else
            {
                if (!isContinuousInput)
                {
                    operNumber += (ch - '0');
                    isContinuousInput = true;
                }
                else
                {
                    operNumber += (ch - '0');
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
                            theNumber = Float.valueOf(currNumber)+Float.valueOf(operNumber);
                            currNumber = Float.toString(theNumber);
                            break;
                        case '-':
                            theNumber = Float.valueOf(currNumber)-Float.valueOf(operNumber);
                            currNumber = Float.toString(theNumber);
                            break;
                        case '*':
                            theNumber = Float.valueOf(currNumber)*Float.valueOf(operNumber);
                            currNumber = Float.toString((float)(Math.round(theNumber*100.0)/100.0));
                            break;
                        case '/':
                            if(Float.valueOf(operNumber)==0)
                            {
                                throw new ArithmeticException();
                            }
                            theNumber = Float.valueOf(currNumber)/Float.valueOf(operNumber);
                            currNumber = Float.toString((float)(Math.round(theNumber*100.0)/100.0));
                    }
                }
                catch (ArithmeticException e)
                {
                    equation = "ERROR";
                    e.printStackTrace();
                }
                catch (NumberFormatException e)
                {
                    e.printStackTrace();
                }
            }
            else
                if(ch=='C')
                {
                    currNumber="";
                    isContinuousInput = false;
                    operNumber = "";
                    currOperation = ' ';
                }
            else
            {
                currOperation = ch;
                isOperating = true;
                isContinuousInput = false;
                operNumber = "";
            }
        }

        if(equation != "ERROR")
        {
            if (currOperation == ' ' || currOperation== '=')
            {
                equation = currNumber;
                currOperation = ' ';
            }
            else
                equation = (currNumber + " " + currOperation + " " + operNumber);
        }
        else
        {
            currNumber="";
            isContinuousInput = false;
            operNumber = "";
            currOperation = ' ';
        }

        System.out.println("CurrNumber: "+currNumber);
        System.out.println("CurrOper: "+currOperation);
        System.out.println("OperNumber: "+operNumber);
        updateTextField();

    }

    void updateTextField()
    {
        textField.setText(equation);
    }
}
