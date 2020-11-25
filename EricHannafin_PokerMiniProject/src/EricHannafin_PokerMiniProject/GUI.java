package EricHannafin_PokerMiniProject;

import javax.swing.*;
import java.awt.Color;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI extends JFrame  {

    JTextField startAmount;

    public GUI() {

        JFrame frame = new JFrame("Texas Hold'em");
        FlowLayout flowLayout = new FlowLayout();
        frame.setLayout(flowLayout);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,400);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false); 
        frame.getContentPane().setBackground(Color.decode("#006763"));

        ImageIcon image = new ImageIcon("pokerChips.png");
        frame.setIconImage(image.getImage());

        JLabel mainTextLabel = new JLabel("<html><font size = 3><b><i>Welcome to Texas Hold'em poker! Please enter the amount of money you would" +
                " \nlike to lose and hit enter when you are ready to play!<i><b></font></html>",4);
        mainTextLabel.setLocation(5000, 5000);
        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.decode("#006763"));
        panel1.add(mainTextLabel);
        frame.add(panel1);

        startAmount = new JTextField(5);
        JPanel panel3 = new JPanel();
        panel3.add(startAmount);
        panel3.setBackground(Color.decode("#006763"));
        frame.add(panel3);
        TextFieldEventHandler handler = new TextFieldEventHandler();
        startAmount.addActionListener(handler);

        JLabel imageLabel = new JLabel();
        imageLabel.setPreferredSize(new Dimension(740, 270));
        imageLabel.setIcon(new ImageIcon("pokerImage.jpg"));
        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.decode("#006763"));
        panel2.add(imageLabel);
        frame.add(panel2);





        frame.setVisible(true);

    }
        // johns code
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
                else{
                    //Play the game?
                }
            }
        }
    }
