package T_KeyListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame extends JFrame implements KeyListener, ActionListener {
    JLabel label;
    ImageIcon icon;
    MyFrame(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.addKeyListener(this);

        icon = new ImageIcon("C:/Users/abraa/Downloads/Imagens-Programacao/toriel.gif");

        label = new JLabel();
        label.setBounds(0,0,100,100);
        //label.setBackground(Color.red);
        //label.setOpaque(true);
        label.setIcon(icon);

        this.getContentPane().setBackground(Color.black);
        this.add(label);
        this.setSize(500,500);
        this.setVisible(true);
    }
    @Override
    public void keyTyped(KeyEvent e) {



    }

    @Override
    public void keyPressed(KeyEvent e) {
        /*switch (e.getKeyChar()){
            case 'd': label.setLocation(label.getX()+5, label.getY());
               break;
            case 'a': label.setLocation(label.getX()-5, label.getY());
                break;
            case 'w': label.setLocation(label.getX(), label.getY()-5);
                break;
            case 's': label.setLocation(label.getX(),label.getY()+5);
        }*/
        switch (e.getKeyCode()){
            case 39: label.setLocation(label.getX()+5, label.getY());
                break;
            case 37: label.setLocation(label.getX()-5, label.getY());
                break;
            case 38: label.setLocation(label.getX(), label.getY()-5);
                break;
            case 40: label.setLocation(label.getX(),label.getY()+5);
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("You pressed Key: "+e.getKeyChar());
        System.out.println("code :"+e.getKeyCode());
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
