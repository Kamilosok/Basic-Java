package Slider;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class SliderFrame implements ChangeListener {

    JFrame frame;
    JPanel panel;
    JLabel label;
    JSlider slider;

    SliderFrame()
    {
        frame= new JFrame();
        panel = new JPanel();
        label = new JLabel();
        slider = new JSlider();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Sliders");
        frame.setSize(600, 600);
        frame.setResizable(false);

        slider.setMinimum(0);
        slider.setMaximum(100);
        slider.setValue(20);

        slider.setPreferredSize(new Dimension(200, 500));
        slider.addChangeListener(this);

        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);

        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(50);

        slider.setPaintLabels(true);
        slider.setFont(new Font("Times New Roman", Font.PLAIN, 15));

        slider.setOrientation(SwingConstants.VERTICAL);
        //Or just Integer.valueOf(1)

        label.setText(slider.getValue()+" °C");
        label.setFont(new Font("Arial", Font.BOLD, 40));

        panel.add(slider);
        panel.add(label);
        frame.add(panel);

        frame.setVisible(true);
    }

    @Override
    public void stateChanged(ChangeEvent e)
    {
        if(e.getSource() == slider)
            label.setText(slider.getValue()+" °C");
    }
}
