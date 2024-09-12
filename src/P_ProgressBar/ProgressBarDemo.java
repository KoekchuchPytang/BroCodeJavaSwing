package P_ProgressBar;

import javax.swing.*;
import java.awt.*;

public class ProgressBarDemo {

    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar(0,100);

    ProgressBarDemo(){
        bar.setValue(0);
        bar.setBounds(50,0,400,50);
        bar.setStringPainted(true);
        bar.setFont(new Font("MV Boli", Font.PLAIN,25));
        bar.setForeground(Color.pink);
        bar.setBackground(Color.black);

        frame.add(bar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
        fill();
    }
    public void fill(){
        int counter = 0;
        while (counter<=100){
            bar.setValue(counter);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            counter += 1;
        }
        System.out.println(bar.getValue());
        bar.setString("Completo.");
    }
}
