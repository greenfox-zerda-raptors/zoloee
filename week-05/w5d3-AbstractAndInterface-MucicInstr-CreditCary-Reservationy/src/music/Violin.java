package music;

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
        this.sound = "screech";
    }


}
