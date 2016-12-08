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
    int posStatX;
    int posStatY;
    protected int HP;
    protected int DP;
    protected int SP;

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getDP() {
        return DP;
    }

    public void setDP(int DP) {
        this.DP = DP;
    }

    public int getSP() {
        return SP;
    }

    public void setSP(int SP) {
        this.SP = SP;
    }

    public MoveableThing(String imageDown, String imageUp, String imageRight, String imageLeft, int posX, int posY) {
        super(imageDown, posX, posY);

        try {
            this.imageUp = ImageIO.read(new File(imageUp));
            this.imageDown = ImageIO.read(new File(imageDown));
            this.imageRight = ImageIO.read(new File(imageRight));
            this.imageLeft = ImageIO.read(new File(imageLeft));
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
        } //kirajzolja a nyunyi kepet a tablara
    }// draw

    public void drawStats(Graphics graphics){  //azert kell kulon, mert kulon helyre kell a szornyet + az emberet
        graphics.drawString(
                "HP: " + Integer.toString(HP) + " \n" +
                        "DP: " + Integer.toString(DP) + " \n" +
                        "SP: " + Integer.toString(SP), posStatX, posStatY);
    }// drawStats

    public int d6(){
        return (int) (Math.random()*(5))+1;
    } //dobokocka az erokhoz

}// MoveableThing
