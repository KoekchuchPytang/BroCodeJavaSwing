package A_Frames;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyFrame(){
        this.setTitle("JFrame title goes here"); //sets title of this
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
        this.setResizable(false); //prevents this from being resized
        this.setSize(420,420); //sets the x-dimension, and y-dimension of this
        this.setVisible(true); //make this visible
        ImageIcon image = new ImageIcon("C:/Users/abraa/Downloads/Imagens-Programacao/.saveIcon.png"); //create an ImageIcon this.setIconImage(image.getImage()); //change icon of this this.getContentPane().setBackground(new Color(123,50,250)); //change color of background

        this.setIconImage(image.getImage()); //change icon of this
        this.getContentPane().setBackground(new Color(123,50,250)); //change color of background

    }

    }
