package org.example;

import javax.swing.*;
import java.awt.*;

/**
 * @author Biggest_Rain
 */
public class MyFrame extends JFrame {

    public void createFrame(String title) {

        JFrame frame = new JFrame(title);
        Container container = frame.getContentPane();


        JLabel jl = new JLabel("这是一个JFrame窗体");
        jl.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(jl);


        frame.setVisible(true);
        frame.setBounds(400, 300, 400, 300);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
