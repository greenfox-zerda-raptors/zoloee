import music.StringedInstrument;
import music.Instrument1;
/**
 * Created by zoloe on 2016. 11. 16..
 */

public class ElectricGuitar extends StringedInstrument {

    public ElectricGuitar(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public ElectricGuitar(){
        this(6);
    }

    @Override
    public void play(){
        System.out.println(String.format(formatForPlay,this.getClass().getSimpleName(),this.numberOfStrings,"twangs"));
    }

}
