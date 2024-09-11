package J_JOptionPane;

import javax.swing.*;

public class MyFrame extends JFrame{

    MyFrame(){
        /*
        JOptionPane.showMessageDialog(null,"Homossexual gay","TITLE" ,JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,"Homossexual gay","TITLE", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"Homossexual gay", "TITLE", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null,"Homossexual gay", "TITLE", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null,"Homossexual gay", "TITLE", JOptionPane.ERROR_MESSAGE);
        */
        int answer = JOptionPane.showConfirmDialog(null,"why","titulo", JOptionPane.YES_NO_CANCEL_OPTION);

        if (answer == 0){
            System.out.println("YES");
        } else if (answer == 1) {
            System.out.println("NO");
        }else {
            System.out.println("CANCEL");
        }
        String name = JOptionPane.showInputDialog("What is your name?: ");
        System.out.println(String.format("Herro %s!!!!!!",name));

        String[] responses = {"Nah, you are gay", "Thankoy very muich", "Te amo", "*blush*"};

        ImageIcon maozia = new ImageIcon("C:/Users/abraa/Downloads/ableu blelblenle/PeacePequeno.png");


        JOptionPane.showOptionDialog(null,"You are awesome", "canalhas", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, maozia,responses, 0);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);


    }

    
}
