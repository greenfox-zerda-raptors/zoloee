import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by zoloe on 2016. 11. 21..
 */
public class Ws2ArrayListTest {
    @Test
    public void sum() throws Exception {
        ArrayList<Integer> myIntList = new ArrayList(Arrays.asList(1,5,7,8));
        assertEquals(21,sum());
    }

}