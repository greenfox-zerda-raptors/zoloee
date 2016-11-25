package MemoryGame;

import javax.swing.*;
import java.awt.*;

/**
 * Created by zoloe on 2016. 11. 25..
 */
public class MemoryPanel extends JPanel {
    private Image myImage1;
    private Image myImage2;
    public MemoryPanel(){
        super(new GridLayout(2,2));
//        myImage1 = Toolkit.getDefaultToolkit().createImage("image1.png");
//        myImage2 = Toolkit.getDefaultToolkit().createImage("image1.png");

    }// MemoryPanel

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(myImage1, 5,5, this);
        g.drawImage(myImage2, 5,5, this);
    }// paintComponent

}
