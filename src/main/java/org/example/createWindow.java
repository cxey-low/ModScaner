package org.example;

import javax.swing.*;
import java.awt.*;

public class createWindow implements Runnable {
    public static void panelHandler(JPanel panel) {



        panel.setLayout(null);

        JLabel userLabel = new JLabel("User:");
        userLabel.setBounds(10, 20, 60, 30);
        panel.add(userLabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(10, 20 + 35, 60, 30);
        panel.add(userText);
        System.out.println("panel");
    }

    public static void createWin() {
        JFrame.setDefaultLookAndFeelDecorated(true);

        JFrame frame = new JFrame("hello");

        Container container = frame.getContentPane();
        

        frame.setSize(1800, 1600);

        JPanel panel = new JPanel();
        frame.add(panel);
        panelHandler(panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("label");
        frame.getContentPane().add(label);

        frame.pack();
        frame.setVisible(true);


    }

    @Override
    public void run() {
        createWin();
    }


}
