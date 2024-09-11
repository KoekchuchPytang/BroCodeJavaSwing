package L_CheckBoxes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JCheckBox checkBox;
    ImageIcon xIcon;
    ImageIcon checkIcon;
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        xIcon = new ImageIcon("C:/Users/abraa/Downloads/Imagens-Programacao/x_icon.png");
        checkIcon = new ImageIcon("C:/Users/abraa/Downloads/Imagens-Programacao/check_menor.png");
        button = new JButton();
        button.setText("Weeeeeee");
        button.addActionListener(this);

        checkBox = new JCheckBox();
        checkBox.setFocusable(false);
        checkBox.setText("I'm a robot");
        checkBox.setFont(new Font("Comic Sans", Font.PLAIN,25));
        checkBox.setIcon(xIcon);
        checkBox.setSelectedIcon(checkIcon);
        this.add(button);
        this.add(checkBox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button){
            System.out.println(checkBox.isSelected());
        }

    }
}
