package N_ComboBoxes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JComboBox comboBox;
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        String[] animals = {"dog","cat","bird","fish"};
        //int[] numeros = {1,2,3,4}; Não vai funcionar
        //Integer[] numeros = {1,2,3,4};
        //Assim que deve ser feito, assim como os outros tipos

        comboBox = new JComboBox<>(animals);
        comboBox.addActionListener(this);

        //comboBox.setEditable(true);
        //System.out.println(comboBox.getItemCount());
        //comboBox.addItem("cANALHAS");
        //comboBox.insertItemAt("vagabundos",5);
        //comboBox.setSelectedIndex(0);
        //comboBox.removeItem("dog");
        //comboBox.removeItemAt(0);
        //comboBox.removeAllItems();

        this.add(comboBox);
        this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==comboBox){
            //System.out.println(comboBox.getSelectedItem());
            System.out.println(comboBox.getSelectedIndex());
        }
    }
}
