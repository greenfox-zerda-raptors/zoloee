import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zoloe on 2016. 11. 21..
 */
public class TestZolo {
    WordToolbox wSource = new WordToolbox ("Tarzan's toenails");

    @Test
    public void main() throws Exception {
        assertEquals(wSource.countHowMany('a'),3);
        assertEquals(wSource.countHowMany('T'),2);
        assertEquals(wSource.countHowMany('t'),2);
        assertEquals(wSource.countHowMany('x'),0);
        assertEquals(wSource.countHowMany(' '),1);
    }

}
