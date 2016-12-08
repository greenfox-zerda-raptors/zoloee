import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by zoloe on 2016. 12. 07..
 */
public class MoveableThing extends GameObject {
    BufferedImage imageUp;
    BufferedImage imageDown;
    BufferedImage imageRight;
    BufferedImage imageLeft;

    public MoveableThing(String filename, int posX, int posY) {
        super(filename, posX, posY);
        try {
            imageUp = ImageIO.read(new File("images/hero-up.png"));
            imageDown = ImageIO.read(new File("images/hero-down.png"));
            imageRight = ImageIO.read(new File("images/hero-right.png"));
            imageLeft = ImageIO.read(new File("images/hero-left.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void moveUp(){
        image = imageUp;
        setPosY(posY-1);
    }
    public void moveDown(){
        image = imageDown;
        setPosY(posY+1);
    }
    public void moveRight(){
        image = imageRight;
        setPosX(posX+1);
    }
    public void moveLeft(){
        image = imageLeft;
        setPosX(posX-1);
    }

    public void draw(Graphics graphics){
        if (image != null) {
            graphics.drawImage(image, posX * 72, posY * 72, null);
        }
        graphics.drawString("hero XY : " + posX + " " + posY , 10, 740);
    }// draw
}// MoveableThing
