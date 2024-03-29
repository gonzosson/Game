package net.viklander;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    public Window(int width, int height) {
        setTitle("Game");
        setSize(width, height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);
    }
}
