package C_Panels;

import B_Labels.Labels;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("C:/Users/abraa/Downloads/kris.png");

        JLabel label = new JLabel();
        label.setText("Hi");
        label.setIcon(image);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.TOP);
        label.setBounds(0,0,75,75);


        JFrame frame = new JFrame();
        JPanel redPanel1 = new JPanel();
        redPanel1.setBackground(Color.red);
        redPanel1.setBounds(0,0,250,250);

        JPanel bluePanel1 = new JPanel();
        bluePanel1.setBackground(Color.blue);
        bluePanel1.setBounds(250,0,250,250);
        bluePanel1.setLayout(new BorderLayout());

        JPanel greenPanel1 = new JPanel();
        greenPanel1.setBackground(Color.green);
        greenPanel1.setBounds(0,250,500,250);
        greenPanel1.setLayout(new BorderLayout());

        bluePanel1.add(label);



        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750,750);
        frame.setVisible(true);
        frame.add(redPanel1);
        frame.add(bluePanel1);
        frame.add(greenPanel1);
    }
}
