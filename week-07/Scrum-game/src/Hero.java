
/**
 * Created by zoloe on 2016. 12. 07..
 */
public class Hero extends MovableThing {
    static String imageDownFilename = "images/" + "hero-down.png";
    static String imageUpFilename = "images/" + "hero-up.png";
    static String imageRightFilename = "images/" + "hero-right.png";
    static String imageLeftFilename = "images/" + "hero-left.png";
    static String imageBattleFilename = "images/" + "battle.png";
    int maxHP;
    int level;

    public Hero(int posX, int posY) {
        super( imageUpFilename,
               imageDownFilename,
               imageRightFilename,
               imageLeftFilename,
               imageBattleFilename,
               posX, posY, "Hero");
        this.HP = 20 + 3 * d6();
        this.DP = 2 * d6();
        this.SP = 5 + d6();
        this.posStatX = 180;
        this.posStatY = 765; //hova irjuk a statot
        this.maxHP = 10;
        this.level = 1;
    }

    public void levelUp(){
        this.level ++;
        this.maxHP += d6();
        this.DP += d6();
        this.SP += d6();
    }
    public String getName(){
        return this.name + " (level " + level + ")";
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

