package EricHannafin_PokerMiniProject;

import javax.swing.*;
import java.awt.Color;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainGUI  {

    public MainGUI() {

        JTextField startAmount;

        JFrame frame = new JFrame("Texas Hold'em");
        FlowLayout flowLayout = new FlowLayout();
        frame.setLayout(flowLayout);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700,400);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(Color.green);

        ImageIcon image = new ImageIcon("pokerChips.png");
        frame.setIconImage(image.getImage());

        JLabel promptLabel = new JLabel("Welcome to Texas Hold'em poker! Please enter the amount of money you would" +
                " like to lose and press play when ready!");
        promptLabel.setLocation(5, 90);
        frame.add(promptLabel);

        startAmount = new JTextField(5);

        frame.add(startAmount);

        JButton playButton = new JButton("Play");
        frame.add(playButton);


        frame.setVisible(true);

    }

    // create a Frame
    public static void main(String[] args) {

        new MainGUI();
    }
}