package EricHannafin_PokerMiniProject;

import javax.swing.*;
import java.awt.Color;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainGUI  {

    JTextField startAmount;

    public MainGUI() {

        JFrame frame = new JFrame("Texas Hold'em");
        FlowLayout flowLayout = new FlowLayout();
        frame.setLayout(flowLayout);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,400);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(Color.green);

        ImageIcon image = new ImageIcon("pokerChips.png");
        frame.setIconImage(image.getImage());

        JLabel promptLabel = new JLabel("<html>Welcome to Texas Hold'em poker! Please enter the amount of money you would" +
                " \nlike to lose and hit enter when you are ready to play!</html>",4);
        promptLabel.setLocation(5, 90);
        frame.add(promptLabel);

        startAmount = new JTextField(5);

        frame.add(startAmount);
        TextFieldEventHandler handler = new TextFieldEventHandler();
        startAmount.addActionListener(handler);

        frame.setVisible(true);

    }

    // create a Frame
    public static void main(String[] args) {

        new MainGUI();
    }
        private class TextFieldEventHandler implements ActionListener{

            public void actionPerformed(ActionEvent e)
            {
                String StartAmountAsString;

                StartAmountAsString = startAmount.getText();

                if(StartAmountAsString.equals(""))
                {
                    JOptionPane.showMessageDialog(null,"You must enter a valid amount to start the game",
                            "Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }
