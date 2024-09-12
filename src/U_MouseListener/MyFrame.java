package U_MouseListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame extends JFrame implements ActionListener, MouseListener {
    JLabel label;
    ImageIcon brisket;
    ImageIcon brisket2;
    ImageIcon brisket3;
    ImageIcon brisket4;

    MyFrame(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());


        brisket = new ImageIcon("C:/Users/abraa/Downloads/Imagens-Programacao/brisket.jpg");
        brisket2 = new ImageIcon("C:/Users/abraa/Downloads/Imagens-Programacao/brisket2.jpg");
        brisket3 = new ImageIcon("C:/Users/abraa/Downloads/Imagens-Programacao/brisket3.jpg");
        brisket4 = new ImageIcon("C:/Users/abraa/Downloads/Imagens-Programacao/brisket4.jpg");

        label = new JLabel();
        //label.setBounds(0,0,100,100);
        //label.setBackground(Color.red);
        //label.setOpaque(true);
        label.setIcon(brisket);
        label.addMouseListener(this);



        this.add(label);
        this.setVisible(true);
        this.setSize(500,500);
        //this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // Invoked when the mouse button has been clicked (pressed and released) on a component
        //System.out.println("Your clicked the mouse");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // Invoked when a mouse button has been pressed on a component
        //System.out.println("You pressed the mouse");
        //label.setBackground(Color.yellow);
        label.setIcon(brisket2);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // Invoked when a mouse button has been released on a component
        //System.out.println("You released the mouse");
        //label.setBackground(Color.green);
        label.setIcon(brisket3);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // Invoked when the mouse enters a component
        //System.out.println("You entered the component");
        //label.setBackground(Color.blue);
        label.setIcon(brisket4);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // Invoked when the mouse exits a component
        //System.out.println("You exited the component");
        //label.setBackground(Color.red);
        label.setIcon(brisket);
    }
}
