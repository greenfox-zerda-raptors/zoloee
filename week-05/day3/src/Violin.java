import music.StringedInstrument;

/**
 * Created by zoloe on 2016. 11. 16..
 */
public class Violin extends StringedInstrument {

    public Violin() {
        this(4);
    }

    public Violin(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public void play(){
        System.out.println(String.format(formatForPlay,this.getClass().getSimpleName(),this.numberOfStrings,"Screech"));
    }
}
