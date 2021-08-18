package JFrame;

import javax.swing.*;
import java.awt.*;

public class GridLayouter {
    public static void main(String[] args)
    {
        JFramer frame = new JFramer(800, 600, "GridLayout", "", true);

        //Arguments change the number of rows and columns, horizontal spacing and vertical spacing
        frame.setLayout(new GridLayout(3,3, 10, 10));
        //GridLayout places components in a grid of cells, each component takes all available space within its cell,
        //and each cell is the same size

        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));

        frame.revalidate();
    }
}
