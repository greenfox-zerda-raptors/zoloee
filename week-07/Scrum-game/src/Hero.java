import java.awt.*;

/**
 * Created by zoloe on 2016. 12. 07..
 */
public class Hero extends GameObject {
    public Hero(int posX, int posY) {
        super("images/hero-down.png", posX, posY);
    }

    public void draw(Graphics graphics){
        if (image != null) {
            graphics.drawImage(image, posX * 72, posY * 72, null);
        }
    }// draw

}

