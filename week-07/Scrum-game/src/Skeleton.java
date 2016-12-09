/**
 * Created by zoloe on 2016. 12. 08..
 */
public class Skeleton extends MoveableThing{
    static String imageDown = "images/" + "skeleton.png";
    static String imageUp = "images/" + "skeleton.png";
    static String imageRight = "images/" + "skeleton.png";
    static String imageLeft = "images/" + "skeleton.png";

    public Skeleton(int posX, int posY, int level, String name) {
        super(imageDown,imageUp,imageRight,imageLeft,imageDown,posX, posY, name);
        this.HP = 8 * level * d6();
        this.DP = level/2 * d6();
        this.SP = level * d6();
        this.posStatX = 300;
        this.posStatY = 760; //hova irjuk a statot
    }
}
//        Monster Lvl x (if boss)
//        HP: 2 * x * d6 (+d6)
//        DP: x/2 * d6 (+d6/2)
//        SP: x * d6 (+x)
//