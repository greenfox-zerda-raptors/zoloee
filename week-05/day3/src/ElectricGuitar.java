import music.StringedInstrument;
import music.Instrument1;
/**
 * Created by zoloe on 2016. 11. 16..
 */

public class ElectricGuitar extends StringedInstrument {

    public ElectricGuitar(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;this.sound = "Twang";
    }

    public ElectricGuitar(){
        this(6);
    }



}
