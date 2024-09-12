package V_DragAndDrop;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    DragPanel dragPanel = new DragPanel();
    MyFrame(){

        this.add(dragPanel);
        this.setTitle("Drag and Drop Demo");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setLayout(null);
        this.setSize(600,600);
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
