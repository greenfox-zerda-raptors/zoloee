package music;

/**
 * Created by zoloe on 2016. 11. 16..
 */
abstract public class StringedInstrument extends Instrument1{
    public int numberOfStrings;
    public String sound;
    final String formatForPlay = "%s, a %d-stringed instrument that %s\n";


    public void play(){
        System.out.printf(formatForPlay, name, numberOfStrings, sound);
    };


}
