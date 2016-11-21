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

        Ws2ArrayList myWs2 = new Ws2ArrayList();
        ArrayList<Integer> myIntList = new ArrayList(Arrays.asList(1,5,7,8));
        myWs2.setMyIntList(myIntList);
        Integer sum2 = 0;
        for (Integer i :
                myIntList) {
            sum2 = sum2 + i;
        }

        assertEquals(sum2, myWs2.Sum(myIntList));
    }

}