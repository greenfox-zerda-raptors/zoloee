import java.awt.*;

/**
 * Created by zoloe on 2016. 12. 07..
 */
public class Tile extends GameObject {
    public boolean moveable;

    public Tile(String filename, int posX, int posY, boolean moveable) {
        super(filename, posX, posY);
        this.moveable = moveable;
    }


    public void draw(Graphics graphics){
        if (image != null) {
            graphics.drawImage(image, posX * 72, posY * 72, null);
        }
    }// draw
}
