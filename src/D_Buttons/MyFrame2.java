package D_Buttons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame2 extends JFrame{

    JButton button;
    JLabel label;

    MyFrame2(){

        ImageIcon icon = new ImageIcon("C:/Users/abraa/Downloads/toriel.gif");
        ImageIcon spinningRalsei = new ImageIcon("C:/Users/abraa/Downloads/spinningRalsei.gif");

        label = new JLabel();
        label.setIcon(spinningRalsei);
        label.setBounds(150,250,150,150);


        button = new JButton();
        button.setBounds(125,125,250,125);
        button.setText("I'm a bottom");
        button.setFocusable(false);
        button.setIcon(icon);
        //button.setIconTextGap(-25);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans",Font.BOLD,25));
        button.setBackground(Color.white);
        button.setForeground(Color.pink);
        button.setBorder(BorderFactory.createLineBorder(Color.black));
        //button.setEnabled(false);

        button.addActionListener(e -> {
            System.out.println("YIPEEE");
            button.setEnabled(false);
        });

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

}
