package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingButtonMy {

    public static void main(String args[]) {

        Runnable runner = new Runnable() {
            public void run() {
                JFrame frame = new JFrame("Welcome to the program!");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                JLabel l = new JLabel("new text ");
                JButton button = new JButton("Ok");

                // Define ActionListener
                ActionListener actionListener = new ActionListener() {

                    public void actionPerformed(ActionEvent actionEvent) {
                        System.out.println("You have selected the button.");
                    }
                };
                // Attach listeners
                button.addActionListener(actionListener);
                frame.add(button, BorderLayout.SOUTH);

                frame.add(l);

                frame.setSize(500, 200);
                frame.setVisible(true);
            }
        };
        EventQueue.invokeLater(runner);
    }
}