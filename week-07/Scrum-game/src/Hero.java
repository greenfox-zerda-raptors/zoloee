import java.awt.*;

/**
 * Created by zoloe on 2016. 12. 07..
 */
public class Hero extends Character {
    public Hero(int posX, int posY) {
        super("images/hero-down.png", posX, posY);
    }

    public Hero(String filename, int posX, int posY) {
        super(filename, posX, posY);
    }
}

