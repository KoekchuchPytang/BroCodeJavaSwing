package V_DragAndDrop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class DragPanel extends JPanel {

    ImageIcon image = new ImageIcon("C:/Users/abraa/Downloads/Imagens-Programacao/ralsei.png");
    final int WIDTH = image.getIconWidth();
    final int HEIGHT = image.getIconHeight();
    Point imageCorner;
    Point previousPoint;
    DragPanel(){

        imageCorner = new Point(0,0);
        ClickListener clickListener = new ClickListener();
        DragListener dragListener = new DragListener();
        this.addMouseListener(clickListener);
        this.addMouseMotionListener(dragListener);

    }

    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        image.paintIcon(this,graphics, (int)imageCorner.getX(),(int) imageCorner.getY());
    }

    private class ClickListener extends MouseAdapter{

        public void mousePressed(MouseEvent e){
            previousPoint = e.getPoint();
        }

    }

    private class DragListener extends MouseMotionAdapter{

        public void mouseDragged(MouseEvent e){
            Point currentPt = e.getPoint();

            imageCorner.translate(

                    (int) (currentPt.getX() - previousPoint.getX()),
                    (int) (currentPt.getY() - previousPoint.getY())
            );

            previousPoint = currentPt;
            repaint();
        }
    }
}
