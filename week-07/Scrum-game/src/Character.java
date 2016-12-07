import java.awt.*;

/**
 * Created by zoloe on 2016. 12. 07..
 */
public class Character extends GameObject {

    public Character(String filename, int posX, int posY) {
        super(filename, posX, posY);
    }


    public void draw(Graphics graphics){
        if (image != null) {
            graphics.drawImage(image, posX * 72, posY * 72, null);
        }
    }// draw
}// Character
