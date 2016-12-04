import java.util.ArrayList;

/**
 * Created by zoloe on 2016. 12. 03..
 */
public class Pirate   {

    private String name;
    private int rumLevel;
    private boolean isSleeping;
    private boolean isDead;

    public Pirate(String name, int rumLevel, boolean isSleeping) {
        this.name = name;
        this.rumLevel = rumLevel;
        this.isSleeping = isSleeping;

    }

    public Pirate(String name) {
        this(name, 0, false);
    }

    protected String drinkSomeRum(){
        if (isDead) {
            return "he's dead";
        }else if (!isSleeping){
            rumLevel++;
            return " - glugh";
        }else
            return "*** is sleepin ***";
    }// drinkSomeRum

    protected String howsItGoingMate(){
        if (isDead) {
            return "he's dead";
        }else if ( rumLevel < 5 ){
            return "Pour me anudder!";
        }else {
            isSleeping = true;
            return "Arghh, I'ma Pirate. How d'ya d'ink its goin?";
        }
    }// howsItGoingMate

    public void wakeUp(){
        isSleeping = false;
        rumLevel = 0;
    }

    public void setSleeping(boolean sleeping) {
        isSleeping = sleeping;
    }

    public void die(){
        isDead = true;
    }
    public boolean getIsDead(){
        return isDead;
    }
    public boolean getIsSleeping() {
        return isSleeping;
    }

    public String getName() {
        return name;
    }

    public String brawl(Pirate otherPirate){
         String out;
        double d = Math.random();
        if ( d < 0.33333) {
            die();
            out = "the attacker " + name + " died";
        }else if ( d < 0.666666) {
            otherPirate.die();
            out =  "the other pirate " + otherPirate.getName() + " died";
        }else {
            isSleeping = true;
            otherPirate.setSleeping(true);
            out = "they both passed out";
        }
        return name + " fights " + otherPirate.name + "\n...\n" + out;
    }

    @Override
    public String toString() {
        return "Pirate{" +
                "name='" + name + '\'' +
                ", rumLevel=" + rumLevel +
                ", isSleeping=" + isSleeping +
                ", isDead=" + isDead +
                '}';
    }
    public String toStringNicely() {
        return name +
                "\n rum level: " + rumLevel +
                "\n sleepin': " + isSleeping +
                "\n dead already?: " + isDead;
    }
}// Pirate
