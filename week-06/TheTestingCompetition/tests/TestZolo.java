import groovy.transform.ThreadInterrupt;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;



/**
 * Created by zoloe on 2016. 11. 21..
 */
public class TestZolo {

    WordToolbox wSource = new WordToolbox ("Tarzan's toenails");
    WordToolbox wSource2 = new WordToolbox ("Me Tarzan, You Jane");
    @Test

    public void main() throws Exception {
        assertEquals(wSource.countHowMany('a'),3);
        assertEquals(wSource.countHowMany('T'),2);
        assertEquals(wSource.countHowMany('t'),2);
        assertEquals(wSource.countHowMany('x'),0);
        assertEquals(wSource.countHowMany(' '),1);
        assertEquals(wSource.countHowMany('z'),1);
        assertEquals(wSource.countHowMany('n'),2);
        assertEquals(wSource.countHowMany('\''),1);
        assertEquals(wSource.countHowMany('s'),2);
        assertEquals(wSource.countHowMany('o'),1);
        assertEquals(wSource.countHowMany('e'),1);
        assertEquals(wSource.countHowMany('i'),1);
        assertEquals(wSource.countHowMany('l'),1);
    }

    @Test

    public void main2() throws Exception{
        assertEquals(wSource2.countHowMany('a'),3);
        assertEquals(wSource2.countHowMany('T'),2);
        assertEquals(wSource2.countHowMany('t'),2);
        assertEquals(wSource2.countHowMany('x'),0);
        assertEquals(wSource2.countHowMany(' '),1);
    }
    // az abc betuivel egy tomb, elsoban a betu, masodikban an elofortulas


}
