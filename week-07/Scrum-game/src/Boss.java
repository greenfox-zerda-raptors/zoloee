/**
 * Created by zoloe on 2016. 12. 09..
 */
public class Boss extends MovableThing {
    static String image = "images/" + "boss.png";

    public Boss(int posX, int posY, int level) {
        super( image, posX, posY, "Boss");
        this.HP = 2 * level * d6() + d6();
        this.DP = level/2 * d6() + d6()/2;
        this.SP = level * d6() + level;
        this.posStatX = 500;
        this.posStatY = 760; //hova irjuk a statot
    }
}
//        Monster Lvl x (if boss)
//        HP: 2 * x * d6 (+d6)
//        DP: x/2 * d6 (+d6/2)
//        SP: x * d6 (+x)