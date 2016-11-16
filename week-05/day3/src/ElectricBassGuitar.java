import music.StringedInstrument;

/**
 * Created by zoloe on 2016. 11. 16..
 */
public class ElectricBassGuitar extends StringedInstrument{
    public ElectricBassGuitar(int numberOfStrings) {
        this.numberOfStrings=numberOfStrings;
        this.sound = "Duum-duum-duum";
    }
    public ElectricBassGuitar() {
        this(4);
    }
 }
