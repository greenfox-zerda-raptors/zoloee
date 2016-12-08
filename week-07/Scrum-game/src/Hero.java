/**
 * Created by zoloe on 2016. 12. 07..
 */
public class Hero extends MoveableThing {
    static String imageDown = "images/" + "hero-down.png";
    static String imageUp = "images/" + "hero-up.png";
    static String imageRight = "images/" + "hero-right.png";
    static String imageLeft = "images/" + "hero-left.png";

    public Hero(int posX, int posY) {
        super(imageDown,imageUp,imageRight,imageLeft,posX, posY);
        this.HP = 20 + 3 * d6();
        this.DP = 2 * d6();
        this.SP = 5 + d6();
        this.posStatX = 10;
        this.posStatY = 760; //hova irjuk a statot
    }
}
//
//Hero
//        HP: 20 + 3 * d6
//        DP: 2 * d6
//        SP: 5 + d6
//        Monster Lvl x (if boss)
//        HP: 2 * x * d6 (+d6)
//        DP: x/2 * d6 (+d6/2)
//        SP: x * d6 (+x)

