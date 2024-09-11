package K_TextField;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JTextField textField;
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        //this.setSize(500,500);

        button = new JButton("Submit");
        button.setFocusable(false);
        button.addActionListener(this);

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250,40));
        textField.setFont(new Font("Consolas", Font.PLAIN,35));
        textField.setBackground(Color.black);
        textField.setText("username:");
        this.add(button);
        this.add(textField);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button){
            System.out.println("I love you " + textField.getText());
            button.setEnabled(false);
            textField.setEditable(false);

            //this.setSize(Integer.parseInt(textField.getText()),Integer.parseInt(textField.getText()));
        }
    }
}
