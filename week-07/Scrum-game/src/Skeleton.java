/**
 * Created by zoloe on 2016. 12. 08..
 */
public class Skeleton extends MovableThing {
    static String image = "images/" + "skeleton.png";
//    static String imageUp = "images/" + "skeleton.png";
//    static String imageRight = "images/" + "skeleton.png";
//    static String imageLeft = "images/" + "skeleton.png";

    public Skeleton(int posX, int posY, int level, String name) {
        super( image, posX, posY, name);
        this.HP = 8 * level * d6();
        this.DP = level/2 * d6();
        this.SP = level * d6();
        this.posStatX = 180;
        this.posStatY = 780; //hova irjuk a statot
    }
    public String getName(){
        return this.name;
    }
}
//        Monster Lvl x (if boss)
//        HP: 2 * x * d6 (+d6)
//        DP: x/2 * d6 (+d6/2)
//        SP: x * d6 (+x)
//