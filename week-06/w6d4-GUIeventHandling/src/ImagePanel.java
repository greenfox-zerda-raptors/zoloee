import javax.swing.*;
import java.awt.*;

/**
 * Created by zoloe on 2016. 11. 24..
 */
public class ImagePanel extends JPanel {
    private Image myImage;
    public ImagePanel() {
        myImage = Toolkit.getDefaultToolkit().createImage("image_example.png");
    }
    @Override
    public void paintComponent(Graphics graphics){
        super.paintComponent(graphics);
//        requestFocus();
        graphics.drawImage(myImage, 0, 0, this);
    }


}
