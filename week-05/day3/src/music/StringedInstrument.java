package music;

/**
 * Created by zoloe on 2016. 11. 16..
 */
abstract public class StringedInstrument extends Instrument1{
    public int numberOfStrings;
    protected final String formatForPlay = "%s, a %d-stringed instrument that %s\n";


    public abstract void play();
}
