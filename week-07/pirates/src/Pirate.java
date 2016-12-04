import java.util.ArrayList;

/**
 * Created by zoloe on 2016. 12. 03..
 */
public class Pirate   {

    private String name;
    private int rumLevel;
    private boolean isSleeping;

    public Pirate(String name, int rumLevel, boolean isSleeping) {
        this.name = name;
        this.rumLevel = rumLevel;
        this.isSleeping = isSleeping;
    }

    public Pirate(String name) {
        this(name, 0, false);
    }

    protected String drinkSomeRum(){
        if (!isSleeping){
            rumLevel++;
            return "glugh";
        }else
            return "*** sleepin ***";
    }// drinkSomeRum

    protected String howsItGoingMate(){
        if ( rumLevel < 5 ){
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
    public String getName() {
        return name;
    }



    @Override
    public String toString() {
        return "Pirate{" +
                "name='" + name + '\'' +
                ", rumLevel=" + rumLevel +
                ", isSleeping=" + isSleeping +
                '}';
    }
}// Pirate
