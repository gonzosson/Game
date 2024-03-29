package net.viklander;

import javax.swing.*;
import java.awt.*;

public class Game {
    Container container;
    JPanel titlePanel, startButtonPanel, testPanel;
    JLabel title;
    Font titleFont = new Font("Garamond", Font.PLAIN, 90);
    JButton startButton;

    public Game() {
        Window window = new Window(800, 600);
        container = window.getContentPane();

        titlePanel = new JPanel();
        titlePanel.setBounds(100, 100, 600, 150);
        titlePanel.setBackground(Color.YELLOW);

        title = new JLabel("ADVENTURE");
        title.setForeground(Color.WHITE);
        title.setFont(titleFont);


        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(300, 400, 200, 100);
        startButtonPanel.setBackground(Color.BLUE);

        testPanel = new JPanel();
        testPanel.setBounds(100, 250, 600, 150);
        testPanel.setBackground(Color.CYAN);

        startButton = new JButton("START");
        startButton.setBackground(Color.BLACK);
        startButton.setForeground(Color.WHITE);


        titlePanel.add(title);
        startButtonPanel.add(startButton);

        container.add(titlePanel);
        container.add(testPanel);
        container.add(startButtonPanel);
    }
}
