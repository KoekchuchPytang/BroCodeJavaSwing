package I_OpenANewWindow;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaunchPage implements ActionListener {
    JOptionPane jOptionPane = new JOptionPane();
    JFrame frame = new JFrame();
    JButton myButton = new JButton("New Window");
    LaunchPage(){

        myButton.setBounds(100,160,200,40);
        myButton.setFocusable(false);
        myButton.addActionListener(this);

        frame.add(myButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==myButton){
            JOptionPane.showMessageDialog(null,"Change the world, my final massage. Goodbye.");
            frame.dispose();
            NewWindow myWindow = new NewWindow();
        }
    }
}
