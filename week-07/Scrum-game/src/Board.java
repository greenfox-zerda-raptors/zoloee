import javax.swing.*;
import java.awt.*;


/**
 * Created by zoloe on 2016. 12. 05..
 */
public class Board extends JPanel{
    public Board() {
        // set the size of your draw board
        setPreferredSize(new Dimension(720, 900));
        setVisible(true);
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        // here you have a 720x720 canvas
        // you can create and draw an image using the class below e.g.
        Tile image = new Tile("images/floor.png", 300, 300);
        image.draw(graphics);
    }


}
