import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by zoloe on 2016. 12. 07..
 */
public abstract class MovableThing extends GameObject {
    BufferedImage imageUp;
    BufferedImage imageDown;
    BufferedImage imageRight;
    BufferedImage imageLeft;
    BufferedImage imageBattle;
    int posStatX;
    int posStatY;
    String name;
    boolean keyHolder;
    protected int HP;
    protected int DP;
    protected int SP;

    public MovableThing(String imageUpFilename,
                        String imageDownFilename,
                        String imageRightFileanme,
                        String imageLeftFilename,
                        String imageBattleFilename,//a Hero-nak 5 fele kepe van, azert kell ez a constructor
                        int posX,
                        int posY,
                        String name ){
        this(imageDownFilename, posX,posY, name);  // ez meghivja az egyrszerubb constuctort
        try {
            this.imageUp = ImageIO.read(new File(imageUpFilename));
            this.imageDown = ImageIO.read(new File(imageDownFilename));
            this.imageRight = ImageIO.read(new File(imageRightFileanme));
            this.imageLeft = ImageIO.read(new File(imageLeftFilename));
            this.imageBattle = ImageIO.read(new File(imageBattleFilename));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public MovableThing(String imageFilename, int posX, int posY, String name) {
        //a skeletonnak es a bossnak egy fele kepe van egyelore, ezert kell ez a const.
        super(imageFilename, posX, posY);
        this.name = name;
        this.keyHolder = false;
    }

    abstract String getName();

    public boolean isKeyHolder() {
        return keyHolder;
    }

    public void setKeyHolder(boolean keyHolder) {
        this.keyHolder = keyHolder;
    }

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

    public void setImageBattle(){
        this.image=imageBattle;
    }
    public void setImageDown(){
        this.image=imageDown;
    }

    public void draw(Graphics graphics){
        if (image != null) {
            graphics.drawImage(image, posX * 72, posY * 72, null);
        } //kirajzolja a nyunyi kepet a tablara
    }// draw

    public void drawStats(Graphics graphics){  //azert kell kulon, mert kulon helyre kell rajzolni a karaktert med a statot
        graphics.drawString(
                getName() +  " | " +
                "HP: " + Integer.toString(HP) + " | " +
                "DP: " + Integer.toString(DP) + " | " +
                "SP: " + Integer.toString(SP) + " | "+
                "has key: " + isKeyHolder() + " | "
                ,posStatX, posStatY);
                        //        Hero (Level 1) HP: 8/10 | DP: 8 | SP: 6
    }// drawStats

//Battle
//    the attacker strikes on the defender, then the defender
// strikes and this continues until one of the characters dies
//    after a won battle if the character is a hero, it levels up


//Strike
//
//on a strike a strike value (SV) is calculated from SP and a d6 doubled
//the strike is successful if 2*d6 + SP is higher than the other
//  - character's DP
//on a successful strike the other character's HP is decreased by the SV
//  - the other character's DP

//Leveling
//
//after successfully won battle the character is leveling up
//his max HP increases by d6
//his DP increases by d6
//his SP increases by d6

    public MovableThing strike(MovableThing enemy){
        this.image = imageBattle;
        MovableThing winner = null;
//        enemy.setHP(enemy.getHP()-1); // egyszeru csatahoz

        strikeOne(this, enemy);

        if ( enemy.getHP() <= 0 ) {
            winner = this;
            this.image = imageDown;
            if ( enemy.isKeyHolder() ){
                this.setKeyHolder(true);
                enemy.setKeyHolder(false);
            }
        }else {
            strikeOne(enemy,this);

            if (this.getHP() <= 0 ){
                System.out.println("game over");
                winner = enemy;
            }
        }
        return winner;
    }// strike

    public void strikeOne(MovableThing attacker, MovableThing defender){
        int SV = 2 * d6() + attacker.getSP();
        if ( SV > defender.getDP() ){
            defender.setHP( defender.getHP()-(SV-defender.getDP()) );
        }
    }//strikeOne

    public int d6(){
        return (int) (Math.random() * (5) ) + 1;
    } //dobokocka az erokhoz
}// MovableThing
