import music.StringedInstrument;

/**
 * Created by zoloe on 2016. 11. 16..
 */
public class ElectricBassGuitar extends StringedInstrument{
    public ElectricBassGuitar(int numberOfStrings) {
        this.numberOfStrings=numberOfStrings;
    }

    public ElectricBassGuitar() {
        this(4);
    }

    public void play(){
        System.out.println(String.format(formatForPlay,this.getClass().getSimpleName(),this.numberOfStrings,"Duum-duum-duum"));
    }

 }
