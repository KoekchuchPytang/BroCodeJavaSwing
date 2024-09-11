package M_RadioButtons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JRadioButton pizzaButton;
    JRadioButton hamburgerButton;
    JRadioButton hotdogButton;
    ButtonGroup buttonGroup;
    ImageIcon pizzaIcon;
    ImageIcon hamburgerIcon;
    ImageIcon hotdogIcon;
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        pizzaButton = new JRadioButton("pizza");
        hamburgerButton = new JRadioButton("hamburger");
        hotdogButton = new JRadioButton("hotdog");

        pizzaIcon = new ImageIcon("C:/Users/abraa/Downloads/Imagens-Programacao/icons8-pizza-48.png");
        hamburgerIcon = new ImageIcon("C:/Users/abraa/Downloads/Imagens-Programacao/icons8-hambúrguer-emoji-48.png");
        hotdogIcon = new ImageIcon("C:/Users/abraa/Downloads/Imagens-Programacao/icons8-emoji-de-cachorro-quente-48.png");

        pizzaButton.setIcon(pizzaIcon);
        hamburgerButton.setIcon(hamburgerIcon);
        hotdogButton.setIcon(hotdogIcon);

        buttonGroup = new ButtonGroup();
        buttonGroup.add(pizzaButton);
        buttonGroup.add(hamburgerButton);
        buttonGroup.add(hotdogButton);

        pizzaButton.addActionListener(this);
        hamburgerButton.addActionListener(this);
        hotdogButton.addActionListener(this);

        this.add(pizzaButton);
        this.add(hamburgerButton);
        this.add(hotdogButton);

        this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==pizzaButton){
            System.out.println("Tu pediu una pizza");
        }
        if (e.getSource()==hamburgerButton){
            System.out.println("TU pediu podrão");
        }
        if (e.getSource()==hotdogButton){
            System.out.println("Pedistes catiorro caliente");
        }
    }
}
